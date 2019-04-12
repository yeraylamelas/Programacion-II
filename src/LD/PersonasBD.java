package LD;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PersonasBD {

	private GestorBD gestorBD = new GestorBD();

	public ResultSet cargarListaPersonas() {

		ResultSet rs;

		try {
			// Todos los accesos a bases de datos deben ir entre try/catch
			// Establecemos una conexi�n con nuestra base de datos
			gestorBD.conectar();

			// Creamos y ejecutamos una sentencia SQL
			Statement stmt = gestorBD.createStatement();

			// hay una tabla persona en la BD
			rs = stmt.executeQuery("SELECT * FROM clientes");

			/*
			 * // Tratamos los resultado obtenidos en la consulta SQL while (rs.next()) {
			 * 
			 * clsPersona nuevaPersona = new clsPersona(rs.getString("identificador"),
			 * rs.getString("nombre"), rs.getString("apellido"));
			 * vectorBD.add(nuevaPersona); }
			 */

			return rs;

		} catch (SQLException se) {

			se.printStackTrace();
			return null;
		}

	}

	/*
	 * public boolean buscarPersona(String identificador) { try {
	 * gestorBD.connect();
	 * 
	 * Statement sentencia =
	 * gestorBD.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
	 * ResultSet.CONCUR_UPDATABLE);
	 * 
	 * ResultSet rs = sentencia
	 * .executeQuery("SELECT * FROM Persona where identificador = '" + identificador
	 * + "'");
	 * 
	 * String nombre = rs.getString("nombre"); String apellido =
	 * rs.getString("apellido");
	 * 
	 * clsPersona c = new clsPersona(identificador, nombre, apellido);
	 * 
	 * return c; } catch (SQLException se) { se.printStackTrace();
	 * 
	 * return false; } }
	 */

	public void insertarPersona(String identificador, String nombre, String apellido) {
		try {

			gestorBD.conectar();

			Statement sentencia = gestorBD.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

			boolean rs = existePersona(identificador);

			if (rs == false) {
				String query = "insert into clientes values('" + identificador + "'" + ",'" + nombre + "'," + apellido
						+ ")";

				sentencia.executeUpdate(query);
			} else {
				System.out.println("Persona Existente!");
			}

			gestorBD.desconectar();

		} catch (SQLException se) {
			se.printStackTrace();
		}
	}

	public boolean existePersona(String identificador) {
		try {
			gestorBD.conectar();

			// Creamos y ejecutamos una sentencia SQL
			Statement sentencia = gestorBD.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

			ResultSet rs = sentencia
					.executeQuery("SELECT * FROM clientes where identificador = '" + identificador + "'");

			System.out.println("SELECT * FROM clientes where identificador = '" + identificador + "'");

			if (rs.first() == false) {
				return false;
			} else {
				return true;
			}

		} catch (SQLException se) {
			se.printStackTrace();

			return false;
		}

	}

}
