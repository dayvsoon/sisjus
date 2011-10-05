/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisjus.cadastro;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author miguel
 */
@Entity
@Table(name="andamento")
public class AndamentoProcesso implements Serializable{

    @Id
    @Column(name="id")
    private String numeroProcesso;
    @Column(name="status")
    private String status;
    @Column(name="datamovimento")
    private String data = br.com.sisjus.util.Data.Formatador;
    @Column(name="processobservation")
    private String observacao_processo;

    /** Creates a new instance of AndamentoProcesso */
    public AndamentoProcesso() {
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getNumeroProcesso() {
        return numeroProcesso;
    }

    public void setNumeroProcesso(String numeroProcesso) {
        this.numeroProcesso = numeroProcesso;
    }

    public String getObservacao_processo() {
        return observacao_processo;
    }

    public void setObservacao_processo(String observacao_processo) {
        this.observacao_processo = observacao_processo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
   
    
    
}
