package LD;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import LN.clsPersona;

 
public class PersonasBD 
{	
	
  public static List<clsPersona> cargarListaCoches()
  {
    ArrayList<clsPersona> vectorBD = new ArrayList<>();
    
    try
    {
      // Todos los accesos a bases de datos deben ir entre try/catch
      // Establecemos una conexi�n con nuestra base de datos
      GestorBD.getInstance().connect();
         
      // Creamos y ejecutamos una sentencia SQL
      Statement stmt = GestorBD.getInstance().createStatement();
       
      //hay una tabla coches en la BD
      ResultSet rs = stmt.executeQuery("SELECT * FROM Persona");
       
      // Tratamos los resultado obtenidos en la consulta SQL
      while(rs.next())
      {
    	  
        clsPersona nuevaPersona = new clsPersona(  	rs.getString("identificador"),
                                        rs.getString("nombre"),
                                        rs.getString("apellido"));                                        
        vectorBD.add(nuevaPersona);
      }  
       
    }
    catch(SQLException se)
    {
         
        se.printStackTrace();
    }
    
    return vectorBD;
  }
   
  
  
  public static clsPersona buscarPersona(String identificador ) 
  {
	try {
		GestorBD.getInstance().connect();

		Statement sentencia = GestorBD.getInstance().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
				ResultSet.CONCUR_UPDATABLE);

		ResultSet rs = sentencia.executeQuery("SELECT * FROM Persona where identificador = '" + identificador + "'");

		String nombre = rs.getString("nombre");
		String apellido = rs.getString("apellido");

		clsPersona c = new clsPersona(identificador, nombre, apellido);

		return c;
	} catch (SQLException se) {
		se.printStackTrace();

		return null;
	} 
  }  
  
  public static boolean existePersona(String identificador )
  {
    try
    {
       GestorBD.getInstance().connect();
         
      // Creamos y ejecutamos una sentencia SQL
      Statement sentencia = 
      GestorBD.getInstance().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,             
                                           ResultSet.CONCUR_UPDATABLE);
            
      ResultSet rs = sentencia.executeQuery("SELECT * FROM Persona where identificador = '" + identificador +"'" );
       
      System.out.println("SELECT * FROM Persona where identificador = '" + identificador +"'");
      
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
 
  public static void insertarPersona( String identificador , String nombre, String apellido )
  {     
    try
    {
      GestorBD.getInstance().connect();
       
      Statement sentencia =  GestorBD.getInstance().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,             
                                           ResultSet.CONCUR_UPDATABLE);
 
      boolean r = existePersona( identificador );
       
      if(r == false)
      {         
    	 String query ="insert into Persona values('"+ identificador + "'" +
                ",'"+ nombre +"',"+ apellido +")";
             
         sentencia.executeUpdate(query);
      }
      else
      {
          System.out.println("Persona Existente!");
      }
       
      GestorBD.getInstance().disconnect();
     
    }
    catch(SQLException se)
    {
        se.printStackTrace();
    }
 }

}
