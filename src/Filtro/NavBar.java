package Filtro;
 
import java.sql.*;

import Cadastro.FactoryConnection;

public class NavBar {

public String comparacao;	
public int Qtdprocesso;
public static Connection Conn = null;
private String StatusProcesso;
private String ColocacaoDaPalavra;

public NavBar() throws SQLException{
	Conn = FactoryConnection.getConnection("postgres", "123456");
}


 
public String getComparacao() {
	return comparacao;
}



public void setComparacao(String comparacao) {
	this.comparacao = comparacao;
}



public String getColocacaoDaPalavra() {
	return ColocacaoDaPalavra;
}

public void setColocacaoDaPalavra(String colocacaoDaPalavra) {
	ColocacaoDaPalavra = colocacaoDaPalavra;
}

public int getQtdprocesso() {
	return Qtdprocesso;
}

public void setQtdprocesso(int qtdprocesso) {
	Qtdprocesso = qtdprocesso;
}

public String getStatusProcesso() {
	return StatusProcesso;
}

public void setStatusProcesso(String statusProcesso) {
	StatusProcesso = statusProcesso;
}

public String Dados() throws SQLException{

PreparedStatement st;
ResultSet rs;
    try{
       st = Conn.prepareStatement("Select status from processo where status <> 'Finalizado'");
         st.execute();
             System.out.println(st);
               rs = st.executeQuery();

         while(rs.next()){
	          comparacao = rs.getString("status");
	          if(comparacao != "Finalizado"){
	        	   Qtdprocesso+= 1;
	          }
	          if(Qtdprocesso >= 2){
	        		ColocacaoDaPalavra = "processos";
	        	}else{
	        		ColocacaoDaPalavra = "processo";
	        	}
		
    }

     st.close();
}catch (SQLException e){
	e.printStackTrace();
	Conn.close();
}
return "ok";
}
}
