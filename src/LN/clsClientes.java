package LN;

import java.time.LocalDate;

import Comun.ItfProperty;

/**
 * Creamos los atributos
 */
public class clsClientes extends clsPersona implements ItfProperty{
	private String correo;

	/**
	 * Creamos el constructor
	 */
	public clsClientes(String identificador, String nombre, String apellido, String correo) {
		super(identificador, nombre, apellido);
		this.correo = correo;
		
		/**
		 * Creamos los metodos
		 */
	}
	


	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}



	@Override
	public String getStringProperty(String propiedad) {
		// TODO Auto-generated method stub
		switch(propiedad) {
		case "correo": return this.getCorreo();
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
