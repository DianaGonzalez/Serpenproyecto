package com.serpen.persistence.control;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.serpen.persistence.conf.HibernateUtil;

public class ControlRole {

	Session sesion = HibernateUtil.getSessionFactory().openSession();
	Transaction transaction = sesion.beginTransaction();


	public ControlRole(Session sesion, Transaction transaction) {
		this.sesion = sesion;
		this.transaction = transaction;
	}

	public void insert(){

	}

	public void list(){

	}
	public void consult(){

	}public void remove(){

	}
}
