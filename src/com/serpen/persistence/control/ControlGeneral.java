package com.serpen.persistence.control;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class ControlGeneral {
	
	private ControlRole controlRole;
	private ControlUser controlUser;
	private ControlHistoryRole controlHistoryRole;
	private ControlHistoryUser controlHistoryUser;
	
	
	
	public ControlGeneral(ControlRole controlRole, ControlUser controlUser,
			ControlHistoryRole controlHistoryRole,
			ControlHistoryUser controlHistoryUser) {
		
		this.controlRole = controlRole;
		this.controlUser = controlUser;
		this.controlHistoryRole = controlHistoryRole;
		this.controlHistoryUser = controlHistoryUser;
	}
	
	
	

	
	

}
