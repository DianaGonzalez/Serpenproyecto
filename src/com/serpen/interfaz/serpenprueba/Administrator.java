package com.serpen.interfaz.serpenprueba;


import com.vaadin.server.ThemeResource;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Image;
import com.vaadin.ui.Panel;

public class Administrator extends CustomComponent {

	private Image Imglogo;
	private Panel pnlOption;
	private Image ImgnewUser;
	private Image imgList;
	private Image imgEdit;
	
	public Administrator (){
		
		pnlOption = new  Panel();
		pnlOption.setSizeFull();
		pnlOption.setWidth("550px");
		pnlOption.setHeight("350px");
		
		
		AbsoluteLayout layout = new AbsoluteLayout();
		layout.setWidth("1000px");
		layout.setHeight("800px");
		
		AbsoluteLayout layout2 = new AbsoluteLayout();
		layout2.setWidth("500px");
		layout2.setHeight("350px");
	
		this.Imglogo = new Image("LOGO");
		ThemeResource resource = new ThemeResource("../Imagen/logo.jpg");
		Imglogo =new Image (null, resource);
		this.Imglogo.setVisible(true);
		
				
		this.ImgnewUser = new Image();
		ThemeResource resource1 = new ThemeResource("../Imagen/crear.png");
		ImgnewUser =new Image (null, resource1);
		this.ImgnewUser.setVisible(true);
		
		this.imgList = new Image();
		ThemeResource resource2 = new ThemeResource("../Imagen/buscar.png");
		imgList =new Image (null, resource2);
		this.imgList.setVisible(true);
		
		this.imgEdit = new Image("LOGO");
		ThemeResource resource3 = new ThemeResource("../Imagen/editar.png");
		imgEdit =new Image (null, resource3);
		this.imgEdit.setVisible(true);
		
		layout.addComponent(Imglogo,"top:20px;left:20px");
		layout.addComponent(pnlOption,"top:200px;left:400px");
		
		layout.setVisible(true);
		
		layout2.addComponent(ImgnewUser,"top:0px;left:250px");
		layout2.addComponent(imgList,"top:100px;left:250px");
		layout2.addComponent(imgEdit ,"top:200px;left:250px");

		
		layout2.setVisible(true);
		
		this.setCompositionRoot(layout);
		this.pnlOption.setContent(layout2);
		setSizeFull();
		
		///////////////////////////////////////////////////
		
		
	}
}
