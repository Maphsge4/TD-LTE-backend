package org.orph.dataservice.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.orph.commonutils.Response;
import org.orph.dataservice.entity.TbPRB;
import org.orph.dataservice.entity.TbPRBnew;
import org.orph.dataservice.service.TbPRBnewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

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
@RequestMapping("/dataservice/tb-prbnew")
@CrossOrigin
public class TbPRBnewController {

    @Autowired
    TbPRBnewService tbPRBnewService;

    @GetMapping("info")
    public Response prbInfo(String sectorName, String beginTime, String endTime) {
        QueryWrapper<TbPRBnew> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("SECTOR_NAME", sectorName)
                .between("StartTime", beginTime, endTime);
        List<TbPRBnew> tbPRBnewList = tbPRBnewService.list(queryWrapper);
        for (TbPRBnew i : tbPRBnewList) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(i.getStartTime());
            calendar.add(Calendar.HOUR, 8);
            i.setStartTime(calendar.getTime());
        }
        return Response.ok().data("info", tbPRBnewList);
    }
}

