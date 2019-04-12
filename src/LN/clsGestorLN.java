package LN;

import java.util.ArrayList;

import COMUN.ItfProperty;
import LD.GestorBD;
import LD.ProductosBD;

public class clsGestorLN {
	/**
	 * Creamos los ArrayList de las respectivas
	 * clases padres
	 */
	private ProductosBD productosBD = new ProductosBD();
	private ArrayList<clsProducto> listaproductos;
	private ArrayList<clsPersona> listapersonas;
	private GestorBD objDatos;
	public clsGestorLN() {
		objDatos=new GestorBD();
		listaproductos = new ArrayList<clsProducto>();
		listapersonas = new ArrayList<clsPersona>();
		
	
	}
	
	public void anadirProducto(String identificador, String tipo, String marca) {
		
		/**
		 * Declaraci�n de la variable
		 */
		
		clsProducto producto;
		
		
		/**
		 * Definici�n --> crear el hueco en memoria. NEW.
		 */
		
		producto=new clsProducto(identificador, tipo, marca);
		
		
		listaproductos.add(producto);
		
		//grabar en la base de datos.
		
		productosBD.insertarProducto(identificador, tipo, marca);
		
	}
	
public ArrayList<ItfProperty> esenarProducto() {
		
		/**
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
	
	/**
	 * Declaraci�n de la variable
	 */
	
	clsPersona persona;
	
	
	/**
	 * Definici�n --> crear el hueco en memoria. NEW.
	 */
	
	persona=new clsPersona(identificador, nombre, apellido);
	
	//persona.setIdentificador(identificador);
	
	listapersonas.add(persona);
	
}

public ArrayList<ItfProperty> esenarPersona() {
	
	/**
	 * Declaraci�n de la variable
	 */
	ArrayList<ItfProperty> retorno;
	retorno = new ArrayList<ItfProperty>();
	for(clsPersona a:listapersonas) {
		retorno.add(a);
	}
	
	return retorno;

}


public void guardarDatos () {
	
	for(clsProducto a:listaproductos) {
		
		
		String identificador = (String) a.getObjectProperty(COMUN.Constantes.PRODUCTO_IDENTIFICADOR);
		
		
	}
}
public void cargarDatos() {
	
}
}
