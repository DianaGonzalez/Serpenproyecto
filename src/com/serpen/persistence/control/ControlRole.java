package com.serpen.persistence.control;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.serpen.error.connection.ErrorConnection;
import com.serpen.persistence.conf.HibernateUtil;
import com.serpen.persistence.entity.Role;

public class ControlRole {

	Session sesion;
	Transaction transaction;


	public ControlRole(Session sesion, Transaction transaction) {
		this.sesion = sesion;
		this.transaction = transaction;
	}

	public void insert(int id, String name) throws ErrorConnection{

		Role rol = new Role();
		

			rol = (Role) sesion.load(Role.class, 5);
			rol = new Role(id,name);
			rol.setId(id);
			rol.setName(name);
			sesion.save(rol);       
			transaction.commit();
//			sesion.close();
			
			throw new ErrorConnection("No se pudo insertar el rol");
	}

	public List<Role> list() throws ErrorConnection{

		List<Role> listaRol = sesion.createQuery(
				"from rol " +
				"in class com.serpen.persistence.entity.Role").list();
		for (int i = 0; i<listaRol.size(); i++) {
			Role role = listaRol.get(i);
			System.out.println(role);
		}
		
		if(!listaRol.isEmpty()){
			return listaRol;
		}else{
			throw new ErrorConnection("No hay ningun dato en la entidad rol");
		}
	}
	
	public Role consult() throws ErrorConnection{

		Role role = new Role();
		role = (Role) sesion.load(Role.class,1);
		System.out.println(role);
//		sesion.close();
		if(role != null){
			return role;
		}
		else{
			throw new ErrorConnection("no se encnto ningun rol");
		}
	}
	
	public void remove(){
		/*
		 * nose si el romove se contrulla solo para el usuario
		 * o tambien para el rol y de ser asi este si seria un 
		 * delete???
		 */
	}
	
	public void upDate(int nombre){
		/*
		 *al actualizar solo se podria hacer el nombre verdad
		 */
	}

	public static void main(String[] args) {
		
		Session sesion = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = sesion.beginTransaction();
        ControlRole rol = new ControlRole(sesion, transaction);
        try {
			rol.insert(2, "Diana");
	        sesion.close();

		} catch (ErrorConnection e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
}
