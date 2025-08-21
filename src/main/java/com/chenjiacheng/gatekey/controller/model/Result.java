package com.chenjiacheng.gatekey.controller.model;

/**
 * 通用返回对象
 * @param <T> 数据负载类型
 */
public class Result<T> {
    private String code;   // "0"=成功  其他=失败
    private String msg;
    private T data;

    /* ---------- 静态构造 ---------- */
    public static <T> Result<T> ok() {
        return new Result<>("0", "success", null);
    }
    public static <T> Result<T> ok(T data) {
        return new Result<>("0", "success", data);
    }
    public static <T> Result<T> ok(String msg, T data) {
        return new Result<>("0", msg, data);
    }
    public static <T> Result<T> fail(String msg) {
        return new Result<>("1", msg, null);
    }
    public static <T> Result<T> fail(String code, String msg) {
        return new Result<>(code, msg, null);
    }

    /* ---------- 构造/get/set ---------- */
    public Result() {}
    public Result(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
    /* getter/setter 省略 */

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}