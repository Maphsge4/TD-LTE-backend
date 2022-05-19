package org.orph.dataservice.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import org.orph.commonutils.Response;
import org.orph.dataservice.entity.Account;
import org.orph.dataservice.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
@RequestMapping("/dataservice/account")
@CrossOrigin
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping("login")
    public Response login(String username, String password) {
        if (username == null || username.length() == 0
                || password == null || password.length() == 0) {
            return Response.fail().message("Username or password can't be empty.");
        }

        QueryWrapper<Account> wrapper = new QueryWrapper<>();
        wrapper.eq("username", username);
        int res = accountService.count(wrapper);
        if (1 == res) {
            Account account = accountService.getOne(wrapper);
            if (password.equals(account.getPassword())) {
                if (account.getType() == 0) {
                    return Response.ok().message("Admin");
                } else if (account.getVerification() == 1) {
                    return Response.ok().message("User");
                } else {
                    return Response.fail().message("Account unapproved.");
                }
            } else {
                return Response.fail().message("Wrong password.");
            }
        } else {
            return Response.fail().message("No such Account.");
        }
    }

    @PostMapping("register")
    public Response register(String username, String password) {
        if (username == null || username.length() == 0
                || password == null || password.length() == 0) {
            return Response.fail().message("Username or password can't be empty.");
        }

        QueryWrapper<Account> wrapper = new QueryWrapper<>();
        wrapper.eq("username", username);
        int res = accountService.count(wrapper);
        if (0 == res) {
            Account account = new Account();
            account.setUsername(username)
                    .setPassword(password)
                    .setType(1)
                    .setVerification(0);
            accountService.save(account);
            return Response.ok();
        } else {
            return Response.fail().message("Username already exists.");
        }
    }

    @GetMapping("accountList")
    public Response accountList() {
        List<Account> accountList = accountService.list(null);
        return Response.ok().data("list", accountList);
    }

    @PostMapping("verify")
    public Response verify(String username) {
        QueryWrapper<Account> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", username);
        Account account = accountService.getOne(queryWrapper);
        if (account == null) {
            return Response.fail().message("No such Account.");
        } else {
            account.setVerification(1);
            accountService.updateById(account);
            return Response.ok();
        }
    }

    @DeleteMapping("delete")
    public Response delAccount(String username) {
        QueryWrapper<Account> wrapper = new QueryWrapper<>();
        wrapper.eq("username", username);
        boolean res = accountService.remove(wrapper);
        if (res) {
            return Response.ok();
        } else {
            return Response.fail().message("No such Account.");
        }
    }
}

