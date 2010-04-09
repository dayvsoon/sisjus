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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author miguel
 */
@Entity
@Table(name="layer")
public class advogadojuiz implements Serializable {

    @Id 
    @Column(name="id" )
    private Integer id_advogadojuiz;


    
    @ManyToOne
    @JoinColumn(name="ID_PERSON")
    private pessoa id_pessoa;

    @Column(name="cod_oab")
    private String cod_oab;

    @Column(name="numerovara")
    private Integer nvara;

    @Column(name="descricaovara")
    private String descricaodaVara;

    @OneToMany(mappedBy="id_advogadojuiz_process", fetch=FetchType.LAZY, targetEntity=processo.class)
    List<processo> ProcessOfUser;


    public advogadojuiz(){
        
    }
    public String getCod_oab() {
        return cod_oab;
    }

    public Integer getId_advogadojuiz() {
        return id_advogadojuiz;
    }

    public void setId_advogadojuiz(Integer id_advogadojuiz) {
        this.id_advogadojuiz = id_advogadojuiz;
    }
    
    public List<processo> getProcessOfUser() {
        return ProcessOfUser;
    }

    public void setProcessOfUser(List<processo> ProcessOfUser) {
        this.ProcessOfUser = ProcessOfUser;
    }
    
    public void setCod_oab(String cod_oab) {
        this.cod_oab = cod_oab;
    }

    public pessoa getId_pessoa() {
        return id_pessoa;
    }

    public void setId_pessoa(pessoa id_pessoa) {
        this.id_pessoa = id_pessoa;
    }

    public String getDescricaodaVara() {
        return descricaodaVara;
    }

    public void setDescricaodaVara(String descricaodaVara) {
        this.descricaodaVara = descricaodaVara;
    }

    public Integer getNvara() {
        return nvara;
    }

    public void setNvara(Integer nvara) {
        this.nvara = nvara;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final advogadojuiz other = (advogadojuiz) obj;
        if (this.id_advogadojuiz != other.id_advogadojuiz && (this.id_advogadojuiz == null || !this.id_advogadojuiz.equals(other.id_advogadojuiz))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + (this.id_advogadojuiz != null ? this.id_advogadojuiz.hashCode() : 0);
        return hash;
    }
@Override
   public String toString(){
       return id_pessoa.getNome();
   }
   /* public String toString(){
        return id;
    }**/

}
