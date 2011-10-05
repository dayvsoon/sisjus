/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisjus.sistema;

/**
 *
 * @author miguel
 * Configurações do sistema
 */

public class Sistema {

    public String Version = "0.1";
    public String NameOfSystem = "SisJus";
    public String SiglaDoSistema = "SJ v0.1";
    public String Autor = "Undifined";
    public String completeNameOfSystem = "Sistema de Organização De Processos Jurídicos";
    public String dataDaUltimaAtualizacao = "03/10/2011";
    public String NumeroAtualizacao = "1";
    public String paginaDoSistema = "http://code.google.com/p/sisjus";

/**    public void LogOut(){
        System.exit(0);
    }*/

    public String getAutor() {
        return Autor;
    }

    public String getNameOfSystem() {
        return NameOfSystem;
    }

    public String getSiglaDoSistema() {
        return SiglaDoSistema;
    }

    public String getVersion() {
        return Version;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setNameOfSystem(String NameOfSystem) {
        this.NameOfSystem = NameOfSystem;
    }

    public void setSiglaDoSistema(String SiglaDoSistema) {
        this.SiglaDoSistema = SiglaDoSistema;
    }

    public void setVersion(String Version) {
        this.Version = Version;
    }

    public String getCompleteNameOfSystem() {
        return completeNameOfSystem;
    }

    public void setCompleteNameOfSystem(String completeNameOfSystem) {
        this.completeNameOfSystem = completeNameOfSystem;
    }

    public String getNumeroAtualizacao() {
        return NumeroAtualizacao;
    }

    public void setNumeroAtualizacao(String NumeroAtualizacao) {
        this.NumeroAtualizacao = NumeroAtualizacao;
    }

    public String getDataDaUltimaAtualizacao() {
        return dataDaUltimaAtualizacao;
    }

    public void setDataDaUltimaAtualizacao(String dataDaUltimaAtualizacao) {
        this.dataDaUltimaAtualizacao = dataDaUltimaAtualizacao;
    }

    public String getPaginaDoSistema() {
        return paginaDoSistema;
    }

    public void setPaginaDoSistema(String paginaDoSistema) {
        this.paginaDoSistema = paginaDoSistema;
    }

    public String backToMenu(){
        return "aboutbackmenu";
    }
    public String goAbout(){
        return "goabout";
    }
    public String goConfig(){
    return "goConfig";
}
}
