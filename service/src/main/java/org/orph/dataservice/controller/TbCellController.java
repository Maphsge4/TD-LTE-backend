package org.orph.dataservice.controller;


import com.alibaba.excel.EasyExcel;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.orph.commonutils.Response;
import org.orph.dataservice.entity.TbCell;
import org.orph.dataservice.service.TbCellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
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
@RequestMapping("/dataservice/tb-cell")
@CrossOrigin
public class TbCellController {

    @Autowired
    TbCellService tbCellService;

    @PostMapping("upload")
    public Response upload(MultipartFile file) {
        tbCellService.saveTbCell(file);
        return Response.ok();
    }

    @GetMapping("export")
    public void export(HttpServletResponse response, String filename) {
        try {
            List<TbCell> tbCellList = tbCellService.list(null);
            response.setContentType("application/vnd.ms-excel");
            response.setCharacterEncoding("utf-8");
            response.setHeader("Content-disposition", "attachment;filename=" + filename + ".xlsx");
            // 这里需要设置不关闭流
            EasyExcel.write(response.getOutputStream(), TbCell.class).autoCloseStream(Boolean.FALSE).sheet("tbCell").doWrite(tbCellList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @GetMapping("sectorInfo")
    public Response sectorInfo(String sectorId, String sectorName, Integer eNodeBID) {
        if (sectorId == null && sectorName == null && eNodeBID == null) {
            return Response.fail().message("Set one condition at least.");
        }
        QueryWrapper<TbCell> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("SECTOR_ID", sectorId)
                .or().eq("SECTOR_NAME", sectorName)
                .or().eq("ENODEBID", eNodeBID);
        List<TbCell> tbCellList = tbCellService.list(queryWrapper);
        return Response.ok().data("sectorInfo", tbCellList);
    }

    @GetMapping("sectorNameList")
    public Response sectorNameList() {
        QueryWrapper<TbCell> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("SECTOR_NAME");
        List<TbCell> tbCellList = tbCellService.list(queryWrapper);
        List<String> sectorList = new ArrayList<>();
        for (TbCell i : tbCellList) {
            sectorList.add(i.getSectorName());
        }
        return Response.ok().data("sectorName", sectorList);
    }

    @GetMapping("eNodeBList")
    public Response eNodeBList() {
        QueryWrapper<TbCell> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("distinct ENODEBID, ENODEB_NAME");
        List<TbCell> tbCellList = tbCellService.list(queryWrapper);
        List<String> eNodeBList = new ArrayList<>();
        for (TbCell i : tbCellList) {
            eNodeBList.add(i.getEnodebid() + ":" + i.getEnodebName());
        }
        return Response.ok().data("eNodeBList", eNodeBList);
    }
}

