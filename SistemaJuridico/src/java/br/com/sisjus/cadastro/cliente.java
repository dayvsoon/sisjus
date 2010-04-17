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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 *
 * @author miguel
 */

@Entity
@Table(name="client")
public class cliente implements Serializable {

   
    @Id 
    @Column(name="id")
    private Integer id;
    
    /*@JoinColumn(name="ID_PESSOA")
    @ManyToOne
    private pessoa id_pessoa_cliente;*/

    @Column(name="cpfcnpj")
    private String cpfcnpj;

    
    @Column(name="datainicio")
    private String datainicio = br.com.sisjus.util.Data.Formatador;

    @Column(name="nomepessoa")
    private String nome_pessoa;

    /*@OneToMany(mappedBy="id_cliente", fetch=FetchType.LAZY)
    List<processo> ProcessOfUser;

    @OneToOne(mappedBy="id", fetch=FetchType.LAZY)
    List<pessoa> NomePessoa;*/


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

    public void setCpfcnpj(String cpfcnpj) {
        this.cpfcnpj = cpfcnpj;
    }

    public String getDatainicio() {
        return datainicio;
    }

    public void setDatainicio(String datainicio) {
        this.datainicio = datainicio;
    }

 /*   public pessoa getId_pessoa_cliente() {
        return id_pessoa_cliente;
    }

    public void setId_pessoa_cliente(pessoa id_pessoa_cliente) {
        this.id_pessoa_cliente = id_pessoa_cliente;
    }
*/
    public String getNome_pessoa() {
        return nome_pessoa;
    }

    public void setNome_pessoa(String nome_pessoa) {
        this.nome_pessoa = nome_pessoa;
    }

/*



    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final cliente other = (cliente) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        if (this.id_pessoa_cliente != other.id_pessoa_cliente && (this.id_pessoa_cliente == null || !this.id_pessoa_cliente.equals(other.id_pessoa_cliente))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 67 * hash + (this.id_pessoa_cliente != null ? this.id_pessoa_cliente.hashCode() : 0);
        return hash;
    }
    

 @Override
   public String toString(){
       return id_pessoa_cliente.getNome();
   }

*/
    

}
