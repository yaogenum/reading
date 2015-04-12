package com.personal.yaoge.dao.user.dao.impl;

import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.personal.yaoge.dao.user.dao.UserDao;
import com.personal.yaoge.model.entity.UserDO;

/**
 * 类UserDaoImpl.java的实现描述：userdao imple
 * 
 * @author yaoge 2015年4月6日 下午11:11:45
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao<UserDO> {

    @Autowired
    private SessionFactory sessionFactory;

    private Session        session;

    public UserDO save(UserDO o) {
        session = sessionFactory.getCurrentSession();
        session.save(o);
        return o;
    }

    public UserDO loadByName(String usersName) {
        session = sessionFactory.getCurrentSession();
        SQLQuery loadUserDO = session.createSQLQuery("select distinct * from users where users_name = 'yaoge22' ").addEntity(UserDO.class);
        //loadUserDO.setParameter(0, usersName);
        @SuppressWarnings("unchecked")
        ArrayList<UserDO> users = (ArrayList<UserDO>) loadUserDO.list();
        if (null != users) {
            if (users.size() > 1) return users.get(0);
        }
        return null;
    }


}
