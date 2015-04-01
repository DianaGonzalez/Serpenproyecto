package com.serpen.persistence.control;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.serpen.error.connection.ErrorConnection;
import com.serpen.persistence.conf.HibernateUtil;
import com.serpen.persistence.entity.Role;
import com.serpen.persistence.entity.User;

public class ControlUser {

	private Session session;
	private Transaction transaction;



	public ControlUser(Session session, Transaction transaction) {
		this.session = session;
		this.transaction = transaction;
	}

	public void insert (int nickname, String pasword, String answer, Role role)
			throws ErrorConnection{



		//Role  role  = (Role) session.load(Role.class,1);
		//Role rol = new Role();
		//rol.setId(1);
		//rol.setName("Andrea");
		User user = new User( );
		user.setNickname(nickname);
		user.setPassword(pasword);
		user.setEstado('A');
		user.setRol(role);
		user.setAnswer(answer);
		//sesion.save(rol);
		session.save(user);
		transaction.commit();
		
		throw new ErrorConnection("no se pudo insertar el dato");
	}
	
	public List<User> list() throws ErrorConnection{
		List<User> listaUsuario = session.createQuery(
				"from usuario " +
				"in class com.serpen.persistence.entity.User").list();
		for (int i = 0; i<listaUsuario.size(); i++) {
			User user = listaUsuario.get(i);
			System.out.println(user);
		}
		if(!listaUsuario.isEmpty()){
			return listaUsuario;
		}else{
			throw new ErrorConnection("no hay datos en la entidad usuario");
		}
	}
	
	public User consult() throws ErrorConnection{
		User user = (User) session.load(User.class, 1);
		
		if(user != null){
			return user;
		}
		else{
			throw new ErrorConnection("No hay datos de usuario");
		}
	}
	
	public void remove() throws ErrorConnection{
		
	}
	
	public void upDate(String pasword) throws ErrorConnection{
		
	}


}
