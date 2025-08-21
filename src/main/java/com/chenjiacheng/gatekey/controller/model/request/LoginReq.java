package com.chenjiacheng.gatekey.controller.model.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class LoginReq implements Serializable {
    private String username;
    private String password;

}
