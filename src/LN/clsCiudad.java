package LN;


import COMUN.clsConstantes;

/**
 * Creamos los atributos
 */
public class clsCiudad implements COMUN.ItfProperty {
	private String identificador;
	private String nombre;

	/**
	 * Creamos el constructor
	 */
	public clsCiudad(String identificador, String nombre) {
		super();
		this.identificador = identificador;
		this.nombre = nombre;

		/**
		 * Creamos los metodos
		 */
	}

	@Override
	public Object getProperty(String propiedad) {
		// TODO Auto-generated method stub

		switch (propiedad) {
		case clsConstantes.clsCIUDAD_IDENTIFICADOR:
			return identificador;
		case clsConstantes.clsCIUDAD_NOMBRE:
			return nombre;
		default:
			return null;
		}
	}

	@Override
	public void setObjectProperty(String propiedad, Object valor) {

		switch (propiedad) {
		case clsConstantes.clsCIUDAD_IDENTIFICADOR:
			identificador = (String) valor;
			break;
		case clsConstantes.clsCIUDAD_NOMBRE:
			nombre = (String) valor;
			break;
		}
	}

}
