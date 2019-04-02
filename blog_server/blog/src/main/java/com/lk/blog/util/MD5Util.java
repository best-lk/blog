package com.lk.blog.util;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.util.StringUtils;

import com.lk.blog.exception.BlogException;

/**
 * md5加密工具
 * @author likai
 * 2019年4月2日
 */
public class MD5Util {
	
	/**
	 * 将字符串进行MD5加密
	 * @author likai
	 * 2019年4月2日
	 * @param str
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
	public static String encode(String str) {
		if(StringUtils.isEmpty(str)) {
			throw new BlogException("MD5加密字符串为空！");
		}
		return DigestUtils.md5Hex(str);
	}
	
	public static void main(String[] args) {
		System.out.println(encode("123456"));
	}
}
