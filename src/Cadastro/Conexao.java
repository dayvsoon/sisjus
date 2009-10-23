package Cadastro;

import java.sql.*;

public class Conexao {
	private static final String driver = null;
	private static final String url = "jdbc:postgresql://localhost/teste";
	private java.sql.Connection Conn = null;
	private Statement sql = null;
	public Statement stmt;
	public Statement stmt1;
	public String query = "select * from teste";
	
	
	
	
	
	public static String getDriver() {
		return driver;
	}
	public static String getUrl() {
		return url;
	}
	public java.sql.Connection getConn() {
		return Conn;
	}
	public Statement getSql() {
		return sql;
	}
	public void setConn(java.sql.Connection conn) {
		Conn = conn;
	}
	public void setSql(Statement sql) {
		this.sql = sql;
	}


	 public static Connection getConnection() throws SQLException {
         try {
                 Class.forName("org.postgresql.Driver");
                 System.out.println("Banco Conectado");
                 return DriverManager.getConnection(url,"postgres","123456");
         }
         catch (ClassNotFoundException e) {
                 throw new SQLException(e.getMessage());
         }
 }
	 public void close() {  
         
         try {  
           if (sql != null)  
               sql.close();  
           Conn.close();  
         } catch (SQLException e) {  
           e.printStackTrace();  
        }        
    }
	public PreparedStatement prepareStatement(String string,
			int typeScrollInsensitive, int concurReadOnly) {
		
		return null;
	}  


}


