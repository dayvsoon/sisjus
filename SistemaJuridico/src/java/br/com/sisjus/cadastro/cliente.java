/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sisjus.cadastro;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author miguel
 */

@Entity
@Table(name="cliente")
public class cliente implements Serializable {

   
    @Id @GeneratedValue(strategy= GenerationType.SEQUENCE)
    @Column(name="id")
    private Integer id;
    
    @JoinColumn(name="ID_PESSOA")
    @ManyToOne
    private pessoa id_pessoa_cliente;

    @Column(name="cpfcnpj")
    private String cpfcnpj;
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name="datainicio")
    private Date datainicio;

    @OneToMany(mappedBy="id_cliente", fetch=FetchType.LAZY)
    List<processo> ProcessOfUser;



    public cliente(){
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCpfcnpj() {
        return cpfcnpj;
    }

    public List<processo> getProcessOfUser() {
        return ProcessOfUser;
    }

    public void setProcessOfUser(List<processo> ProcessOfUser) {
        this.ProcessOfUser = ProcessOfUser;
    }

    public void setCpfcnpj(String cpfcnpj) {
        this.cpfcnpj = cpfcnpj;
    }

    public Date getDatainicio() {
        return datainicio;
    }

    public void setDatainicio(Date datainicio) {
        this.datainicio = datainicio;
    }

    public pessoa getId_pessoa_cliente() {
        return id_pessoa_cliente;
    }

    public void setId_pessoa_cliente(pessoa id_pessoa_cliente) {
        this.id_pessoa_cliente = id_pessoa_cliente;
    }
    



    

}
