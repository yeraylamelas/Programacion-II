package LD;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

 
public class ProductosBD {	
	
	private GestorBD gbd = new GestorBD();
	
	public ResultSet cargarListaProductos() {
		try {
			// Todos los accesos a bases de datos deben ir entre try/catch
			// Establecemos una conexi�n con nuestra base de datos
	
			gbd.conectar();

			// Creamos y ejecutamos una sentencia SQL
			Statement stmt = gbd.createStatement();

			// hay una tabla coches en la BD
			ResultSet rs = stmt.executeQuery("SELECT * FROM Productos");

			/*
			 * // Tratamos los resultado obtenidos en la consulta SQL while(rs.next()) {
			 * 
			 * Coche nuevoCoche = new Coche( rs.getString("matricula"),
			 * rs.getString("propietario"), rs.getInt("potencia"));
			 * vectorBD.add(nuevoCoche); }
			 */

			//gbd.disconnect();

			return rs;

		} catch (SQLException se) {
			se.printStackTrace();

			return null;
		}
	}

	
	private GestorBD gestorBD = new GestorBD();
	
	public void insertarProducto (String  Identificador, String Tipo, String Marca) {

		gestorBD.conectar();
		
		String sql = "insert into productos values('" + Identificador + "','" + Tipo + "','" + Marca + "')";
				
		System.out.println(sql );
		
		gestorBD.insertar( sql );
		
		gestorBD.desconectar();
			
	}
	
}
