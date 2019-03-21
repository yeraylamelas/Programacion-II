package LN;

import COMUN.ItfProperty;
import COMUN.clsConstantes;

/**
 * Creamos los atributos
 */
public class clsPersona implements ItfProperty {
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

	@Override
	public Object getProperty(String propiedad) {
		// TODO Auto-generated method stub

		switch (propiedad) {
		case clsConstantes.clsPERSONA_IDENTIFICADOR:
			return identificador;
		case clsConstantes.clsPERSONA_NOMBRE:
			return nombre;
		case clsConstantes.clsPERSONA_APELLIDO:
			return apellido;
		default:
			return null;
		}
	}

	@Override
	public void setObjectProperty(String propiedad, Object valor) {

		switch (propiedad) {
		case clsConstantes.clsPERSONA_IDENTIFICADOR:
			identificador = (String) valor;
			break;
		case clsConstantes.clsPERSONA_NOMBRE:
			nombre = (String) valor;
			break;
		case clsConstantes.clsPERSONA_APELLIDO:
			apellido = (String) valor;
			break;
		}
	}
}
