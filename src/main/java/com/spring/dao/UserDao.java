package com.spring.dao;

import java.util.List;

import com.spring.model.User;


public interface UserDao {
	void saveUser(User usr);
    
    List<User> findAllUsers();
     
    void deleteUserById(int id);
     
    User findById(int id);
     
    void updateUser(User usr);
    
    boolean findUser(User usr);
}
