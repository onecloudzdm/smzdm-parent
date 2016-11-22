package com.wq.smzdm.dao.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.wq.smzdm.dao.UserDao;
import com.wq.smzdm.model.User;
@Repository
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {
	
	String ns = "com.wq.smzdm.sqlMap.UserMapper.";
	public void saveUser(User user) {
		this.getSqlSession().insert(ns+"insert", user);
	}

	public User getUserById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateUser(User user) {
		// TODO Auto-generated method stub

	}

	public void deleteUser(Integer id) {
		// TODO Auto-generated method stub

	}

	public List<User> selectUser() {
		// TODO Auto-generated method stub
		return null;
	}

}
