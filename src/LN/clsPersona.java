package LN;
import java.time.LocalDate;

import Comun.ItfProperty;

/**
 * Creamos los atributos
 */
public class clsPersona implements ItfProperty{
	private String identificador;
	private String nombre;
	private String apellido;
	
	/**
	 * Creamos el constructor
	 */
	public clsPersona(String identificador, String nombre, String apellido) {
		super();
		this.identificador = identificador;
		this.nombre = nombre;
		this.apellido = apellido;
		
		/**
		 * Creamos los metodos
		 */
	}
	

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	@Override
	public String getStringProperty(String propiedad) {
		// TODO Auto-generated method stub
		switch(propiedad) {
		case "id": return this.getIdentificador();
		case "nombre": return this.getNombre();
		case "apellido": return this.getApellido();
		default: return null;
		}
	}


	@Override
	public Integer getIntegerProperty(String propiedad) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Float getFloatProperty(String propiedad) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Double getDoubleProperty(String propiedad) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public char getCharProperty(String propiedad) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public LocalDate getLocalDateProperty(String propiedad) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}

