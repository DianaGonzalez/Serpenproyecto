package com.serpen.persistence.entity;

public class User {

    private int nickname;
    private String password;
    private String answer;
    private Role rol;
    private char  estado;
    public static final char TIPO_ESTADO_ACTIVO = 'A';
   
    public User() {
       

   }
    public char getEstado() {
        return estado;
    }
    public void setEstado(char estado) {
        this.estado = estado;
    }
    
    
   
    public User(int nickname, String password, String answer,
			Role rol, char estado) {
		this.nickname = nickname;
		this.password = password;
		this.answer = answer;
		this.rol = rol;
		this.estado = estado;
	}

	public Role getRol() {
        return rol;
    }

    public void setRol(Role rol) {
        this.rol = rol;
    }

  

    public int getNickname() {
        return nickname;
    }

    public void setNickname(int nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "User [nickname=" + nickname + ", password=" + password
				+ ", PreguntaSeguridad=" + answer + ", rol=" + rol
				+ ", estado=" + estado + "]";
	}


   
   
}
