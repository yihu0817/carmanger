//package com.ittx.car.dao.impl;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//import com.ittx.car.dao.SecureDao;
//import com.ittx.car.dao.UserDao;
//import com.ittx.car.model.Role;
//import com.ittx.car.model.User;
//
//public class UserDaoImplTest {
//	private UserDao userDao;
//	private SecureDao secureDao;
//
//	/**
//	 * 加载spring核心配置文件applicationContext.xml
//	 * 根据applicationContext.xml中配置由spring容器实例相关bean,同时扫描指定包，实例化注解类
//	 */
//	@Before
//	public void before() {
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-hibernate.xml");
//		userDao = (UserDao) ctx.getBean("userDao");
//		secureDao = (SecureDao) ctx.getBean("secureDao");
//	}
//
//	@Test
//	public void testSetRoleToUser(){
//		Role role = secureDao.getRoleById(1);
//		
//		User user = new User("张先生","abc",1);
//		user.setRole(role);
//		userDao.addUser(user);
//	}
//	
//	@Test
//	public void testGetUserByName() {
//		User user = userDao.getUserByName("张先生");
//		System.out.println(user);
//	}
//	
//	@Test
//	public void testCheckUser(){
//		User user = new User("张先生","abc2",1);
//		user = userDao.checkUser(user);
//		System.out.println(user);
//		
//	}
//
//}
