package com.ittx.car.dao;

import java.util.List;

import com.ittx.car.model.User;

public interface UserDao {
	public void addUser(User user);
	public List<User> getUserLists();
	public void deleteUser(User user);
	public User getUserById(int id);
	public User getUserByName(String name);
	public User checkUser(User user);
	public void updateUser(User user);
	
}
