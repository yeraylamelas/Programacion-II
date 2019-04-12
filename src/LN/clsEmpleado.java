package LN;

import COMUN.ItfProperty;
import COMUN.Constantes;

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
	public Object getObjectProperty(String propiedad) {
		// TODO Auto-generated method stub

		switch (propiedad) {
		case Constantes.EMPLEADO_PUESTO:
			return puesto;
		default:
			return null;
		}
	}

}