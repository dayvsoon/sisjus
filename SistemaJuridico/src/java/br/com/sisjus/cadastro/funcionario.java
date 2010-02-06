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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author miguel
 */
@Entity
@Table(name="employeed")
public class funcionario implements Serializable {

    @Id @GeneratedValue(strategy= GenerationType.SEQUENCE)
    @Column(name="id")
    private Integer id;

    @OneToOne()
    @JoinColumn(name="ID_PERSON")
    private pessoa id_pessoa;

    @Column(name="cargo")
    private String cargo;


   

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public pessoa getId_pessoa() {
        return id_pessoa;
    }

    public void setId_pessoa(pessoa id_pessoa) {
        this.id_pessoa = id_pessoa;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


}
