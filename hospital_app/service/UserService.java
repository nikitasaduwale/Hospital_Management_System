package com.ty.hospital_app.service;

import java.util.List;

import com.ty.hospital_app.dao.imp.UserDaoImp;
import com.ty.hospital_app.dto.User;

public class UserService {
	public void SaveUser(User user) {
		UserDaoImp daoImp=new UserDaoImp();
		User user1=daoImp.saveUser(user);
		if(user1!=null) {
			System.out.println("data saved");
		}
		else {
			System.out.println("unfaortunatly data not saved");
		}
	}
	public User getHospitalById(int uid) {
		UserDaoImp daoImp=new UserDaoImp();
		User user1=daoImp.getUserId(uid);
		if(user1!=null) {
			return user1;
		}
		else {
			return null;
		}

	}
	public void deleteUserById(int uid) {
		UserDaoImp daoImp=new UserDaoImp();
		boolean flag=daoImp.deleteUserId(uid);
		if(flag) 
		{
			System.out.println("data deleted");;
		}
		else {
			System.out.println("data not found");
		}
	}
	public User updateHospitalById(int uid,User user) {
		UserDaoImp daoImp=new UserDaoImp();
		User user1=daoImp.updateUser( uid,user);
		if(user1!=null) 
		{
			return user1;
		}
		else {
			return null;
		}
	}
	public List<User> getAllUser(){
		UserDaoImp daoImp=new UserDaoImp();
		List<User> user1=daoImp.getAllUser();
        return user1;
	}

	public List<User> getUserByRole(String role){
		UserDaoImp daoImp=new UserDaoImp();
		List<User> user1=daoImp.getUserByRole(role);
        return user1;
	}

}
