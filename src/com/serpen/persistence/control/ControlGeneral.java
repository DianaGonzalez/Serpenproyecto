package com.serpen.persistence.control;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class ControlGeneral {
	
	private ControlRole controlRole;
	private ControlUser controlUser;
	
	
	
	public ControlGeneral(Session sesion, Transaction transaction) {
		
		this.controlRole=new ControlRole(sesion, transaction);
		this.controlUser=new ControlUser(sesion,transaction);
	}
	
	

}
