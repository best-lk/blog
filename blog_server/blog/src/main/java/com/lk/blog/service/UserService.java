package com.lk.blog.service;

import com.lk.blog.model.AccountUser;
import com.lk.blog.req.UpdateUserPasswordReq;
import com.lk.blog.res.ResultResponse;

/**
 * 用户服务
 * @author Administrator
 *
 */
public interface UserService {
	
	/**
	 * 用户注册
	 * @param user
	 * @return
	 */
	public ResultResponse<String> userRegiste(AccountUser user);
	
	/**
	 * 用户登录
	 * @param user
	 * @return
	 */
	public ResultResponse<AccountUser> userLogin(AccountUser user);
	
	/**
	 * 修改密码
	 * @param req
	 * @return
	 */
	public ResultResponse<String> updateUserPassword(UpdateUserPasswordReq req);
	
	/**
	 * 修改个人信息
	 * @author likai
	 * 2019年4月2日
	 * @param user
	 * @return
	 */
	public ResultResponse<String> updateUserInfo(AccountUser user);
}
