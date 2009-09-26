package Filtro;

import java.sql.*;
import javax.faces.context.FacesContext;
import Cadastro.FactoryConnection;
import javax.swing.*;


public class BuscaProcesso {

	private int cod_id;
	private String Cod_dir;
	private int    numeropro;
	private String CodigoGerado;
	private int    TamanhoDoCodDir;
	private String ValordaBusca;
	private Object ValorProcurado;
	private String ObservacaoProcesso;
	public String Autor;
	public String Reu;
	private int    NProcesso;
	private String Status;
	private String DescricaoProcesso;
	public String sparte;
	public String pparte;
	public int id;
	public static Connection Conn = null;
	public String situacao;
	public String dprocesso;
	public String op;
	public boolean abilitarautor = true;
	public boolean abilitarreu = true;
	public boolean abilitarnumeroprocesso = true;
	public boolean abilitarstatus = true;
	
	
	FacesContext context = FacesContext.getCurrentInstance();
	   public BuscaProcesso() 
			 throws SQLException{
			Conn = FactoryConnection.getConnection("postgres","123456") ;
		}
	   
	
	   
	   
	public boolean isAbilitarautor() {
		return abilitarautor;
	}




	public void setAbilitarautor(boolean abilitarautor) {
		this.abilitarautor = abilitarautor;
	}




	public boolean isAbilitarreu() {
		return abilitarreu;
	}




	public void setAbilitarreu(boolean abilitarreu) {
		this.abilitarreu = abilitarreu;
	}




	public boolean isAbilitarnumeroprocesso() {
		return abilitarnumeroprocesso;
	}




	public void setAbilitarnumeroprocesso(boolean abilitarnumeroprocesso) {
		this.abilitarnumeroprocesso = abilitarnumeroprocesso;
	}




	public boolean isAbilitarstatus() {
		return abilitarstatus;
	}




	public void setAbilitarstatus(boolean abilitarstatus) {
		this.abilitarstatus = abilitarstatus;
	}




	public int getCod_id() {
		return cod_id;
	}




	public void setCod_id(int cod_id) {
		this.cod_id = cod_id;
	}




	public String getOp() {
		return op;
	}


	public void setOp(String op) {
		this.op = op;
	}


	public String getDprocesso() {
		return dprocesso;
	}


	public void setDprocesso(String dprocesso) {
		this.dprocesso = dprocesso;
	}


	public String getSituacao() {
		return situacao;
	}


	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}


	public String getReu() {
		return Reu;
	}


	public void setReu(String reu) {
		Reu = reu;
	}


	public String getSparte() {
		return sparte;
	}


	public void setSparte(String sparte) {
		this.sparte = sparte;
	}

    
	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getPparte() {
		return pparte;
	}


	public void setPparte(String pparte) {
		this.pparte = pparte;
	}


	public String getValordaBusca() {
		return ValordaBusca;
	}


	public void setValordaBusca(String valordaBusca) {
		ValordaBusca = valordaBusca;
	}


	public Object getValorProcurado() {
		return ValorProcurado;
	}


	public void setValorProcurado(Object valorProcurado) {
		ValorProcurado = valorProcurado;
	}
       
    
	

	public String getObservacaoProcesso() {
		return ObservacaoProcesso;
	}


	public void setObservacaoProcesso(String observacaoProcesso) {
		ObservacaoProcesso = observacaoProcesso;
	}


	public int getNProcesso() {
		return NProcesso;
	}


	public void setNProcesso(int processo) {
		NProcesso = processo;
	}


	public String getStatus() {
		return Status;
	}


	public void setStatus(String status) {
		Status = status;
	}


	public String getDescricaoProcesso() {
		return DescricaoProcesso;
	}


	public void setDescricaoProcesso(String descricaoProcesso) {
		DescricaoProcesso = descricaoProcesso;
	}


	public void setAutor(String autor) {
		Autor = autor;
	}


	public String getCod_dir() {
		return Cod_dir;
	}
	public int getNumeropro() {
		return numeropro;
	}
	public void setCod_dir(String cod_dir) {
		Cod_dir = cod_dir;
		TamanhoDoCodDir = Cod_dir.length();
	}
	public void setNumeropro(int numeropro) {
		this.numeropro = numeropro;
	}
	public String getCodigoGerado() {
		return CodigoGerado;
	}
	public void setCodigoGerado(String codigoGerado) {
		CodigoGerado = codigoGerado;
	}
	
	public int getTamanhoDoCodDir() {
		return TamanhoDoCodDir;
	}
	public void setTamanhoDoCodDir(int tamanhoDoCodDir) {
		TamanhoDoCodDir = tamanhoDoCodDir;
	}
	public String GerarCodigo(){
	//	TamanhoDoCodDir = Cod_dir.length();
		if (TamanhoDoCodDir > 10){
			CodigoGerado = Cod_dir.substring(0,1)+Cod_dir.substring(9, 12)+ numeropro ;
		}else
		CodigoGerado = Cod_dir.substring(0,3)+numeropro;
		
		return CodigoGerado;
		
	}
	
	public String Buscar()throws SQLException{
		PreparedStatement stm;
		ResultSet rs;
		try{
			//System.out.println(ValordaBusca"="+);
		stm = Conn.prepareStatement("Select * From processo where "+ValordaBusca+"='"+ValorProcurado+"'");
		System.out.println("Valor = "+stm);
		stm.execute();
		rs = stm.executeQuery();
		System.out.println("Valor rs = "+rs);
		 while (rs.next()){
			 id = rs.getInt(1);
			 pparte =  rs.getString(2);
			 sparte = rs.getString(3);
			 NProcesso = rs.getInt(4);
			 situacao = rs.getString(5);
			 dprocesso = rs.getString(6);
			 op  = rs.getString(7);
			 CodigoGerado = rs.getString(8);
			 
		 }
	   System.out.println("pparte = "+pparte);
	   System.out.println("sparte = "+sparte);
	   if( pparte == null || sparte == null){
		   JOptionPane.showMessageDialog(null,"Nenhum resultado Encontrado" ) ;
		     }
       		  
		
		 
		 
	}catch (Exception e) {
		e.printStackTrace();
		
		Conn.close();
	}
     return ObservacaoProcesso;	
}


	public String getAutor() {
		return Autor;
	}



public String Atualizar()throws SQLException{
	PreparedStatement stu;
	PreparedStatement stua;
	try{
	if (abilitarautor == false){
		String Atualizador = pparte;
		System.out.println("Atualizador ="+ Atualizador );
		stu = Conn.prepareStatement("UPDATE processo SET nomedoautor = "+Atualizador+" where nomedoautor = "+pparte+" and id='"+id+"'"); 
	    stua = Conn.prepareStatement("Select * FROM processo order by id");
		stu.execute();
		stua.execute();
		stu.executeQuery();
	}}catch (Exception e) {
		e.printStackTrace();
		
		Conn.close();
	}
	
	
	
	return "ok";
}
	
	
	
	

}


	

