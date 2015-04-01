package com.serpen.persistence.entity;

public class RoleHistory {
	
	private int id;
	private int role;
	private String name;
	
	public RoleHistory() {
		
	}
	public RoleHistory(int id, int role, String name) {
		this.id = id;
		this.role = role;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "RoleHistory [id=" + id + ", role=" + role + ", name=" + name
				+ "]";
	}
}
