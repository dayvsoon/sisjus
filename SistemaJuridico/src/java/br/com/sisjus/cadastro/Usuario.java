/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sisjus.cadastro;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 *
 * @author miguel
 * Cadastro de usuário
 */

@Entity
@Table(name="users")
public class Usuario implements Serializable

{
    private static final long serialVersionUID = 1L;

    
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    @Column(name="id")
    private Integer id_user;

    @Column(name="nome",nullable=false)
    private String nome = "Usuário";

    @Column(name="sobrenome",nullable=false)
    private String sobrenome = "Usuário";


    @Column(name="login",nullable=false)
    private String Login = "Usuário";
    
    @Column(name="password", nullable=false)
    private String Password;

    //private String Permissão;
    
    @Column(name="dataentrada")
    private String DataDeCadastro =  br.com.sisjus.util.Data.Formatador;

    @OneToMany(mappedBy="owner", fetch=FetchType.LAZY)
    List<processo> ProcessOfUser;

    
    public Usuario() {
    }

   

    public String getDataDeCadastro() {
        return DataDeCadastro;
    }

    public void setDataDeCadastro(String DataDeCadastro) {
        this.DataDeCadastro = DataDeCadastro;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }
    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

   /* public String getPermissão() {
        return Permissão;
    }

    public void setPermissão(String Permissão) {
        this.Permissão = Permissão;
    }
**/
    public Integer getId_user() {
        return id_user;
    }

    public void setId_user(Integer id_user) {
        this.id_user = id_user;
    }



            public boolean VerificarValiUsuário(String UsuarioTeste){
        //Usuario no equals tem que mudar
        return UsuarioTeste.equals(Login);



    }

    public List<processo> getProcessOfUser() {
        return ProcessOfUser;
    }

    public void setProcessOfUser(List<processo> ProcessOfUser) {
        this.ProcessOfUser = ProcessOfUser;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }



   
}
