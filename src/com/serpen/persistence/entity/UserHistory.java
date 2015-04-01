package com.serpen.persistence.entity;

public class UserHistory {
	private int id;
	private int nickname;
	private char estado;
	private int  rol;	
  
    public static final char TIPO_ESTADO_INACTIVO= 'I'; 
    
	public UserHistory() {
		
	}
	public UserHistory(int id, int nickname, char estado, int rol) {
		super();
		this.id = id;
		this.nickname = nickname;
		this.estado = estado;
		this.rol = rol;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNickname() {
		return nickname;
	}
	public void setNickname(int nickname) {
		this.nickname = nickname;
	}
	public char getEstado() {
		return estado;
	}
	public void setEstado(char estado) {
		this.estado = estado;
	}
	public int getRol() {
		return rol;
	}
	public void setRol(int rol) {
		this.rol = rol;
	}
	@Override
	public String toString() {
		return "UserHistory [id=" + id + ", nickname=" + nickname + ", estado="
				+ estado + ", rol=" + rol + "]";
	}
	
	
	
	
	
	
	
	

}
