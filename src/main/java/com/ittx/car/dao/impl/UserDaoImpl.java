package com.ittx.car.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ittx.car.dao.UserDao;
import com.ittx.car.model.Role;
import com.ittx.car.model.User;
import com.ittx.car.utils.MyHibernateDaoSupport;

@Repository("userDao")
@Transactional
public class UserDaoImpl extends MyHibernateDaoSupport implements UserDao {
	@Override
	public void addUser(User user) {
		getHibernateTemplate().save(user);
	}

	@Override
	public List<User> getUserLists() {
		return (List<User>) getHibernateTemplate().find("FROM User");
	}

	@Override
	public void deleteUser(User user) {
		getHibernateTemplate().delete(user);

	}

	@Override
	public User getUserById(int id) {
		return getHibernateTemplate().get(User.class, id);
	}

	@Override
	public User getUserByName(String name) {
		List<User> users = (List<User>) getHibernateTemplate().find("FROM User WHERE username = ?",name);
		if(users != null && users.size() > 0){
			return users.get(0);
		}else{
			return null;
		}
	}

	/**
	 * state 审核是否通过
	 * 1 审核未通过
	 * 2 审核 通过
	 */
	@Override
	public User checkUser(User user) {
		List<User> users = (List<User>) getHibernateTemplate().find("FROM User WHERE username = ? and password = ?",user.getName(),user.getPassword());
		if(users != null && users.size() > 0){
			return users.get(0);
		}else{
			return null;
		}
	}

	@Override
	public void updateUser(User user) {
		getHibernateTemplate().update(user);
	}

	

}
