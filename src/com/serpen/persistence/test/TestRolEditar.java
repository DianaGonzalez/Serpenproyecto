package com.serpen.persistence.test;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.serpen.persistence.conf.HibernateUtil;
import com.serpen.persistence.entity.Role;

public class TestRolEditar {

	public static void main(String[]arg){

		try {
			Session sesion = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = sesion.beginTransaction();
			Role role = new Role();
			role.setId(1);
			role.setName("Felipe");  
			sesion.update(role);
			transaction.commit();
			sesion.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.err.print("El id ingresado no se encuentra"+e);
		}

	}    
	    }
