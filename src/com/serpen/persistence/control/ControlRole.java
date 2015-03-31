package com.serpen.persistence.control;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.serpen.persistence.conf.HibernateUtil;
import com.serpen.persistence.entity.Role;

public class ControlRole {

	Session sesion;
	Transaction transaction;


	public ControlRole(Session sesion, Transaction transaction) {
		this.sesion = sesion;
		this.transaction = transaction;
	}

	public void insert(int id, String name){

		Role rol = new Role();
		try {

			rol = (Role) sesion.load(Role.class, 5);
			rol = new Role(id,name);
			rol.setId(id);
			rol.setName(name);
			sesion.save(rol);       
			transaction.commit();
//			sesion.close();

		} catch (Exception e) {
			System.err.print(e);
			System.err.println("no se puede ingresar el rol"+e);
		}
	}

	public List<Role> list(){

		List listaRol = sesion.createQuery(
				"from rol " +
				"in class com.serpen.persistence.entity.Role").list();
		for (int i = 0; i<listaRol.size(); i++) {
			Role role =(Role) listaRol.get(i);
			System.out.println(role);
		} 
		return list();
	}
	public void consult(){

		Role role = new Role();
		role = (Role) sesion.load(Role.class, 1);
		System.out.println(role);
//		sesion.close();

	}public void remove(){

	}

	public static void main(String[] args) {
		
		Session sesion = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = sesion.beginTransaction();
        ControlRole rol = new ControlRole(sesion, transaction);
        rol.insert(2, "Diana");
        sesion.close();


	}
}
