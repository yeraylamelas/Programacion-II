package LD;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import LN.clsProducto;

 
public class ProductosBD 
{	
	
	private GestorBD gestorBD = new GestorBD();
	
	
  public List<clsProducto> cargarListaCoches()
  {
    ArrayList<clsProducto> vectorBD = new ArrayList<>();
    
    try
    {
      // Todos los accesos a bases de datos deben ir entre try/catch
      // Establecemos una conexi�n con nuestra base de datos
      gestorBD.connect();
         
      // Creamos y ejecutamos una sentencia SQL
      Statement stmt = gestorBD.createStatement();
       
      //hay una tabla coches en la BD
      ResultSet rs = stmt.executeQuery("SELECT * FROM Producto");
       
      // Tratamos los resultado obtenidos en la consulta SQL
      while(rs.next())
      {
    	  
        clsProducto nuevoProducto = new clsProducto(  	rs.getString("identificador"),
                                        rs.getString("marca"),
                                        rs.getString("tipo"));                                        
        vectorBD.add(nuevoProducto);
      }  
       
    }
    catch(SQLException se)
    {
         
        se.printStackTrace();
    }
    
    return vectorBD;
  }
   
  
  
  public clsProducto buscarPersona(String identificador ) 
  {
	try {
		gestorBD.connect();

		Statement sentencia = gestorBD.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
				ResultSet.CONCUR_UPDATABLE);

		ResultSet rs = sentencia.executeQuery("SELECT * FROM Producto where identificador = '" + identificador + "'");

		String marca = rs.getString("marca");
		String tipo = rs.getString("tipo");

		clsProducto c = new clsProducto(identificador, marca, tipo);

		return c;
	} catch (SQLException se) {
		se.printStackTrace();

		return null;
	} 
  }  
  
  public boolean existeProducto(String identificador )
  {
    try
    {
       gestorBD.connect();
         
      // Creamos y ejecutamos una sentencia SQL
      Statement sentencia = 
      gestorBD.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,             
                                           ResultSet.CONCUR_UPDATABLE);
            
      ResultSet rs = sentencia.executeQuery("SELECT * FROM Producto where identificador = '" + identificador +"'" );
       
      System.out.println("SELECT * FROM Producto where identificador = '" + identificador +"'");
      
      if ( rs.first() == false )
      {
    	  return false;
      }
      else
      {
    	  return true;
      }
       
    }
    catch (SQLException se)
    {
        se.printStackTrace();
        
        return false;
    }    
  }
 
  public void insertarProducto( String identificador , String marca, String tipo )
  {     
    try
    {
      gestorBD.connect();
       
      Statement sentencia =  gestorBD.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,             
                                           ResultSet.CONCUR_UPDATABLE);
 
      boolean r = existeProducto( identificador );
       
      if(r == false)
      {         
    	 String query ="insert into Producto values('"+ identificador + "'" +
                ",'"+ marca +"',"+ tipo +")";
             
         sentencia.executeUpdate(query);
      }
      else
      {
          System.out.println("Producto Existente!");
      }
       
      gestorBD.disconnect();
     
    }
    catch(SQLException se)
    {
        se.printStackTrace();
    }
 }
}
