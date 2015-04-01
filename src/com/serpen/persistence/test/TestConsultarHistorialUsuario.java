package com.serpen.persistence.test;

import org.hibernate.Session;

import com.serpen.persistence.conf.HibernateUtil;
import com.serpen.persistence.entity.UserHistory;

public class TestConsultarHistorialUsuario {
	public static void main(String[] args) {
	    Session sesion = HibernateUtil.getSessionFactory().openSession();
        UserHistory userHistory = (UserHistory) sesion.load(UserHistory.class, 1);
        System.out.println(userHistory);
        sesion.close();
}

}
