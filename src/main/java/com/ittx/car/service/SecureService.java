package com.ittx.car.service;

import java.util.List;

import com.ittx.car.model.Function;
import com.ittx.car.model.Module;
import com.ittx.car.model.Role;
import com.ittx.car.model.User;
import com.ittx.car.model.Vehicle;

public interface SecureService {
	boolean registerUser(User user);//注册
	User login(User user); //登录
	void verifyUser(User user,int roleId);//审核
	//==========module===============
	void addModule(Module module);
	List<Module> getAllModule(); 
	Module getModuleById(int id);
	void deleteModule(int id);
	
	//==========function===============
	void addFunction(Function function);
	List<Function> getAllFunction();
	List<Function> getFunction(int moduleId);
	Function getFunctionById(int id);
	
	//===========role===============
	void addRole(Role role);
	List<Role> getAllRoles();
	Role getRoleById(int id);
	void updateRole(Role role);
	
	//========================
	List<Vehicle> getAllVehicleList();
}
