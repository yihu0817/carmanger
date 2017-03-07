package com.ittx.car.dao;

import java.util.List;

import com.ittx.car.model.Function;
import com.ittx.car.model.Module;
import com.ittx.car.model.Role;

public interface SecureDao {
	//==========module===============
	void addModule(Module module);
	List<Module> getAllModule(); 
	Module getModuleById(int id);
	
	//==========function===============
	void addFunction(Function function);
	List<Function> getAllFunction();
	List<Function> getFunction(int moduleId);
	
	//===========role===============
	void addRole(Role role);
	List<Role> getAllRoles();
	Role getRoleById(int id);
	void updateRole(Role role);
}
