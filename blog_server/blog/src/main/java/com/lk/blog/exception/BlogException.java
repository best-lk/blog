package com.lk.blog.exception;

/**
 * 自定义异常
 * @author likai
 * 2019年4月2日
 */
public class BlogException extends RuntimeException{

	private static final long serialVersionUID = -4276473607540247599L;

	public BlogException() {
		super();
	}

	public BlogException(String message) {
		super(message);
	}
}
