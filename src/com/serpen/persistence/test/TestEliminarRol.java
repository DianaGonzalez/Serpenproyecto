package com.serpen.persistence.test;

import org.hibernate.HibernateException;
import org.hibernate.MappingException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.serpen.persistence.conf.HibernateUtil;
import com.serpen.persistence.entity.Role;
import com.serpen.persistence.entity.RoleHistory;

// cuando se elimine un rol se debe instertar en el historial 
public class TestEliminarRol {
	
	public static void main(String[] args) {
		try {
			
			Session sesion = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = sesion.beginTransaction();
            
            Role role= new Role();
            role.setId(1);
            role.setName("eliana");
            
            RoleHistory roleHistory = new RoleHistory();
            roleHistory.setName(role.getName());
            roleHistory.setRole(role.getId());
            
            sesion.delete(role);
            sesion.save(roleHistory);
            transaction.commit();
            sesion.close();		
			
		} catch (MappingException e) {
			// TODO: handle exception
			System.out.println("no sirve nada "+ e);
		}
	}
}
