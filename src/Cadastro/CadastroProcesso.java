package Cadastro;

	import java.sql.Connection;
	import java.sql.PreparedStatement;
    import java.sql.ResultSet;
	import java.sql.SQLException;
    import javax.faces.context.FacesContext;
    import javax.swing.*;

public class CadastroProcesso {
	  
	   private String NomeDoAutor;
	   private String NomeDoReu;
	   private int NumeroProcesso;
	   private String Status;
	   private String DescricaoDoProcesso;
	   private String Observacao;
	   private String Cod_dir;
	   private int    TamanhoDoCodDir;
	   private String CodigoGerado;
	   private int cod_id;
	   private int id;
	   public static Connection Conn = null;
	  
	   
	   FacesContext context = FacesContext.getCurrentInstance();
	   public CadastroProcesso() throws SQLException{
			Conn = FactoryConnection.getConnection("postgres","123456") ;
		}
	   
	   
    
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getCod_dir() {
		return Cod_dir;
	}
    public void setCod_dir(String cod_dir) {
		Cod_dir = cod_dir;
		TamanhoDoCodDir = Cod_dir.length();
	}
    public int getTamanhoDoCodDir() {
		return TamanhoDoCodDir;
	}



	public void setTamanhoDoCodDir(int tamanhoDoCodDir) {
		TamanhoDoCodDir = tamanhoDoCodDir;
	}



	public String getCodigoGerado() {
		return CodigoGerado;
	}



	public void setCodigoGerado(String codigoGerado) {
		CodigoGerado = codigoGerado;
	}



	public int getCod_id() {
		return cod_id;
	}



	public void setCod_id(int cod_id) {
		this.cod_id = cod_id;
	}



	public String getNomeDoAutor() {
		return NomeDoAutor;
	}
	public String getNomeDoReu() {
		return NomeDoReu;
	}
	public void setNomeDoAutor(String nomeDoAutor) {
		NomeDoAutor = nomeDoAutor;
	}
	public void setNomeDoReu(String nomeDoReu) {
		NomeDoReu = nomeDoReu;
	}
	public int getNumeroProcesso() {
		return NumeroProcesso;
	}
	public String getStatus() {
		return Status;
	}
	public String getDescricaoDoProcesso() {
		return DescricaoDoProcesso;
	}
	public String getObservacao() {
		return Observacao;
	}
	public void setNumeroProcesso(int numeroProcesso) {
		NumeroProcesso = numeroProcesso;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public void setDescricaoDoProcesso(String descricaoDoProcesso) {
		DescricaoDoProcesso = descricaoDoProcesso;
	}
	public void setObservacao(String observacao) {
		Observacao = observacao;
	}
	   
	   
	   public String InserirDados() throws SQLException {
		   
		   PreparedStatement st;
		   PreparedStatement stm;
		   ResultSet rs;
		   
		   try{
			   stm = Conn.prepareStatement("Select id From processo");
			   st = Conn.prepareStatement("Insert Into processo(nomedoautor,nomedoreu,numerodoprocesso,status,descricaodoprocesso,observacao,cod_id) values(?,?,?,?,?,?,?)");
			   stm.execute();
			   rs = stm.executeQuery();
			   while (rs.next()){
				   cod_id = rs.getInt(1);
			   }
			   if (TamanhoDoCodDir > 10){
					CodigoGerado = Cod_dir.substring(0,1)+Cod_dir.substring(9, 12)+ NumeroProcesso+ cod_id;
				}else
				CodigoGerado = Cod_dir.substring(0,3)+NumeroProcesso+cod_id;
			   
								
			   st.setString(1,getNomeDoAutor());
			   st.setString(2, getNomeDoReu());
			   st.setInt(3, getNumeroProcesso());
			   st.setString(4, getStatus());
			   st.setString(5, getDescricaoDoProcesso());
			   st.setString(6, getObservacao());
			   st.setString(7,getCodigoGerado());
			   st.execute();
			   st.close();
			   //context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "inserido com sucesso", ""));
			    JOptionPane.showMessageDialog(null,"Lembre o codigo deste processo é: "+CodigoGerado );
				return "Ok";
			   
		   }catch (Exception e) {
				e.printStackTrace();
				
				//context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "nao foi possivel inserir ao banco", ""));
				
				return "invalidInsert";
			}
	   }
	}


