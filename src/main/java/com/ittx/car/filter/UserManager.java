package com.ittx.car.filter;

import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ittx.car.dao.UserDao;
import com.ittx.car.model.Function;
import com.ittx.car.model.Role;
import com.ittx.car.model.User;

public class UserManager  {
	private static UserDao userDao;
	
	private static UserManager UMG = null;
	public static UserManager getInstance(){
		if(UMG==null){
			UMG = new UserManager();
			initUserManager();
		}
		return UMG;
	}
	
	public  boolean getGroupPermission(String userId, String action) {
		boolean results = false;
		User user = (User) userDao.getUserById(Integer.parseInt(userId));
		Role role = user.getRole();
		
		Set<Function> functionLists = role.getFunctionLists();
		for(Function fuction : functionLists){
			System.out.println("code :"+fuction.getCode());
			if(fuction.getCode().equals(action)){
				results = true;
				break;
			}
		}

		return results;
	}
	public static void initUserManager(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-hibernate.xml");
		userDao = (UserDao) ctx.getBean("userDao");
	}

}
