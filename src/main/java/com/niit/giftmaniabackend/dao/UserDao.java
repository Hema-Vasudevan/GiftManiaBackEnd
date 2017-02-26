package com.niit.giftmaniabackend.dao;

import java.util.*;

import com.niit.giftmaniabackend.model.User;

public interface UserDao {
	public List<User> getAllUserDetails();
	public void addUser(User s);
	public void removeUser(int uid);
	public void updateUser(User s);
	public User getPersonById(int uid);
}
