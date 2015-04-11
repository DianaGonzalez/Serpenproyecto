package com.serpen.interfaz.serpenprueba;

import org.eclipse.jetty.util.security.Password;

import com.vaadin.annotations.Theme;
import com.vaadin.server.ThemeResource;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Button;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;


@SuppressWarnings("serial")

//asigna el tema a la clase que se desea modelar
@Theme("themeCreateUser")
public class CreateUser extends CustomComponent{

	private Label lblCreateUser;
	private TextField txtNickname;
	private PasswordField txtPassword;
	private TextField txtAnswer;
	private Image lblImagen;
	private ComboBox rol;
	private Button btnNew;
	private Button btnCancel;
	private Panel panel;
	
	public CreateUser (){
		
		panel = new Panel();
//		panel.setSizeFull();
		panel.setWidth("700px");
		panel.setHeight("500px");
//        panel.setScrollLeft(0);
//        panel.setScrollTop(0);
        
		AbsoluteLayout layout = new AbsoluteLayout();
		layout.setWidth("1200px");
		layout.setHeight("800px");
		
		AbsoluteLayout layout2 = new AbsoluteLayout();
		layout2.setWidth("700px");
		layout2.setHeight("500px");
		
		
		lblCreateUser = new Label("CREAR USUARIO");
		txtNickname = new TextField("Usuario");
		txtPassword = new PasswordField("Contraseña");
		txtAnswer = new TextField("Respuesta");
		
		ThemeResource resource = new ThemeResource("../Imagen/CrearUsuario.png");
		lblImagen = new Image(null, resource);
		this.lblImagen.setVisible(true);
		this.lblImagen.setWidth("150px");
		this.lblImagen.setHeight("150px");
		
		rol = new ComboBox("Rol");
		btnNew = new Button("New");
		btnCancel = new Button("Cancel");
		
		layout.addComponent(panel,"top:100px;left:350px");
		layout.setVisible(true);
		
		layout2.addComponent(lblCreateUser,"top:120px;left:400px");
		layout2.addComponent(txtNickname, "top:85px;left:100px");
		layout2.addComponent(txtPassword, "top:160px;left:100px");
		layout2.addComponent(txtAnswer, "top:235px;left:100px");
		layout2.addComponent(lblImagen, "top:70px;left:380px");
		layout2.addComponent(rol, "top:235px;left:360px");
		layout2.addComponent(btnNew, "top:300px;left:250px");
		layout2.addComponent(btnCancel, "top:300px;left:350px");
		
		layout.setVisible(true);
	
		txtPassword.setRequired(true);
		txtPassword.setValue("");
		txtPassword.setNullRepresentation("");
		
		this.setCompositionRoot(layout);
		this.panel.setContent(layout2);

		setSizeFull();
	}
}
