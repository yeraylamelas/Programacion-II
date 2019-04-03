package LN;

import COMUN.ItfProperty;
import COMUN.Constantes;

/**
 * Creamos los atributos
 */
public class clsPersona implements ItfProperty {
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
		result = prime * result + ((identificador == null) ? 0 : identificador.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		clsPersona other = (clsPersona) obj;
		if (apellido == null) {
			if (other.apellido != null)
				return false;
		} else if (!apellido.equals(other.apellido))
			return false;
		if (identificador == null) {
			if (other.identificador != null)
				return false;
		} else if (!identificador.equals(other.identificador))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

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
		case Constantes.PERSONA_IDENTIFICADOR:
			return identificador;
		case Constantes.PERSONA_NOMBRE:
			return nombre;
		case Constantes.PERSONA_APELLIDO:
			return apellido;
		default:
			return null;
		}
	}

	@Override
	public void setObjectProperty(String propiedad, Object valor) {

		switch (propiedad) {
		case Constantes.PERSONA_IDENTIFICADOR:
			identificador = (String) valor;
			break;
		case Constantes.PERSONA_NOMBRE:
			nombre = (String) valor;
			break;
		case Constantes.PERSONA_APELLIDO:
			apellido = (String) valor;
			break;
		}
	}
}
