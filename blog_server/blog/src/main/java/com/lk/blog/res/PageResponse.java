package com.lk.blog.res;

import java.util.List;

/**
 *  分页结果的封装
 * @author Administrator
 *
 */
public class PageResponse<T> {
	
	//状态码  0:失败  1：成功
	private int code;
	
	//返回的具体信息描述
	private int info;
	
	//总条数
	private long total;
	
	//总页数
	private int pages;
	
	//页码
	private int pageNum;
	
	//每页大小
	private int pageSize;
	
	//分页数据
	private List<T> data;

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public int getInfo() {
		return info;
	}

	public void setInfo(int info) {
		this.info = info;
	}
}
