package com.lk.blog.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lk.blog.constant.ResultCodeConstant;
import com.lk.blog.mapper.AccountUserMapper;
import com.lk.blog.model.AccountUser;
import com.lk.blog.req.UpdateUserPasswordReq;
import com.lk.blog.res.ResultResponse;
import com.lk.blog.service.UserService;
import com.lk.blog.util.MD5Util;

/**
 *  用户服务
 * @author likai
 * 2019年4月2日
 */
@Service("UserService")
public class UserServiceImpl implements UserService {

	/**
	 * 用户数据接口
	 */
	@Resource
	private AccountUserMapper accountUserMapper;
	
	/**
	 * 用户注册
	 */
	@Override
	public ResultResponse<String> userRegiste(AccountUser user) {
		//检查用户手机号是否注册过
		AccountUser existUser = accountUserMapper.selectByTelPhonenumber(user.getTelNumber());
		if(existUser != null) {
			return new ResultResponse<String>(ResultCodeConstant.FAILD, "改手机号已注册！");
		}
		//密码加密
		user.setPassword(MD5Util.encode(user.getPassword()));
		int insertCount = accountUserMapper.insertSelective(user);
		if(insertCount > 0) {
			return new ResultResponse<String>(ResultCodeConstant.SUCCESS, "注册成功！");
		}else {
			return new ResultResponse<String>(ResultCodeConstant.FAILD, "注册失败！");
		}
	}

	/**
	 * 用户登录
	 */
	@Override
	public ResultResponse<AccountUser> userLogin(AccountUser user) {
		AccountUser userInfo = accountUserMapper.selectByTelPhonenumber(user.getTelNumber());
		if(userInfo == null) {
			return new ResultResponse<>(ResultCodeConstant.FAILD, "账户不存在！");
		}
		String pagePassword = MD5Util.encode(user.getPassword());
		if(!pagePassword.equals(userInfo.getPassword())) {
			return new ResultResponse<>(ResultCodeConstant.FAILD, "密码错误！");
		}
		ResultResponse<AccountUser> result = new ResultResponse<>(ResultCodeConstant.SUCCESS, "登录成功！");
		result.setData(userInfo);
		return result;
	}

	/**
	 * 修改密码
	 */
	@Override
	public ResultResponse<String> updateUserPassword(UpdateUserPasswordReq req) {
		AccountUser userInfo = accountUserMapper.selectByPrimaryKey(req.getUserId());
		String md5OldPassword = MD5Util.encode(req.getOldPassword());
		if(!md5OldPassword.equals(userInfo.getPassword())) {
			return new ResultResponse<>(ResultCodeConstant.FAILD, "原密码错误！");
		}
		req.setNewPassword(MD5Util.encode(req.getNewPassword()));
		int updateCount = accountUserMapper.updatePassword(req);
		if(updateCount > 0) {
			return new ResultResponse<String>(ResultCodeConstant.SUCCESS, "修改成功！");
		}else {
			return new ResultResponse<String>(ResultCodeConstant.FAILD, "修改失败！");
		}
	}

	/**
	 * 修改个人信息
	 */
	@Override
	public ResultResponse<String> updateUserInfo(AccountUser user) {
		return null;
	}

}
