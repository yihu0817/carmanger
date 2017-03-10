package com.ittx.car.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ittx.car.dao.SecureDao;
import com.ittx.car.dao.UserDao;
import com.ittx.car.dao.VehicleDao;
import com.ittx.car.model.Function;
import com.ittx.car.model.Module;
import com.ittx.car.model.Role;
import com.ittx.car.model.User;
import com.ittx.car.model.Vehicle;
import com.ittx.car.service.SecureService;

@Service("secureService")
@Transactional
public class SecureServiceImpl implements SecureService {
    @Autowired
	private UserDao userDao;
    @Autowired
    private SecureDao secureDao;
    @Autowired
    private VehicleDao vehicleDao;
    /**
     * 注册用户
     * 判断用户是否存在 
     * true 表示注册成功
     * false 注册失败
     */
	@Override
	public boolean registerUser(User user) {
		User u = userDao.getUserByName(user.getName());
		if(u == null){
			userDao.addUser(user);
			return true;
		}else{
			return false;
		}
	}

	/**
	 * state 审核是否通过
	 * 1 审核未通过
	 * 2 审核 通过
	 */
	@Override
	public User login(User user) {
		User u = userDao.checkUser(user);
		if(u != null){
			int state = u.getState();
			if(state == 2){
				return u;
			}else{
				return null;
			}
		}else{
			return null;
		}
		 
	}

	@Override
	public void addModule(Module module) {
		secureDao.addModule(module);

	}

	@Override
	public List<Module> getAllModule() {
		return secureDao.getAllModule();
	}

	@Override
	public Module getModuleById(int id) {
		// TODO Auto-generated method stub
		return secureDao.getModuleById(id);
	}

	@Override
	public void addFunction(Function function) {
		secureDao.addFunction(function);

	}

	@Override
	public List<Function> getAllFunction() {
		// TODO Auto-generated method stub
		return secureDao.getAllFunction();
	}

	@Override
	public List<Function> getFunction(int moduleId) {
		// TODO Auto-generated method stub
		return secureDao.getFunction(moduleId);
	}

	@Override
	public void addRole(Role role) {
		secureDao.addRole(role);

	}

	@Override
	public List<Role> getAllRoles() {
		// TODO Auto-generated method stub
		return secureDao.getAllRoles();
	}

	@Override
	public Role getRoleById(int id) {
		return secureDao.getRoleById(id);
	}

	@Override
	public void updateRole(Role role) {
		secureDao.updateRole(role);
	}

	@Override
	public void verifyUser(User user, int roleId) {
		if(user.getState() == 2){
			Role role = secureDao.getRoleById(roleId);
			user.setRole(role);
			userDao.updateUser(user);
		}
	}

	@Override
	public void deleteModule(int id) {
		Module module = secureDao.getModuleById(id);
		secureDao.deleteModule(module);
		
	}

	@Override
	public Function getFunctionById(int id) {
		// TODO Auto-generated method stub
		return secureDao.getFunctionById(id);
	}

	@Override
	public List<Vehicle> getAllVehicleList() {
		// TODO Auto-generated method stub
		return vehicleDao.getAllVehicleList();
	}
}
