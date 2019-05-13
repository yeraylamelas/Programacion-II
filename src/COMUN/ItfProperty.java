package COMUN;


/**
 * @author javier.cerro
 * Interfaz para la independencia entre la LN y la LP.
 */
public interface ItfProperty 
{
	
	/**
	 * Devuelve la propiedad solicitada por nombre de tipo String.
	 * @para propiedad nombre de la propiedad a devolver del objeto. 
	 */
	Object	getObjectProperty	(String propiedad);
	

}