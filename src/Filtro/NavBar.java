package Filtro;
 
import java.sql.*;

public class NavBar {

int Qtdprocesso;
public static Connection Conn = null;
private String StatusProcesso;
private String ColocacaoDaPalavra;



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

public int Dados() throws SQLException{

PreparedStatement st;
ResultSet rs;
try{
st = Conn.prepareStatement("Select status from processo where status<>'Finalizado'");
st.execute();
System.out.println(st);
rs = st.executeQuery();

while(rs.next()){
	Qtdprocesso = rs.getInt(5);
	if(Qtdprocesso >= 2){
		ColocacaoDaPalavra = "Processos";
	}else{
		ColocacaoDaPalavra = "Processo";
	}
		
    }
     st.close();
}catch (SQLException e){
	e.printStackTrace();
	Conn.close();
}
return Qtdprocesso;
}
}
