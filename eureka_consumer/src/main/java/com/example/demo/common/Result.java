package com.example.demo.common;

import java.io.Serializable;

public class Result implements Serializable {

	private static final long serialVersionUID = 1L;
	private String code;
	private String msg;
	private Object data;

	public Result(String code, String msg, Object data) {
		super();
		this.code = code;
		this.msg = msg;
		this.data = data;
	}

	public Result(String code, String msg) {
		super();
		this.code = code;
		this.msg = msg;
	}

	public static Result s(Object object) {
		return new Result(StatusCode.SUCCESS.getValue(), StatusCode.SUCCESS.getMsg(), object);
	}

	public Result f(Object object) {
		return new Result(StatusCode.FAIL.getValue(), StatusCode.FAIL.getMsg(), object);
	}

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

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
}
