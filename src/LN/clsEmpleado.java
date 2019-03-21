package LN;

import COMUN.ItfProperty;
import COMUN.clsConstantes;

/**
 * Creamos los atributos
 */
public class clsEmpleado extends clsPersona implements ItfProperty {
	private String puesto;

	/**
	 * Creamos el constructor
	 */
	public clsEmpleado(String identificador, String nombre, String apellido, String puesto) {
		super(identificador, nombre, apellido);
		this.puesto = puesto;

	}

	/**
	 * Creamos los metodos
	 */
	@Override
	public Object getProperty(String propiedad) {
		// TODO Auto-generated method stub

		switch (propiedad) {
		case clsConstantes.clsEMPLEADO_PUESTO:
			return puesto;
		default:
			return null;
		}
	}

	@Override
	public void setObjectProperty(String propiedad, Object valor) {

		switch (propiedad) {
		case clsConstantes.clsEMPLEADO_PUESTO:
			puesto = (String) valor;
			break;
		}
	}

}