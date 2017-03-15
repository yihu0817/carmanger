package com.ittx.car.model.bean;

import java.util.List;

import com.ittx.car.model.Function;

public class FunctionListBean {
	private int moduleid;
	private List<FunctionBean> functionLists;

	public int getModuleid() {
		return moduleid;
	}

	public void setModuleid(int moduleid) {
		this.moduleid = moduleid;
	}

	public List<FunctionBean> getFunctionLists() {
		return functionLists;
	}

	public void setFunctionLists(List<FunctionBean> functionLists) {
		this.functionLists = functionLists;
	}

}
