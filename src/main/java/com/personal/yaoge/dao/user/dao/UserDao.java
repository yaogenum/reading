package com.personal.yaoge.dao.user.dao;

import com.personal.yaoge.model.entity.User;

/**
 * 
 * 类UserDao.java的实现描述：dao层 db操作
 * @author yaoge 2015年4月6日 下午11:05:23
 */
public interface UserDao<T> {
    /**
     * save user
     * @param t
     * @return
     */
    public User save(T t) ; 
}
