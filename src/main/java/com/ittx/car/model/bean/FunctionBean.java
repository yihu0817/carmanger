package com.ittx.car.model.bean;

import java.util.Set;

/**
 * 多对一的单向关连 
 * 
 * 多端持有一端实例
 *
 */
public class FunctionBean {
	private int fId;
	private String code; //user_add.do
	private String description;
	private ModuleBean module;

	public FunctionBean(String code, String description, ModuleBean module) {
		this.code = code;
		this.description = description;
		this.module = module;
	}

	public FunctionBean() {
	}

	public FunctionBean(int fId, String code, String description, ModuleBean module) {
		this.fId = fId;
		this.code = code;
		this.description = description;
		this.module = module;
	}

	public int getfId() {
		return fId;
	}

	public void setfId(int fId) {
		this.fId = fId;
	}


	public String getDescription() {
		return description;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ModuleBean getModule() {
		return module;
	}

	public void setModule(ModuleBean module) {
		this.module = module;
	}

	

}
