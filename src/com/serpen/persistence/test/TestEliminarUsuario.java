package com.serpen.persistence.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.serpen.persistence.conf.HibernateUtil;
import com.serpen.persistence.entity.Role;
import com.serpen.persistence.entity.User;
import com.serpen.persistence.entity.UserHistory;

public class TestEliminarUsuario {
	public static void main(String[] args) {
		
		try {
			Session sesion = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = sesion.beginTransaction();
	        
	        Role role = new Role();
	        role.setId(2);
	        User user = new User();
	        user.setNickname(1);
	        user.setRol(role);
	        
	        UserHistory userHistory = new UserHistory();
	        userHistory.setNickname(user.getNickname());
	        userHistory.setEstado(userHistory.TIPO_ESTADO_INACTIVO);
	        userHistory.setRol(user.getRol().getId());
	        
	        sesion.delete(user);
	        sesion.save(userHistory);
	        transaction.commit();
	        sesion.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("No se puede" + e);
		}
		
        
	}
}
