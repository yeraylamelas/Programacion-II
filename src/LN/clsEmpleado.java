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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((puesto == null) ? 0 : puesto.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		clsEmpleado other = (clsEmpleado) obj;
		if (puesto == null) {
			if (other.puesto != null)
				return false;
		} else if (!puesto.equals(other.puesto))
			return false;
		return true;
	}

}