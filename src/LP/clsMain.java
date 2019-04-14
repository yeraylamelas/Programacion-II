package LP;

import java.util.ArrayList;

import COMUN.ItfProperty;
import COMUN.clsExcepciones;
import LN.clsGestorLN;
import LN.clsGestorLN.Error1;
import LN.clsProducto;

public class clsMain {
	
	private clsGestorLN clsGestorLN = new clsGestorLN ();

	// comentario de linea
	/*
	 * 
	 * comentario multilinea puedo seguir aquí
	 */
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		clsGestorLN objgestor;

		objgestor = new clsGestorLN();

		char c;

		do {
			System.out.println("MEN�\n" + "----\n" + "a) Crear producto\n" + "b) Mostrar productos\n"
					+ "c) Crear persona\n" + "d) Mostrar personas\n" + "\n" + "Introduzca una opci�n:");

			c = UtilidadesLP.leerCaracter();

			switch (c) {

			case 'a':

				CrearProducto(objgestor);

				break;

			case 'b':
				System.out.println("PRODUCTOS:");

				MostrarProducto(objgestor);

				break;

			case 'c':

				CrearPersona(objgestor);

				break;

			case 'd':
				System.out.println("PERSONAS:");

				MostrarPersona(objgestor);

				break;

			case 'e':

				break;

			case 'f':
				
				break;

			default:

				System.out.println("Escriba una letra de la 'a' a la 'f' ");
				break;

			}

		} while (c != 'f');
	}
	
	public static void Excepciones(clsGestorLN objgestor) 
	{
		try
		{
			objgestor.g1();
			
		}
		catch( Error1 e1 )
		{
			System.out.println("Pillado");
		}
		
	}

	/**
	 * Creamos la clase para crear los productos
	 */
	private static void CrearProducto(clsGestorLN objgestor) {

		System.out.println("identificador");
		String identificador = UtilidadesLP.leerCadena();
		System.out.println("tipo");
		String tipo = UtilidadesLP.leerCadena();
		System.out.println("marca");
		String marca = UtilidadesLP.leerCadena();

		objgestor.anadirProducto(identificador, tipo, marca);

	}
	
	public String buscarProducto( String identificador ) 
	{		
		return clsGestorLN.buscarProducto(identificador);		
	}		

	/**
	 * Creamos la clase para poder ver los productos creados anteriormente
	 */
	private static void MostrarProducto(clsGestorLN objgestor) {

		ArrayList<ItfProperty> productos;

		productos = objgestor.esenarProducto();

		for (ItfProperty p : productos) {
			System.out.println(p.getObjectProperty("identificador"));
			System.out.println(p.getObjectProperty("tipo"));
			System.out.println(p.getObjectProperty("marca"));
		}

	}

	/**
	 * Creamos la clase para crear las personas
	 */
	private static void CrearPersona(clsGestorLN objgestor) {

		System.out.println("identificador");
		String identificador = UtilidadesLP.leerCadena();
		System.out.println("nombre");
		String nombre = UtilidadesLP.leerCadena();
		System.out.println("apellido");
		String apellido = UtilidadesLP.leerCadena();

		objgestor.anadirPersona(identificador, nombre, apellido);

	}

	/**
	 * Creamos la clase para poder ver las personas creadas anteriormente
	 */
	private static void MostrarPersona(clsGestorLN objgestor) {

		ArrayList<ItfProperty> personas;

		personas = objgestor.esenarPersona();

		for (ItfProperty p : personas) {
			System.out.println(p.getObjectProperty("identificador"));
			System.out.println(p.getObjectProperty("nombre"));
			System.out.println(p.getObjectProperty("apellido"));
		}

	}
}