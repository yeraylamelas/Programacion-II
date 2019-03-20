package LN;

import java.time.LocalDate;

import Comun.ItfProperty;
/**
 * Creamos los atributos
 */
public class clsFactura implements ItfProperty{
	private String identificador;
	private LocalDate fecha;
	
	/**
	 * Creamos el constructor
	 */
	public clsFactura(String identificador, LocalDate fecha) {
		super();
		this.identificador = identificador;
		this.fecha = fecha;
		
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

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}


	@Override
	public String getStringProperty(String propiedad) {
		// TODO Auto-generated method stub
		switch(propiedad) {
		case "identificador": return this.getIdentificador();
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
		switch(propiedad) {
		case "fecha": return fecha;
		default: return null;
		}
	}
	
	
	
	

}
