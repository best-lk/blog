package com.lk.blog.res;

/**
 *  统一的返回体结构
 * @author Administrator
 *
 * @param <T>
 */
public class ResultResponse<T> {
	
	//状态码  0:失败  1：成功
	private int code;
	
	//返回的具体信息描述
	private String info;
	
	//返回的数据
	private T data;
	
	public ResultResponse(int code, String info) {
		super();
		this.code = code;
		this.info = info;
	}
	
	public ResultResponse(int code) {
		super();
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
