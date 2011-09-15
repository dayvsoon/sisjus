/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sisjus.cadastro;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;


/**
 *
 * @author miguel
 */
@Entity
@Table(name="protocolo")
public class Protocolo implements  Serializable {

    /** Creates a new instance of Protocolo */
    public Protocolo() {
    }

    @Id
    @Column(name="id")
    private String NumeroProcesso;
    @Column(name="arquivado")
    private String Arquivado;
    @Column(name="arquivadoonde")
    private String ArquivadoOnde;
    @Column(name="lugarondeestaoprocesso")
    private String LugarOndeEstaOProcesso;
    @Column(name="data_tramite")
    @Temporal(TemporalType.TIMESTAMP)
    private Date data_tramite;
    @Column(name="assunto")
    private String Assunto;
    @Column(name="resenha")
    private String Resenha;
    @Column(name="origem")
    private String Origem;
    @Column(name="destino")
    private String Destino;
    @Transient
    private int CountWordOfResenha;
    @Transient
    public boolean Acesso;
    @Transient
    public boolean Disable;

    public boolean isAcesso() {
        return Acesso;
    }

    public void setAcesso(boolean Acesso) {
        this.Acesso = Acesso;
    }


    public String getArquivado() {
        return Arquivado;
    }

    public void setArquivado(String Arquivado) {


        this.Arquivado = Arquivado;
    
    }

    public String getArquivadoOnde() {
        return ArquivadoOnde;
    }

    public void setArquivadoOnde(String ArquivadoOnde) {
        this.ArquivadoOnde = ArquivadoOnde;
        if (Arquivado.equals("Sim")){
            Acesso = false;
            Disable = true;
            Destino = "Arquivo";
        }else{
            if (Arquivado.equals("Não")){
               Acesso = true;
               
            }
        }
    }

    public String getAssunto() {
        return Assunto;
    }

    public void setAssunto(String Assunto) {
        this.Assunto = Assunto;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

    public String getLugarOndeEstaOProcesso() {
        return LugarOndeEstaOProcesso;
    }

    public void setLugarOndeEstaOProcesso(String LugarOndeEstaOProcesso) {
        this.LugarOndeEstaOProcesso = LugarOndeEstaOProcesso;
    }

    public String getNumeroProcesso() {
        return NumeroProcesso;
    }

    public void setNumeroProcesso(String NumeroProcesso) {
        this.NumeroProcesso = NumeroProcesso;
    }



    public String getOrigem() {
        return Origem;
    }

    public void setOrigem(String Origem) {
        this.Origem = Origem;
    }

    public String getResenha() {
        return Resenha;
    }

    public void setResenha(String Resenha)
    {
        this.Resenha = Resenha;
        this.CountWordOfResenha = Resenha.length();
    }

    public Date getData_tramite() {
        return data_tramite;
    }

    public void setData_tramite(Date data_tramite) {
        this.data_tramite = data_tramite;
    }

    public int getCountWordOfResenha() {
        return CountWordOfResenha;
    }

    public void setCountWordOfResenha(int CountWordOfResenha) {
        this.CountWordOfResenha = CountWordOfResenha;
    }

    public boolean isDisable() {
        return Disable;
    }

    public void setDisable(boolean Disable) {
        this.Disable = Disable;
    }



}
