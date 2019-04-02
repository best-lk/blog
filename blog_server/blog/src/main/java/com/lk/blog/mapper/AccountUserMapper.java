package com.lk.blog.mapper;

import org.apache.ibatis.annotations.Param;

import com.lk.blog.model.AccountUser;
import com.lk.blog.req.UpdateUserPasswordReq;

public interface AccountUserMapper {
    int insert(AccountUser record);

    int insertSelective(AccountUser record);

    AccountUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AccountUser record);

    int updateByPrimaryKey(AccountUser record);

    /**
     *  检查手机号是否注册过
     * @author likai
     * 2019年4月2日
     * @param telNumber
     * @return
     */
	AccountUser selectByTelPhonenumber(@Param("telNumber") String telNumber);

	/**
	 * 修改密码
	 * @author likai
	 * 2019年4月2日
	 * @param req
	 * @return
	 */
	int updatePassword(UpdateUserPasswordReq req);
}