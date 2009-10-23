package Cadastro;

import java.sql.*;



public class FactoryConnection {


	public static Connection Conn = null;
  
	
	public static Connection getConnection(String nome, String senha) throws SQLException{
		
		try {
			Class.forName("org.postgresql.Driver");
		Conn = DriverManager.getConnection("jdbc:postgresql://localhost/teste",nome,senha);
		return Conn;
		} catch (ClassNotFoundException e) {
			
			throw new SQLException(e.getMessage());
		
		}
	
	}

}
