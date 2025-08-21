package com.chenjiacheng.gatekey.controller;

import com.chenjiacheng.gatekey.controller.model.Result;
import com.chenjiacheng.gatekey.controller.model.request.LoginReq;
import com.chenjiacheng.gatekey.controller.model.response.LoginResp;
import com.chenjiacheng.gatekey.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/login")
    public Result<LoginResp> login(@Valid @RequestBody LoginReq req) {
        return Result.ok(authService.login(req.getUsername(), req.getPassword()));
    }


}