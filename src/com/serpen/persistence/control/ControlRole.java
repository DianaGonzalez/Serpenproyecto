package com.serpen.persistence.control;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.serpen.error.connection.ErrorConnection;
import com.serpen.persistence.conf.HibernateUtil;
import com.serpen.persistence.entity.Role;
import com.serpen.persistence.entity.RoleHistory;

public class ControlRole {
	
	Session sesion;
	Transaction transaction;

	public ControlRole(Session sesion, Transaction transaction) {
		this.sesion = sesion;
		this.transaction = transaction;
	}

	public void insert(String name) throws ErrorConnection{

		Role role = new Role();
		

			role = (Role) sesion.load(Role.class, 5);
			role = new Role();
			role.setName(name);
			sesion.save(role);       
			transaction.commit();
//			sesion.close();
			
			throw new ErrorConnection("No se pudo insertar el rol");
	}

	public List<Role> list() throws ErrorConnection{

		List<Role> listRole = sesion.createQuery(
				"from rol " +
				"in class com.serpen.persistence.entity.Role").list();
		for (int i = 0; i<listRole.size(); i++) {
			Role role = listRole.get(i);
			System.out.println(role);
		}
		
		if(!listRole.isEmpty()){
			return listRole;
		}else{
			throw new ErrorConnection("No hay ningun dato en la entidad rol");
		}
	}
	
	public Role consult(int id) throws ErrorConnection{

		Role role = new Role();
		role = (Role) sesion.load(Role.class,id);
		System.out.println(role);
//		sesion.close();
		if(role != null){
			return role;
		}
		else{
			throw new ErrorConnection("no se encnto ningun rol");
		}
	}
	
	public Role consultName(String name) throws ErrorConnection{

		Role role = new Role();
		role = (Role) sesion.load(Role.class,name);
		System.out.println(role);
//		sesion.close();
		if(role != null){
			return role;
		}
		else{
			throw new ErrorConnection("no se encnto ningun rol");
		}
	}
	
	
	
	public void remove(String name) throws ErrorConnection{
		
	//----------- Falta (o"o) ---------------------
        Role role= new Role();
//        role.setId(id);
        role.setName(name);
        RoleHistory roleHistory = new RoleHistory();
        roleHistory.setName(role.getName());
        roleHistory.setRole(role.getId());
        
        sesion.delete(role);
        sesion.save(roleHistory);
        transaction.commit();
        //sesion.close();	
        throw new ErrorConnection("No se encuentra el rol que se desea eliminar");
	}
	
	public void upDate(int id,String nombre)throws ErrorConnection{
		
		Role role = new Role();
		role.setId(id);
		role.setName(nombre);  
		sesion.update(role);
		transaction.commit();
//		sesion.close();
		
		throw new ErrorConnection("El rol ingresado no se encuentra");
	}

	public static void main(String[] args) {
		
		Session sesion = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = sesion.beginTransaction();
        ControlRole rol = new ControlRole(sesion, transaction);
        
        try {
			
        	rol.remove("Diana");
			sesion.close();
			

		} catch (ErrorConnection e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
}
