/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisjus.cadastro;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


/**
 *
 * @author miguel
 */
@Entity
@Table(name="person")
public class pessoa implements Serializable {
    
    
    @Id
    @Column(name="id")
    private Integer id;

    @Column(name="nome")
    private String nome;

    @Column(name="sobrenome")
    private String Sobrenome;

    
    @Column(name="datanasc")
    private String data_nasc;

    @Column(name="endereco")
    private String endereco;

    @Column(name="bairro")
    private String bairro;

    @Column(name="cep")
    private String cep;

    @Column(name="uf")
    private String uf;

    @Column(name="cidade")
    private String cidade;

    @Column(name="email")
    private String email;

    @Column(name="telefone")
    private String telefone;

    @Column(name="celular")
    private String celular;

    @Column(name="profissao")
    private String profissao;

    
    @Column(name="datacadastro")
    private String data_cadastro = br.com.sisjus.util.Data.Formatador;

    @Column(name="sexo")
    private char sexo;

    @Column(name="rg")
    private String Identidade;
    
    @OneToMany(mappedBy = "id_pessoa",fetch=FetchType.LAZY)
    private List<advogadojuiz> nomeadvogadojuiz;

  /* @OneToMany(mappedBy = "id_pessoa_cliente",fetch=FetchType.LAZY)
    private List<cliente> nomeCliente;*/

    @OneToMany(mappedBy="id_pessoa", fetch=FetchType.LAZY)
    private List <funcionario> nomeFuncionario;

    @OneToMany(mappedBy="id_pessoa", fetch=FetchType.LAZY)
    private List<processo> qProcesso;


   public pessoa() {
    
   }

   
   

    public String getIdentidade() {
        return Identidade;
    }

    public void setIdentidade(String Identidade) {
        this.Identidade = Identidade;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public void setSobrenome(String Sobrenome) {
        this.Sobrenome = Sobrenome;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(String data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    public String getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public List<advogadojuiz> getNomeadvogadojuiz() {
        return nomeadvogadojuiz;
    }

    public void setNomeadvogadojuiz(List<advogadojuiz> nomeadvogadojuiz) {
        this.nomeadvogadojuiz = nomeadvogadojuiz;
    }

  /*  public List<cliente> getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(List<cliente> nomeCliente) {
        this.nomeCliente = nomeCliente;
    }*/

    public List<funcionario> getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(List<funcionario> nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public List<processo> getqProcesso() {
        return qProcesso;
    }

    public void setqProcesso(List<processo> qProcesso) {
        this.qProcesso = qProcesso;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final pessoa other = (pessoa) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }

    @Override
   public String toString(){
       return nome;
   }
    
    

}
