package com.serpen.interfaz.serpenprueba;

import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Button;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.Table;
import com.vaadin.ui.TextField;

public class List extends CustomComponent {
	
	private Label lblUser;
	private TextField txtUser;
	private ComboBox boxRol;
	private Button btnSearch;
	private Button btnReturn;
	private Table table;
	private Panel pnlMenu;
	private Panel pnlTable;
	
	public List(){
			
		AbsoluteLayout layout = new AbsoluteLayout();
		layout.setWidth("1200px");
		layout.setHeight("800px");
		layout.setVisible(true);
		
		AbsoluteLayout layoutPanel = new AbsoluteLayout();
		layoutPanel.setWidth("1000px");
		layoutPanel.setHeight("200px");
		layoutPanel.setVisible(true);
		
		AbsoluteLayout layoutMenu = new AbsoluteLayout();
		layoutMenu.setWidth("1000px");
		layoutMenu.setHeight("300px");
		layoutMenu.setVisible(true);
		
		pnlMenu = new Panel();
		pnlMenu.setSizeFull();
		pnlMenu.setWidth("1000");
		pnlMenu.setHeight("200");
		
		pnlTable = new Panel();
		pnlTable.setSizeFull();
		pnlTable.setWidth("1000px");
		pnlTable.setHeight("300px");

		
		lblUser = new Label("Usuario");		
		lblUser.setWidth("50px");
		lblUser.setHeight("50px");
		lblUser.setVisible(true);

		txtUser = new TextField();
		txtUser.setWidth("150");
		txtUser.setHeight("50px");
		txtUser.setRequired(true);
		txtUser.setValue("");
		txtUser.setNullRepresentation("");
		
		boxRol = new ComboBox("");
		boxRol.setWidth("150px");
		boxRol.setHeight("50px");
		
		btnSearch= new  Button("Buscar");
		btnSearch.setWidth("150px");
		btnSearch.setHeight("50");
		btnSearch.setVisible(true);
		
		btnReturn= new  Button("Regresar");
		btnReturn.setWidth("150px");
		btnReturn.setHeight("50");
		btnReturn.setVisible(true);
		
		table = new Table();
//	    table.setWidth("100%"); //Ocupa todo el ancho del navegador
//	    table.setHeight("170px"); //Altura del Grid.
	    
// Definir  columnas 
	    table.addContainerProperty("Usuario", String.class, null);
	    table.addContainerProperty("Rol", String.class, null);
	    table.addContainerProperty("Estado", String.class, null);
	    table.addContainerProperty("Control", String.class, null);
	         
//	    Añadir algunas otras filas utilizando addItem
	    table.addItem(new Object[]{" ", " " , " ", " "}, 2);
	    table.addItem(new Object[] { " " ," " , " ", " "},3);
	    
	    //Mostrar exactamente el momento contenían fila
	    table.setPageLength(table.size());  
	    table.setWidth("80%"); //Ocupa todo el ancho del navegador
	    table.setHeight("170px"); //Altura del Grid.
	    table.setFooterVisible(true);
		
		
		layout.addComponent(pnlMenu,"top:100px;left:100px");
		layout.addComponent(pnlTable,"top:400px;left:100px");
		
		this.pnlMenu.setContent(layoutPanel);
		this.pnlTable.setContent(layoutMenu);
		
		layoutPanel.addComponent(lblUser,"top:150px;left:200px");
		layoutPanel.addComponent(txtUser,"top:50px;left:150px");
		layoutPanel.addComponent(boxRol,"top:50px;left:350px");
		layoutPanel.addComponent(btnSearch,"top:50px;left:550px");
		layoutMenu.addComponent(table,"top:10px;left:10px");
		layoutMenu.addComponent(btnReturn,"top:200px;left:600px");
	    
		this.setCompositionRoot(layout);	
		this.setSizeFull();	 

	}
}