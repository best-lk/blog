package com.lk.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lk.blog.constant.ResultCodeConstant;
import com.lk.blog.model.AccountUser;
import com.lk.blog.req.UpdateUserPasswordReq;
import com.lk.blog.res.ResultResponse;
import com.lk.blog.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api("用户相关接口")
@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	/**
	 * 用户注册
	 * @author likai
	 * 2019年4月2日
	 * @param user
	 * @return
	 */
	@ApiOperation("用户注册")
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ResultResponse<String> userRegister(@RequestBody AccountUser user) {
		if(StringUtils.isEmpty(user.getTelNumber())) {
			return new ResultResponse<>(ResultCodeConstant.FAILD, "电话号码为空！");
		}
		if(StringUtils.isEmpty(user.getPassword())) {
			return new ResultResponse<>(ResultCodeConstant.FAILD, "密码为空！");
		}
		return userService.userRegiste(user);
	}
	
	/**
	 * 用户登录
	 * @author likai
	 * 2019年4月2日
	 * @param user
	 * @return
	 */
	@ApiOperation("用户登录")
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ResultResponse<AccountUser> userLogin(@RequestBody AccountUser user) {
		if(StringUtils.isEmpty(user.getTelNumber())) {
			return new ResultResponse<>(ResultCodeConstant.FAILD, "电话号码为空！");
		}
		if(StringUtils.isEmpty(user.getPassword())) {
			return new ResultResponse<>(ResultCodeConstant.FAILD, "密码为空！");
		}
		return userService.userLogin(user);
	}
	
	/**
	 * 修改密码
	 * @author likai
	 * 2019年4月2日
	 * @param req
	 * @return
	 */
	@ApiOperation("用户修改密码")
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ResultResponse<String> updatePassword(@RequestBody UpdateUserPasswordReq req) {
		if(StringUtils.isEmpty(req.getNewPassword())) {
			return new ResultResponse<>(ResultCodeConstant.FAILD, "新密码为空！");
		}
		if(StringUtils.isEmpty(req.getOldPassword())) {
			return new ResultResponse<>(ResultCodeConstant.FAILD, "旧密码为空！");
		}
		if(req.getUserId() == null) {
			return new ResultResponse<>(ResultCodeConstant.FAILD, "用户id为空！");
		}
		return userService.updateUserPassword(req);
	}
	
	
}
