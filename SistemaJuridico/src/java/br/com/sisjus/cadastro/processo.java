/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sisjus.cadastro;

import java.io.Serializable;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.joda.time.Days;
import org.joda.time.LocalDate;
/**
 *
 * @author miguel
 */
@Entity
@Table(name="process")
public class processo implements Serializable {
    
    @Id @GeneratedValue(strategy= GenerationType.SEQUENCE)
    @Column(name="id")
    private Integer id;

    @JoinColumn(name="id_person")
    @ManyToOne
    private pessoa id_pessoa;

    @JoinColumn(name="id_cliente")
    @ManyToOne
    private cliente id_cliente;

    @JoinColumn(name="id_layer")
    @ManyToOne
    private advogadojuiz id_advogadojuiz_process;

    @Column(name="processnumber")
    private Integer numero_processo;

    @Column(name="cod_direito")
    private String cod_direito; //Exemplo: Direito Civil
    
    
    @Column(name="ID_OWNER")
    private Usuario owner;

    @Column(name="status")
    private String status;

    @Temporal(TemporalType.DATE)
    @Column(name="datainicial")
    private Date datainicial;

    @Temporal(TemporalType.DATE)
    @Column(name="datafinal")
    private Date datafinal;

    //private Integer Dataregressiva;

    @Column(name="processdescription")
    private String descricao_processo;

    @Column(name="processobservation")
    private String observacao_processo;

    public Usuario getOwner() {
        return owner;
    }

    public void setOwner(Usuario owner) {
        this.owner = owner;
    }

    public static int ContadorDeDatas(Date dataInicial, Date dataFinal){
        LocalDate localDateInicial = LocalDate.fromDateFields(dataInicial);
        LocalDate localDateFinal = LocalDate.fromDateFields(dataFinal);

        return Days.daysBetween(localDateInicial, localDateFinal).getDays();
    }

    public String getCod_direito() {
        return cod_direito;
    }

    public void setCod_direito(String cod_direito) {
        this.cod_direito = cod_direito;
    }

    public Date getDatafinal() {
        return datafinal;
    }

    public void setDatafinal(Date datafinal) {
        this.datafinal = datafinal;
    }

    public Date getDatainicial() {
        return datainicial;
    }

    public void setDatainicial(Date datainicial) {
        this.datainicial = datainicial;
    }


    public String getDescricao_processo() {
        return descricao_processo;
    }

    public void setDescricao_processo(String descricao_processo) {
        this.descricao_processo = descricao_processo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public advogadojuiz getId_advogadojuiz_process() {
        return id_advogadojuiz_process;
    }

    public void setId_advogadojuiz_process(advogadojuiz id_advogadojuiz_process) {
        this.id_advogadojuiz_process = id_advogadojuiz_process;
    }


    public cliente getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(cliente id_cliente) {
        this.id_cliente = id_cliente;
    }

    public pessoa getId_pessoa() {
        return id_pessoa;
    }

    public void setId_pessoa(pessoa id_pessoa) {
        this.id_pessoa = id_pessoa;
    }

    public Integer getNumero_processo() {
        return numero_processo;
    }

    public void setNumero_processo(Integer numero_processo) {
        this.numero_processo = numero_processo;
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
/*
    public Integer getDataregressiva() {
        return Dataregressiva;
    }

    public void setDataregressiva(Integer Dataregressiva) {
        this.Dataregressiva = Dataregressiva;
    }
**/

    }





