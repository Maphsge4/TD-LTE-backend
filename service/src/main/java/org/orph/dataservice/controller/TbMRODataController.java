package org.orph.dataservice.controller;


import com.alibaba.excel.EasyExcel;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.apache.commons.math3.distribution.NormalDistribution;
import org.orph.commonutils.Response;
import org.orph.dataservice.entity.TbC2Inew;
import org.orph.dataservice.entity.TbCellKPI;
import org.orph.dataservice.entity.TbMROData;
import org.orph.dataservice.service.TbC2InewService;
import org.orph.dataservice.service.TbMRODataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
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
@RequestMapping("/dataservice/tb-mro-data")
@CrossOrigin
public class TbMRODataController {

    @Autowired
    TbMRODataService tbMRODataService;

    @Autowired
    TbC2InewService tbC2InewService;

    @PostMapping("analayzeC2I")
    public Response analyzeC2I(Integer min) {

        tbC2InewService.remove(null);

        QueryWrapper<TbMROData> queryWrapper = new QueryWrapper<>();
        queryWrapper.groupBy("ServingSector", "InterferingSector")
                .select("ServingSector, InterferingSector, ifnull(avg(rsrpDiff), 0) as avgDiff, ifnull(stddev(rsrpDiff), 0) as stdDiff, ifnull(count(*), 0) as count");
        List<TbMROData> tbMRODataList = tbMRODataService.list(queryWrapper); // 这一行就是会在console里输出SQL结果

        for (TbMROData i : tbMRODataList) {
            if (i.getCount() >= min && i.getStdDiff() != 0) {

                NormalDistribution normalDistribution = new NormalDistribution(i.getAvgDiff(), i.getStdDiff());

                TbC2Inew tbC2Inew = new TbC2Inew();
                tbC2Inew.setScell(i.getServingSector())
                        .setNcell(i.getInterferingSector())
                        .setC2iMean(i.getAvgDiff())
                        .setStd(i.getStdDiff())
                        .setPrC2I9((float) normalDistribution.cumulativeProbability(9))
                        .setPrbABS6((float) normalDistribution.cumulativeProbability(-6, 6));

                tbC2InewService.save(tbC2Inew);
            }
        }
        return Response.ok();
    }

    @PostMapping("upload")
    public Response upload(MultipartFile file) {
        tbMRODataService.saveTbMROData(file);
        return Response.ok();
    }

    @GetMapping("export")
    public void export(HttpServletResponse response, String filename) {
        try {
            List<TbMROData> tbMRODataList = tbMRODataService.list(null);
            response.setContentType("application/vnd.ms-excel");
            response.setCharacterEncoding("utf-8");
            response.setHeader("Content-disposition", "attachment;filename=" + filename + ".xlsx");
            // 这里需要设置不关闭流
            EasyExcel.write(response.getOutputStream(), TbMROData.class).autoCloseStream(Boolean.FALSE).sheet("tbMROData").doWrite(tbMRODataList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

