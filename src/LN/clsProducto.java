package LN;

import java.time.LocalDate;

import Comun.ItfProperty;

/*
 * Creamos los atributos
 */
public class clsProducto implements ItfProperty{
	private String identificador;
	private String tipo;
	private String marca;
	/*
	 * Creamos el constructor
	 */
	public clsProducto(String identificador, String tipo, String marca) {
		super();
		this.identificador = identificador;
		this.tipo = tipo;
		this.marca = marca;
		/*
		 * Creamos los metodos
		 */
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String getStringProperty(String propiedad) {
		// TODO Auto-generated method stub
		switch(propiedad) {
		case "id": return this.getIdentificador();
		case "tipo": return this.getTipo();
		case "marca": return this.getMarca();
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
