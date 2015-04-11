package com.serpen.interfaz.serpenprueba;

import com.vaadin.server.ThemeResource;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Button;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TextField;

public class Question extends  CustomComponent {

	private Label lblDescription;
	private Image UserName;
	private TextField txtUsername;
	private Image question;
	private TextField txtQuestion;
	private Button btnAccept;
	private Panel panel;
	
	public Question(){
		
		panel = new Panel();
		panel.setSizeFull();
		panel.setWidth("500px");
		panel.setHeight("500px");
				
		AbsoluteLayout layout = new AbsoluteLayout();
		layout.setWidth("1000px");
		layout.setHeight("800px");
		
		AbsoluteLayout layoutQuestion = new AbsoluteLayout();
		layoutQuestion.setWidth("500px");
		layoutQuestion.setHeight("500px");
		
		
		lblDescription = new Label("Para poder recuperar su constraseña por favor ingrese la respuesta de la siguiente pregunta");
		
		ThemeResource resource = new ThemeResource("../Imagen/user.png");
		UserName = new Image(null, resource);
		this.UserName.setVisible(true);
		
				
		txtUsername = new TextField("Usuario:");
		
		ThemeResource resource2 = new ThemeResource("../Imagen/profesor.jpg");
		question = new Image(null, resource2);
		this.question.setVisible(true);
		txtQuestion = new TextField("Nombre de su profesor favorito?");
		
		btnAccept = new Button("Aceptar");
	
		layout.addComponent(panel, "top:100px;left:400px");
		layout.setVisible(true);
		
		layoutQuestion.addComponent(lblDescription,"top:110px;left:260px");
		layoutQuestion.addComponent(UserName,"top:120px;left:150px");
		layoutQuestion.addComponent(txtUsername,"top:120px;left:230px");
		layoutQuestion.addComponent(question,"top:210px;left:150px");
		layoutQuestion.addComponent(txtQuestion,"top:210px;left:230px");
		layoutQuestion.addComponent(btnAccept,"top:280px;left:250px");
    
		layoutQuestion.setVisible(true);
		
		this.setCompositionRoot(layout);
		this.panel.setContent(layoutQuestion);
		
		setSizeFull();	
	}	
}
