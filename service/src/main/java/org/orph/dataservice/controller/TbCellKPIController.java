package org.orph.dataservice.controller;


import com.alibaba.excel.EasyExcel;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.orph.commonutils.Response;
import org.orph.dataservice.entity.TbCellKPI;
import org.orph.dataservice.service.TbCellKPIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author machenxiang
 * @since 2022-04-17
 */
@RestController
@RequestMapping("/dataservice/tb-cell-kpi")
@CrossOrigin
public class TbCellKPIController {

    @Autowired
    TbCellKPIService tbCellKPIService;

    @PostMapping("upload")
    public Response upload(MultipartFile file) {
        tbCellKPIService.saveTbCellKPI(file);
        return Response.ok();
    }

    @GetMapping("export")
    public void export(HttpServletResponse response, String filename) {
        try {
            List<TbCellKPI> tbCellKPIList = tbCellKPIService.list(null);
            response.setContentType("application/vnd.ms-excel");
            response.setCharacterEncoding("utf-8");
            response.setHeader("Content-disposition", "attachment;filename=" + filename + ".xlsx");
            // 这里需要设置不关闭流
            EasyExcel.write(response.getOutputStream(), TbCellKPI.class).autoCloseStream(Boolean.FALSE).sheet("tbCellkpi").doWrite(tbCellKPIList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @GetMapping("sectorList")
    public Response sectorList() {
        QueryWrapper<TbCellKPI> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("distinct SECTOR_NAME");
        List<TbCellKPI> tbCellKPIList = tbCellKPIService.list(queryWrapper);
        List<String> list = new ArrayList<>();
        for (TbCellKPI i : tbCellKPIList) {
            list.add(i.getSectorName());
        }
        return Response.ok().data("list", list);
    }

    @GetMapping("info")
    public Response info(String sectorName, String beginTime, String endTime) {
        QueryWrapper<TbCellKPI> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("SECTOR_NAME", sectorName)
                .between("StartTime", beginTime, endTime);
        List<TbCellKPI> tbCellKPIList = tbCellKPIService.list(queryWrapper);
        for (TbCellKPI i : tbCellKPIList) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(i.getStartTime());
            calendar.add(Calendar.HOUR, 8);
            i.setStartTime(calendar.getTime());
        }
        return Response.ok().data("info", tbCellKPIList);
    }
}

