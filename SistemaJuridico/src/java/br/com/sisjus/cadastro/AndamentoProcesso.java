/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisjus.cadastro;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private Integer iD;
    @Column(name="numeroProcesso")
    private String numeroProcesso;
    @Column(name="status")
    private Integer status;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getiD() {
        return iD;
    }

    public void setiD(Integer iD) {
        this.iD = iD;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AndamentoProcesso other = (AndamentoProcesso) obj;
        if (this.iD != other.iD && (this.iD == null || !this.iD.equals(other.iD))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + (this.iD != null ? this.iD.hashCode() : 0);
        return hash;
    }
    
   
    
    
}
