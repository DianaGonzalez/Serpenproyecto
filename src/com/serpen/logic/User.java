package com.serpen.logic;

public class User {
	
	private int nickname;
	private int password;
	private Role rol;
	private StateType stateType;
	
	public User(Role rol, int password,int nickname) {
		this.rol=rol;
		this.password=password;
		this.nickname=nickname;
		this.stateType = StateType.A;
		
	}
	public Role getRol() {
		return rol;
	}
	public void setRol(Role rol) {
		this.rol = rol;
	}
	public StateType getStateType() {
		return stateType;
	}
	public void setStateType(StateType stateType) {
		this.stateType = stateType;
	}
	public int getNickname() {
		return nickname;
	}
	public void setNickname(int nickname) {
		this.nickname = nickname;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [nickname=" + nickname + ", password=" + password + "]";
	}



}
