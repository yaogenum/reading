package com.personal.yaoge.mybatis.service.inter.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personal.yaoge.mybatis.dao.user.dao.inter.UsersDao;
import com.personal.yaoge.mybatis.model.entity.UsersDO;
import com.personal.yaoge.mybatis.service.inter.UsersService;

/**
 * 类UsersServiceImpl.java的实现描述：users 服务类
 * 
 * @author yaoge 2015年4月13日 下午10:07:08
 */
@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersDao usersDao;

    public UsersDO loadByName(String usersName) {
        return usersDao.loadByName(usersName);
    }

    public Integer create(UsersDO usersDO) {
        return usersDao.create(usersDO);
    }

}
