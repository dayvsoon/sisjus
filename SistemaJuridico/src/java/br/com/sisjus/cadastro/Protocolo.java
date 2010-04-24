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
    private int NumeroProcesso;
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

    public int getNumeroProcesso() {
        return NumeroProcesso;
    }

    public void setNumeroProcesso(int NumeroProcesso) {
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

    public void setResenha(String Resenha) {
        this.Resenha = Resenha;
    }

    public Date getData_tramite() {
        return data_tramite;
    }

    public void setData_tramite(Date data_tramite) {
        this.data_tramite = data_tramite;
    }



}
