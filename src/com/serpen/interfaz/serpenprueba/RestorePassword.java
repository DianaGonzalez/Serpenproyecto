package com.serpen.interfaz.serpenprueba;


import com.vaadin.server.ThemeResource;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Button;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TextField;

public class RestorePassword extends CustomComponent {
	
	private Label lblLogo;
	private Label lblNewPassword;
	private Label lblConfirm;
	private TextField txtNewPassword;
	private TextField txtConfirm;
	private Button btnConfirm;
	private Panel pnlMain;
	private Button btnCancel;
	private Image  imgSecurity;
	
	public RestorePassword(){
		
		AbsoluteLayout layout = new AbsoluteLayout();
		layout.setWidth("1200px");
		layout.setHeight("800px");
		
		AbsoluteLayout layoutPanel = new AbsoluteLayout();
		layoutPanel.setWidth("500px");
		layoutPanel.setHeight("300px");
		
		pnlMain = new Panel();
		pnlMain.setSizeFull();
		pnlMain.setWidth("500px");
		pnlMain.setHeight("300px");

		
		lblLogo = new Label("LOGO");
		lblNewPassword = new Label("Falta imagen");
		
		txtNewPassword = new TextField("Nueva Contraseña");
		lblConfirm = new Label("Falta imagen");
		txtConfirm = new TextField("Confirmar Constraseña");
		
		btnConfirm = new Button("Confirmar");
		btnCancel = new Button("Cancelar");
		
		this.imgSecurity = new Image("LOGO");
		ThemeResource resource = new ThemeResource("../Imagen/constrase_a_converted.png");
		imgSecurity =new Image (null, resource);;
		this.imgSecurity.setVisible(true);
		
		layoutPanel.addComponent(lblLogo,"top:10px;left:100px");
		layoutPanel.addComponent(lblNewPassword,"top:75px;left:50px");
		layoutPanel.addComponent(txtNewPassword, "top:75px;left:150px");
		layoutPanel.addComponent(lblConfirm ,"top:0;left:50");
		layoutPanel.addComponent(txtConfirm, "top:150;left:150");
		layoutPanel.addComponent(btnConfirm,"top:220;left:150");
		layoutPanel.addComponent(btnCancel,"top:220;left:300");
		layoutPanel.addComponent(imgSecurity,"top:100;left:50");
		
		
		this.pnlMain.setContent(layoutPanel);
		layout.addComponent(pnlMain,"top:100;left:300");
        setCompositionRoot(layout);
		setSizeFull();
		
	}

}
