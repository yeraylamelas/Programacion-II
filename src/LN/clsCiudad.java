package LN;

import java.time.LocalDate;

import Comun.ItfProperty;

/**
 * Creamos los atributos
 */
public class clsCiudad implements ItfProperty{
	private String identificador;
	private String nombre;
	
	/**
	 * Creamos el constructor
	 */
	public clsCiudad(String identificador, String nombre) {
		super();
		this.identificador = identificador;
		this.nombre = nombre;
		
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


	@Override
	public String getStringProperty(String propiedad) {
		// TODO Auto-generated method stub
		switch(propiedad) {
		case "identificador": return this.getIdentificador();
		case "nombre": return this.getNombre();
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

