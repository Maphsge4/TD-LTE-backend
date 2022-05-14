package org.orph.dataservice.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import javafx.util.Pair;
import org.apache.poi.ss.formula.functions.T;
import org.orph.commonutils.Response;
import org.orph.dataservice.entity.TbC2I3;
import org.orph.dataservice.entity.TbC2Inew;
import org.orph.dataservice.service.TbC2I3Service;
import org.orph.dataservice.service.TbC2InewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author dylanhz
 * @since 2021-06-15
 */
@RestController
@RequestMapping("/dataservice/tb-c2-inew")
@CrossOrigin
public class TbC2InewController {

    @Autowired
    TbC2InewService tbC2InewService;

    @Autowired
    TbC2I3Service tbC2I3Service;

    @PostMapping("analyzeTriple")
    public Response analyzeTriple(Integer min) {

        tbC2I3Service.remove(null);

        float minf = min.floatValue() / 100;
        QueryWrapper<TbC2Inew> queryWrapper = new QueryWrapper<>();
        queryWrapper.ge("PrbABS6", minf);
        List<TbC2Inew> tbC2InewList = tbC2InewService.list(queryWrapper);

        HashSet<Pair<String, String>> set = new HashSet<>();

        for (TbC2Inew i : tbC2InewList) {
            String first;
            String second;
            if (i.getScell().compareTo(i.getNcell()) < 0) {
                first = i.getScell();
                second = i.getNcell();
            } else {
                first = i.getNcell();
                second = i.getScell();
            }

            TbC2I3 tbC2I3 = new TbC2I3();

            for (Pair<String, String> j : set) {
                if (first.equals(j.getValue())) {
                    if (set.contains(new Pair<>(j.getKey(), second))) {
                        tbC2I3.setSector1(j.getKey())
                                .setSector2(first)
                                .setSector3(second);
                        tbC2I3Service.save(tbC2I3);
                    }
                } else if (second.equals(j.getKey())) {
                    if (set.contains(new Pair<>(first, j.getValue()))) {
                        tbC2I3.setSector1(first)
                                .setSector2(second)
                                .setSector3(j.getValue());
                        tbC2I3Service.save(tbC2I3);
                    }
                }
            }
            set.add(new Pair<>(first, second));
        }
        return Response.ok();
    }

    @GetMapping("show")
    public Response show() {
        List<TbC2Inew> tbC2InewList = tbC2InewService.list(null);
        return Response.ok().data("result", tbC2InewList);
    }
}

