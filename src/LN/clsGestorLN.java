package LN;

import java.util.ArrayList;

import COMUN.Constantes;
import COMUN.ItfProperty;
import LD.ClientesBD;
import LD.EmpleadosBD;
import LD.GestorBD;
import LD.ProductosBD;

public class clsGestorLN {
	/**
	 * Creamos los ArrayList de las respectivas
	 * clases padres
	 */
	private EmpleadosBD empleadosBD = new EmpleadosBD();
	private ClientesBD clientesBD = new ClientesBD();
	private ProductosBD productosBD = new ProductosBD();
	private ArrayList<clsProducto> listaproductos;
	private ArrayList<clsPersona> listapersonas;
	private GestorBD objDatos;
	public clsGestorLN() {
		objDatos=new GestorBD();
		listaproductos = new ArrayList<clsProducto>();
		listapersonas = new ArrayList<clsPersona>();
		
	
	}
	
	public void g1() throws Error1
	{
		throw new Error1 ("Error de cualquier cosa");
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
	
	public void anadirCliente(String identificador, String nombre, String apellido, String correo) {
		
		/**
		 * Declaraci�n de la variable
		 */
		
		clsPersona cliente;
		
		
		/**
		 * Definici�n --> crear el hueco en memoria. NEW.
		 */
		
		cliente = new clsClientes(identificador, nombre, apellido, correo);
		
		//persona.setIdentificador(identificador);
		
		listapersonas.add(cliente);
		
		//grabar en la base de datos.
		
		clientesBD.insertarCliente(identificador, nombre, apellido, correo);
		
	}
	
	
public void anadirEmpleado(String identificador, String nombre, String apellido, String puesto) {
		
		/**
		 * Declaraci�n de la variable
		 */
		
		clsPersona empleado;
		
		
		/**
		 * Definici�n --> crear el hueco en memoria. NEW.
		 */
		
		empleado = new clsEmpleados(identificador, nombre, apellido, puesto);
		
		//persona.setIdentificador(identificador);
		
		listapersonas.add(empleado);
		
		//grabar en la base de datos.
		
		empleadosBD.insertarEmpleado(identificador, nombre, apellido, puesto);
		
	}
	
	
	/*public  String buscarProducto( String identificador ) throws PropiedadInexistente
	{
		//Crear un alumno con los datos que dispones para que la
		//maquina lo busque entre todos los alumnos de la estructura
		clsProducto productoQueBuscas = new clsProducto (identificador,null,null);
		
		for(clsProducto a : listaproductos ) //for_each
		{
			if( a.equals( productoQueBuscas ) ) //equals
			{
				return (String) a.getObjectProperty(Constantes.PRODUCTO_IDENTIFICADOR);
			}
		}
		
		return null;
		
	}*/
	
	
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



public class Error1 extends RuntimeException {

	public Error1()
	{
		super();
	}
	
	public Error1( String pTexto )
	{
		super(pTexto);
	}
	
}




/*public ArrayList<ItfProperty> esenarPersona() {*/
	
	/**
	 * Declaraci�n de la variable
	 */
	/*ArrayList<ItfProperty> retorno;
	retorno = new ArrayList<ItfProperty>();
	for(clsPersona a:listapersonas) {
		retorno.add(a);
	}
	
	return retorno;

}*/


/*public void guardarDatos () {
	
	for(clsProducto a:listaproductos) {
		
		
		String identificador = (String) a.getObjectProperty(COMUN.Constantes.PRODUCTO_IDENTIFICADOR);
		
		
	}
}
public void cargarDatos() {
	
}*/
}
