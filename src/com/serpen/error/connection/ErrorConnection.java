package com.serpen.error.connection;

public class ErrorConnection extends Exception{
	
	private static final String ERROR_MENSAGGER="Error en la coneccion";
	
	public ErrorConnection() {
		// TODO Auto-generated constructor stub
		super(ERROR_MENSAGGER);
	}
	
	public ErrorConnection(String mensagger){
		super(mensagger);		
	}

}
