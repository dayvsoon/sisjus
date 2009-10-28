package Filtro;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import javax.faces.context.FacesContext;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.jsp.jstl.sql.Result;
import javax.servlet.jsp.jstl.sql.ResultSupport;
import javax.sql.DataSource;
import javax.naming.Context;


import Cadastro.FactoryConnection;
import Cadastro.Conexao;

public class TabelaDeDados {

	
	    Date data;
		ArrayList<String> Lista = new ArrayList<String>();
		public static Connection Conn = null;
		String Datainicial;
		
		public String getDatainicial() {
			return Datainicial;
		}


		public void setDatainicial(String datainicial) {
			Datainicial = datainicial;
		}


		public Date getData() {
			return data;
		}


		public void setData(Date data) {
			this.data = data;
		}


		public void conecta() throws SQLException, NamingException {
		      if (Conn != null) return;
		      Context ctx = new InitialContext();
		      DataSource ds = (DataSource) ctx.lookup("");
		      Conn = ds.getConnection();   
		   }
		
		FacesContext context = FacesContext.getCurrentInstance();
		   public TabelaDeDados() throws SQLException{
				Conn = FactoryConnection.getConnection("postgres","123456") ;
			}
		
		
		   public Result getAll() throws SQLException{
			   PreparedStatement st;
			   ResultSet rs = null;
			   Connection  Conn = Conexao.getConnection();
				   try {
					st = Conn.prepareStatement("SELECT * FROM processo order by id ");
					rs = st.executeQuery();
					Conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		   	
		   	return ResultSupport.toResult(rs);
		   }
	}


