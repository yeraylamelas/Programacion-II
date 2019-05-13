package LN;

import COMUN.ItfProperty;
import COMUN.Constantes;

/**
 * Creamos los atributos
 */
public class clsProducto implements ItfProperty {
	private String identificador;
	private String tipo;
	private String marca;

	/**
	 * Creamos el constructor
	 */
public clsProducto(String identificador, String tipo, String marca) {
		super();
		this.identificador = identificador;
		this.tipo = tipo;
		this.marca = marca;
		
		
		/**
		 * Creamos los metodos
		 */
	}

	@Override
	public Object getObjectProperty(String propiedad)throws PropiedadInexistente  {
		// TODO Auto-generated method stub

		switch (propiedad) {
		case Constantes.PRODUCTO_IDENTIFICADOR:
			return identificador;
		case Constantes.PRODUCTO_TIPO:
			return tipo;
		case Constantes.PRODUCTO_MARCA:
			return marca;
		default: throw new PropiedadInexistente("No existe esa propiedad!");
		}
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((identificador == null) ? 0 : identificador.hashCode());
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
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
		clsProducto other = (clsProducto) obj;
		if (identificador == null) {
			if (other.identificador != null)
				return false;
		} else if (!identificador.equals(other.identificador))
			return false;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		return true;
	}

}
