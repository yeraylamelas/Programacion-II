package LN;

import COMUN.ItfProperty;
import COMUN.Constantes;

/**
 * Creamos los atributos
 */


public class clsClientes extends clsPersona implements ItfProperty, Comparable<clsClientes> {
	private String correo;

	/**
	 * Creamos el constructor
	 */
	
	public clsClientes(String identificador, String nombre, String apellido, String correo) {
		super(identificador, nombre, apellido);
		this.correo = correo;

		
	}
	
	
	/**
	 * Creamos los metodos
	 */
	
	
	@Override
	public int compareTo(clsClientes o ) {
		

		String id1 = (String) super.getObjectProperty(Constantes.CLIENTES_IDENTIFICADOR);
		String id2 = (String) o.getObjectProperty(Constantes.CLIENTES_IDENTIFICADOR);
		
		return id1.compareTo(id2);
	
	}
	
	
	@Override
	public Object getObjectProperty(String propiedad) {
		// TODO Auto-generated method stub
		switch (propiedad) {
			case Constantes.CLIENTES_CORREO:
			return correo;
		default:
			return null;
		}
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((correo == null) ? 0 : correo.hashCode());
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
		clsClientes other = (clsClientes) obj;
		if (correo == null) {
			if (other.correo != null)
				return false;
		} else if (!correo.equals(other.correo))
			return false;
		return true;
	}
	
}

