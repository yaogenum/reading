package com.personal.yaoge.mybatis.dao.user.dao.inter;

import com.personal.yaoge.mybatis.model.entity.UsersDO;

/**
 * 类UsersDao.java的实现描述：user opt
 * 
 * @author yaoge 2015年4月13日 下午3:41:45
 */
public interface UsersDao {

    public UsersDO loadByName(String usersName);

    public Integer create(UsersDO usersDO);
}
