package LN;

import java.time.LocalDate;

import Comun.ItfProperty;

/**
 * Creamos los atributos
 */
public class clsEmpleado extends clsPersona implements ItfProperty{
	private String puesto;

	/**
	 * Creamos el constructor
	 */
	public clsEmpleado(String identificador, String nombre, String apellido, String puesto) {
		super(identificador, nombre, apellido);
		this.puesto = puesto;
		
		/**
		 * Creamos los metodos
		 */
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	

	@Override
	public String getStringProperty(String propiedad) {
		// TODO Auto-generated method stub
		switch(propiedad) {
		case "puesto": return this.getPuesto();
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
