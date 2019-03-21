package LN;

import COMUN.ItfProperty;
import COMUN.clsConstantes;

/**
 * Creamos los atributos
 */
public class clsProducto implements ItfProperty {
	private String identificador;
	private String tipo;
	private String marca;

	/**
	 * Creamos el constructor
	 */
	public clsProducto(String identificador, String tipo, String marca) {
		super();
		this.identificador = identificador;
		this.tipo = tipo;
		this.marca = marca;
		/**
		 * Creamos los metodos
		 */
	}

	@Override
	public Object getProperty(String propiedad) {
		// TODO Auto-generated method stub

		switch (propiedad) {
		case clsConstantes.clsPRODUCTO_IDENTIFICADOR:
			return identificador;
		case clsConstantes.clsPRODUCTO_TIPO:
			return tipo;
		case clsConstantes.clsPRODUCTO_MARCA:
			return marca;
		default:
			return null;
		}
	}

	@Override
	public void setObjectProperty(String propiedad, Object valor) {

		switch (propiedad) {
		case clsConstantes.clsPRODUCTO_IDENTIFICADOR:
			identificador = (String) valor;
			break;
		case clsConstantes.clsPRODUCTO_TIPO:
			tipo = (String) valor;
			break;
		case clsConstantes.clsPRODUCTO_MARCA:
			marca = (String) valor;
			break;
		}
	}

}
