package LD;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

 
public class ProductosBD 
{	
	
	private GestorBD gestorBD = new GestorBD();
	
	public void insertarProducto (String  Identificador, String Tipo, String Marca) {

		gestorBD.conectar();
		
		String sql = "insert into productos values('" + Identificador + "','" + Tipo + "','" + Marca + "')";
				
		System.out.println(sql );
		
		gestorBD.insertar( sql );
		
		gestorBD.desconectar();
			
	}
	
}
