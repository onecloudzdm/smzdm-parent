package com.wq.smzdm.dao;

import java.util.List;

import com.wq.smzdm.model.User;

public interface UserDao {
	
	public void saveUser(User user);
	
	public User getUserById(Integer id);
	
	public void updateUser(User user);
	
	public void deleteUser(Integer id);
	
	public List<User> selectUser();

}
