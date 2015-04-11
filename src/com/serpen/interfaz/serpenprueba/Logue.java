package com.serpen.interfaz.serpenprueba;

import javax.crypto.spec.OAEPParameterSpec;

import org.apache.tools.ant.taskdefs.rmic.KaffeRmic;

import com.vaadin.annotations.Theme;
import com.vaadin.server.ThemeResource;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Button;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

public class Logue extends CustomComponent{
	
	private Image icon;
	private Image imgUserName;
	private Image imgPasword;
	private TextField txfUserName;
	private PasswordField txfPasword;
	private Label lblQuestion;
	private Button btnLogin;
	private Panel panel;
	public Logue() {
		// TODO Auto-generated constructor stub
		//VerticalLayout components = new VerticalLayout();
		//final VerticalLayout layout = new VerticalLayout();
		
		AbsoluteLayout layout= new AbsoluteLayout();
		layout.setWidth("1000px");
		layout.setHeight("800px");   
		layout.setVisible(true);
		this.setStyleName("v-SIDEBAR");
		
		AbsoluteLayout layoutPanel= new AbsoluteLayout();
		layoutPanel.setWidth("400px");
		layoutPanel.setHeight("500px");
		layoutPanel.setVisible(true);
		this.setStyleName("v-panel-body");
		
		panel = new Panel();
		panel.setSizeFull();
		panel.setWidth("400px");
		panel.setHeight("500px");
		
		//this.panel.addStyleName("v-panel-style");
		
		this.icon = new Image("LOGO");
		ThemeResource resource3 = new ThemeResource("../Imagen/logo.jpg");
		icon =new Image (null, resource3);
		this.icon.setVisible(true);
	//	this.icon.addStyleName("v-label");
		
		ThemeResource resource = new ThemeResource("../Imagen/user.png");
		imgUserName =new Image(null, resource);
		this.imgUserName.setWidth("50px");
		this.imgUserName.setHeight("50px");
		this.imgUserName.setVisible(true);
			        
		imgUserName.setSizeUndefined(); // Actually the default
		this.txfUserName = new TextField("Usuario");
		
		this.imgPasword = new Image("falta imagen");
		ThemeResource resource2 = new ThemeResource("../Imagen/constrase_a_converted.png");
		imgPasword =new Image (null, resource2);
		this.imgPasword.setWidth("50px");
		this.imgPasword.setHeight("50px");
		this.imgPasword.setVisible(true);
			          
		this.txfPasword = new PasswordField("Constraseña:");
		this.txfPasword.setRequired(true);
		this.txfPasword.setValue("");
		this.txfPasword.setNullRepresentation("");
		
		this.btnLogin = new Button("Ingresar");
		//this.btnLogin.addStyleName("v-button-style");	
		//this.btnLogin.addStyleName("v-ie8");	
	
		this.lblQuestion = new Label("¿olvido su contraseña?");
		this.lblQuestion.setWidth("200px");
		this.lblQuestion.setHeight("30px");
		
		
		layoutPanel.addComponent(icon,"top:0px;left:120px");
		layoutPanel.addComponent(imgUserName,"top:180px;left:80px");
		layoutPanel.addComponent(txfUserName,"top:200px;left:150px");
		layoutPanel.addComponent(imgPasword,"top:280px;left:80px");
		layoutPanel.addComponent(txfPasword,"top:300px;left:150px");
		layoutPanel.addComponent(btnLogin,"top:400px;left:80px");
		layoutPanel.addComponent(lblQuestion,"top:500px;left:350px");	
	    layout.addComponent(panel,"top:50px;left:500px");
	    this.panel.setContent(layoutPanel); 
	    this.setCompositionRoot(layout);
		setSizeFull();
	}
}
