package com.chenjiacheng.gatekey.service.impl;

import com.chenjiacheng.gatekey.controller.model.response.LoginResp;
import com.chenjiacheng.gatekey.service.AuthService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AuthServiceImpl implements AuthService {

    @Override
    public LoginResp login(String username, String password) {
        return null;
    }
}
