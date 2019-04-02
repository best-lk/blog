package com.lk.blog.req;

/**
 *  分页参数请求对象
 * @author Administrator
 *
 */
public abstract class AbstractPageRequestParam {
	
	private int pageNum;
	
	private int pageSize;

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
}
