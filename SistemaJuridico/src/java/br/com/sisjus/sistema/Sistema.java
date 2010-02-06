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



}
