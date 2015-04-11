
package com.serpen.interfaz.serpenprueba;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;



@Theme("Logueotheme")
public class SerpenpruebaUI extends UI {

	@WebServlet(value = "/*", asyncSupported = true)
	@VaadinServletConfiguration(productionMode = false, ui = SerpenpruebaUI.class)
	public static class Servlet extends VaadinServlet {
	}

	@Override
	protected void init(VaadinRequest request) {
		VerticalLayout layout = new VerticalLayout();
		setContent(layout);
		
//		CreateUser createUser = new CreateUser();
//		layout.addComponent(createUser);
//		RestorePassword restorePassword = new RestorePassword();
//		layout.addComponent(restorePassword);
		//layout.addComponent(new Label("Prueba..."));
		Logue logue = new Logue();
		layout.addComponent(logue);
//		
//		panelEjemplo ejemplo = new panelEjemplo();
//		layout.addComponent(ejemplo);
	
//		Question question = new Question();
//		layout.addComponent(question);
//		
//		Administrator administrator = new Administrator();
//		layout.addComponent(administrator);
		
//		List list = new List();
//		layout.addComponent(list);
		//setContent(new Logue());
	}

}