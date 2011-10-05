/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisjus.dao;

import br.com.sisjus.cadastro.AndamentoProcesso;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author miguel
 */
public class AndamentoProcessoDAO extends GenericDAO {

    /** Creates a new instance of AndamentoProcessoDAO */
    public AndamentoProcessoDAO() {
    }
    public String addAndamentoProcesso(AndamentoProcesso andamento){
        savingPojo(andamento);
     return andamento.getNumeroProcesso();
}
    public void removeProtocolo(AndamentoProcesso andamento){
    removePojo(andamento);
}

public void updateProtocolo(AndamentoProcesso andamento){
    savingPojo(andamento);
}
    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }
    
    public List<AndamentoProcesso> getAndamentoProcesso(){
   return  getCleanList(AndamentoProcesso.class, "from andamentoprocesso andamentoprocesso");
}
public List<AndamentoProcesso> getAndamentoDosProcessos(){
   return  getCleanList(AndamentoProcesso.class, "from andamentoprocesso andamentoprocesso where numeroProcesso = :numeroProcesso");
           }

}
