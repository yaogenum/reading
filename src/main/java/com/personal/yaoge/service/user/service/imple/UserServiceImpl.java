package com.personal.yaoge.service.user.service.imple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.personal.yaoge.dao.user.dao.UserDao;
import com.personal.yaoge.model.entity.User;
import com.personal.yaoge.service.user.service.UserService;

/**
 * 
 * 类UserServiceImpl.java的实现描述：用户服务实现
 * @author yaoge 2015年4月6日 下午11:19:27
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao<User> userDao;
    public User save(User user) {
        return userDao.save(user);
    }
}
