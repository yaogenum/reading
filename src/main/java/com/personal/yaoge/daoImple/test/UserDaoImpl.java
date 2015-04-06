package com.personal.yaoge.daoImple.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.personal.yaoge.dao.test.UserDao;
import com.personal.yaoge.model.test.User;

@Repository("userDao")
public class UserDaoImpl implements UserDao<User> {

  @Autowired
  private SessionFactory sessionFactory;

  //
  // public void setSessionFactory(SessionFactory sessionFactory) {
  // this.sessionFactory = sessionFactory;
  // }
  //
  // public SessionFactory getSessionFactory() {
  // return sessionFactory;
  // }

  public User save(User o) {
    Session session = sessionFactory.getCurrentSession();
    session.save(o);
    return o;
  }

}