package LN;

import COMUN.ItfProperty;
import COMUN.Constantes;

/**
 * Creamos los atributos
 */
public class clsEmpresa implements ItfProperty {
	private String identificador;
	private String nombre;
	private String ciudad;

	/**
	 * Creamos el constructor
	 */
	public clsEmpresa(String identificador, String nombre, String ciudad) {
		super();
		this.identificador = identificador;
		this.nombre = nombre;
		this.ciudad = ciudad;

		/**
		 * Creamos los metodos
		 */
	}

	@Override
	public Object getObjectProperty(String propiedad) {
		// TODO Auto-generated method stub

		switch (propiedad) {
		case Constantes.EMPRESA_IDENTIFICADOR:
			return identificador;
		case Constantes.EMPRESA_NOMBRE:
			return nombre;
		case Constantes.EMPRESA_CIUDAD:
			return ciudad;
		default:
			return null;
		}
	}


}
