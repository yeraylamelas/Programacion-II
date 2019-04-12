package LD;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
 
public class GestorBD {
	
	private Connection conexion = null;
	private Statement sentencia;
     
public void conectar () {
		
		try
		{
			//Class.forName("com.mysql.jdbc.Driver");
			
			// useSSL = true para que la conexion sea cifrada
			String sURL = "jdbc:mysql://localhost:3306/mydb?useSSL=true&serverTimezone=GMT";
		
			conexion = java.sql.DriverManager.getConnection(sURL, "root", "Glorioso1921");
		}
		catch( Exception e )
		{
			e.printStackTrace();
		}
			
			
	}
	
	
	public void desconectar () {
		
		try {
			comprobarConexion();
			conexion.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	public void comprobarConexion () {
		
		if (conexion == null)
			throw new IllegalStateException("La conexion a la BD no ha sido creada todavia.");
		
		
	}
	
	
	public void insertar (String sql) {
		
		try {
			conectar();
			
			sentencia = conexion.createStatement();
			
			sentencia.executeUpdate(sql);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				sentencia.close();
				conexion.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	public Statement createStatement() throws SQLException
    {
        comprobarConexion();
        return conexion.createStatement();
    }   
     
    public Statement createStatement(int resultSetType , int resultSetConcurrency ) throws SQLException
    {
    	comprobarConexion();
        return conexion.createStatement(resultSetType, resultSetConcurrency );
    }   	
   
	
	
}