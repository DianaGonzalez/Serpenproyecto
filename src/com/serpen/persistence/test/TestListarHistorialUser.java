package com.serpen.persistence.test;

import java.util.List;

import org.hibernate.Session;

import com.serpen.persistence.conf.HibernateUtil;
import com.serpen.persistence.entity.UserHistory;
public class TestListarHistorialUser {
	
	public static void main(String[] args) {
		Session sesion = HibernateUtil.getSessionFactory().openSession();
		List listaUsuario = sesion.createQuery(
				"from historial_usuario " +
				"in class com.serpen.persistence.entity.UserHistory").list();
		for (int i = 0; i<listaUsuario.size(); i++) {
			UserHistory userHistory =(UserHistory) listaUsuario.get(i);
			System.out.println(userHistory);
		}
	}

}
