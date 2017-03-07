package com.ittx.car.model;

import java.util.List;
import java.util.Set;

public class Role {
	private int rId;
	private String name;
	private String description;
	private Set<Function> functionLists;
	private Set<User> userLists;
	public Role() {
	}

	public Role(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public Role(int rId, String name, String description) {
		this.rId = rId;
		this.name = name;
		this.description = description;
	}

	public Set<User> getUserLists() {
		return userLists;
	}

	public void setUserLists(Set<User> userLists) {
		this.userLists = userLists;
	}

	public int getrId() {
		return rId;
	}

	public void setrId(int rId) {
		this.rId = rId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Function> getFunctionLists() {
		return functionLists;
	}

	public void setFunctionLists(Set<Function> functionLists) {
		this.functionLists = functionLists;
	}

	@Override
	public String toString() {
		return "Role [rId=" + rId + ", name=" + name + ", description=" + description + "]";
	}

}
