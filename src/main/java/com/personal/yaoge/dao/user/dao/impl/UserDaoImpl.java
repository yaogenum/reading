package com.personal.yaoge.dao.user.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.personal.yaoge.dao.user.dao.UserDao;
import com.personal.yaoge.model.entity.User;

/**
 * 
 * 类UserDaoImpl.java的实现描述：userdao imple
 * @author yaoge 2015年4月6日 下午11:11:45
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao<User>{
    @Autowired
    private SessionFactory sessionFactory;
    
    public User save(User o) {
        Session session = sessionFactory.getCurrentSession();
        session.save(o);
        return o;
      }
}












