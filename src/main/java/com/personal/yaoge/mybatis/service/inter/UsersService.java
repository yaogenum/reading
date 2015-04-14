package com.personal.yaoge.mybatis.service.inter;

import com.personal.yaoge.mybatis.model.entity.UsersDO;

/**
 * 类UsersService.java的实现描述：interface user opt
 * 
 * @author yaoge 2015年4月13日 下午10:07:37
 */
public interface UsersService {

    public UsersDO loadByName(String usersName);

    public Integer create(UsersDO usersDO);
}
