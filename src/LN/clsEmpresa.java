package LN;

import java.time.LocalDate;

import Comun.ItfProperty;

/**
 * Creamos los atributos
 */
public class clsEmpresa implements ItfProperty{
	private String identificador;
	private String nombre;
	private String ciudad;
	
	/**
	 * Creamos el constructor
	 */
	public clsEmpresa(String identificador, String nombre, String ciudad) {
		super();
		this.identificador = identificador;
		this.nombre = nombre;
		this.ciudad = ciudad;
		
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

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	@Override
	public String getStringProperty(String propiedad) {
		// TODO Auto-generated method stub
		switch(propiedad) {
		case "identificador": return this.getIdentificador();
		case "nombre": return this.getNombre();
		case "ciudad": return this.getCiudad();
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
