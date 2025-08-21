package com.chenjiacheng.gatekey.service;

import com.chenjiacheng.gatekey.controller.model.response.LoginResp;

public interface AuthService {
    /**
     * 登录
     *
     * @param username 用户名
     * @param password 密码
     * @return 登录结果
     */
    LoginResp login(String username, String password);
}
