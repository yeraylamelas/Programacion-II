package LN;

import COMUN.ItfProperty;
import COMUN.clsConstantes;

/**
 * Creamos los atributos
 */
public class clsClientes extends clsPersona implements ItfProperty {
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
	@Override
	public Object getProperty(String propiedad) {
		// TODO Auto-generated method stub
		switch (propiedad) {
			case clsConstantes.clsCLIENTES_CORREO:
			return correo;
		default:
			return null;
		}
	}

	@Override
	public void setObjectProperty(String propiedad, Object valor) {

		switch (propiedad) {
		case clsConstantes.clsCLIENTES_CORREO:
			correo = (String) valor;
			break;
		
		}
	}
}

