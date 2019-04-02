package com.lk.blog.req;

/**
 *  修改密码参数对象
 * @author likai
 * 2019年4月2日
 */
public class UpdateUserPasswordReq {
	
	private String oldPassword;
	
	private String newPassword;
	
	private Integer userId;

	public String getOldPassword() {
		return oldPassword;
	}

	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}
}
