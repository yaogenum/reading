package com.personal.yaoge.service.user.service;

import com.personal.yaoge.model.entity.User;

/**
 * 
 * 类UserService.java的实现描述：用户基础服务调用
 * @author yaoge 2015年4月6日 下午11:00:23
 */
public interface UserService {
    /**
     * save user
     * @param user
     * @return
     */
    public User save(User user);
}
