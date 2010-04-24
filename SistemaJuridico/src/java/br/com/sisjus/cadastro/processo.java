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
    
    @Id
    @Column(name="id")
    private Integer id;

    @Column(name="pessoa_autor")
    private String pessoa_autor;

    @Column(name="advogado_autor")
    private String advogado_autor;

    @Column(name="pessoa_reu")
    private String pessoa_reu;

    @Column(name="advogado_reu")
    private String advogado_reu;

    @Column(name="processnumber")
    private Integer numero_processo;

    @Column(name="cod_direito")
    private String cod_direito; //Exemplo: Direito Civil

    @Column(name="status")
    private String status;

    @Column(name="juiz_sentenca")
    private String juiz_sentenca;
    

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

    @Column(name="ID_OWNER")
    private Usuario owner;

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

    public String getJuiz_sentenca() {
        return juiz_sentenca;
    }

    public void setJuiz_sentenca(String juiz_sentenca) {
        this.juiz_sentenca = juiz_sentenca;
    }


    public String getAdvogado_autor() {
        return advogado_autor;
    }

    public void setAdvogado_autor(String advogado_autor) {
        this.advogado_autor = advogado_autor;
    }

    public String getAdvogado_reu() {
        return advogado_reu;
    }

    public void setAdvogado_reu(String advogado_reu) {
        this.advogado_reu = advogado_reu;
    }

    public String getPessoa_autor() {
        return pessoa_autor;
    }

    public void setPessoa_autor(String pessoa_autor) {
        this.pessoa_autor = pessoa_autor;
    }

    public String getPessoa_reu() {
        return pessoa_reu;
    }

    public void setPessoa_reu(String pessoa_reu) {
        this.pessoa_reu = pessoa_reu;
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





