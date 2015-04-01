package com.serpen.persistence.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.serpen.persistence.conf.HibernateUtil;
import com.serpen.persistence.entity.Role;
import com.serpen.persistence.entity.User;

public class TestEditarUsuario {
	public static void main(String[]arg){

		try {
			Session sesion = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = sesion.beginTransaction();
			
			Role role = (Role) sesion.load(Role.class, 1);			
			User user = new User();
			user.setNickname(1);
			user.setPassword("Felipe");  
			user.setRol(role);
			user.setAnswer("cambio de constraseña");
			sesion.update(user);
			
			transaction.commit();
			sesion.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.err.print("El nickname ingresado no se encuentra"+e);
		}
	}

}
