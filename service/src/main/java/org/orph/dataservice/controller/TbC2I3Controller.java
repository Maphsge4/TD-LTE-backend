package org.orph.dataservice.controller;


import org.orph.commonutils.Response;
import org.orph.dataservice.entity.TbC2I3;
import org.orph.dataservice.entity.TbC2Inew;
import org.orph.dataservice.service.TbC2I3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

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
@RequestMapping("/dataservice/tb-c2-i3")
@CrossOrigin
public class TbC2I3Controller {

    @Autowired
    TbC2I3Service tbC2I3Service;

    @GetMapping("show")
    public Response show() {
        List<TbC2I3> tbC2I3List = tbC2I3Service.list(null);
        return Response.ok().data("result", tbC2I3List);
    }

}

