package LN;

import java.util.ArrayList;

import Comun.ItfProperty;

public class clsGestorLN {
	/*
	 * Creamos los ArrayList de las respectivas
	 * clases padres
	 */
	private ArrayList<clsProducto> listaproductos;
	private ArrayList<clsPersona> listapersonas;
	
	public clsGestorLN() {
		
		listaproductos = new ArrayList<clsProducto>();
		listapersonas = new ArrayList<clsPersona>();
		
	
	}
	
	public void anadirProducto(String identificador, String tipo, String marca) {
		
		/*
		 * Declaraci�n de la variable
		 */
		
		clsProducto producto;
		
		
		/*
		 * Definici�n --> crear el hueco en memoria. NEW.
		 */
		
		producto=new clsProducto(identificador, tipo, marca);
		
		
		listaproductos.add(producto);
		
	}
	
public ArrayList<ItfProperty> esenarProducto() {
		
		/*
		 * Declaraci�n de la variable
		 */
		
	ArrayList<ItfProperty> retorno;
	retorno = new ArrayList<ItfProperty>();
	for(clsProducto a:listaproductos) {
		retorno.add(a);
	}
	
	return retorno;

	}


public void anadirPersona(String identificador, String nombre, String apellido) {
	
	/*
	 * Declaraci�n de la variable
	 */
	
	clsPersona persona;
	
	
	/*
	 * Definici�n --> crear el hueco en memoria. NEW.
	 */
	
	persona=new clsPersona(identificador, nombre, apellido);
	
	//persona.setIdentificador(identificador);
	
	listapersonas.add(persona);
	
}

public ArrayList<ItfProperty> esenarPersona() {
	
	/*
	 * Declaraci�n de la variable
	 */
	ArrayList<ItfProperty> retorno;
	retorno = new ArrayList<ItfProperty>();
	for(clsPersona a:listapersonas) {
		retorno.add(a);
	}
	
	return retorno;

}
}
