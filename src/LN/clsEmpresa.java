package LN;

import COMUN.ItfProperty;
import COMUN.clsConstantes;

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
	public Object getProperty(String propiedad) {
		// TODO Auto-generated method stub

		switch (propiedad) {
		case clsConstantes.clsEMPRESA_IDENTIFICADOR:
			return identificador;
		case clsConstantes.clsEMPRESA_NOMBRE:
			return nombre;
		case clsConstantes.clsEMPRESA_CIUDAD:
			return ciudad;
		default:
			return null;
		}
	}

	@Override
	public void setObjectProperty(String propiedad, Object valor) {

		switch (propiedad) {
		case clsConstantes.clsEMPRESA_IDENTIFICADOR:
			identificador = (String) valor;
			break;
		case clsConstantes.clsEMPRESA_NOMBRE:
			nombre = (String) valor;
			break;
		case clsConstantes.clsEMPRESA_CIUDAD:
			ciudad = (String) valor;
			break;
		}
	}

}
