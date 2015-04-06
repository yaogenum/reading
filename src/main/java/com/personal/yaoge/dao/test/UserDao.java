package com.personal.yaoge.dao.test;

import com.personal.yaoge.model.test.User;

public interface UserDao<T> {
	public User save(T o);

}