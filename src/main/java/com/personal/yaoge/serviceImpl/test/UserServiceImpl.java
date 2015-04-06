package com.personal.yaoge.serviceImpl.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.personal.yaoge.dao.test.UserDao;
import com.personal.yaoge.model.test.User;
import com.personal.yaoge.service.test.UserService;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
  @Autowired
  private UserDao<User> userDao;


  public User save(User user) {
    // TODO Auto-generated method stub
    return userDao.save(user);
  }


}