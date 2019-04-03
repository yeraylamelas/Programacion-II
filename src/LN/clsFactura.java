package LN;

import java.time.LocalDate;

import COMUN.ItfProperty;
import COMUN.Constantes;

/**
 * Creamos los atributos
 */
public class clsFactura implements ItfProperty {
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

	@Override
	public Object getProperty(String propiedad) {
		// TODO Auto-generated method stub

		switch (propiedad) {
		case Constantes.FACTURA_IDENTIFICADOR:
			return identificador;
		case Constantes.FACTURA_FECHA:
			return fecha;

		default:
			return null;
		}
	}

	@Override
	public void setObjectProperty(String propiedad, Object valor) {

		switch (propiedad) {
		case Constantes.FACTURA_IDENTIFICADOR:
			identificador = (String) valor;
			break;
		case Constantes.FACTURA_FECHA:
			fecha = (LocalDate) valor;
			break;
		}
	}

}
