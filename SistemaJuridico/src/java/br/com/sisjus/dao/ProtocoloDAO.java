/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sisjus.dao;

import br.com.sisjus.cadastro.Protocolo;
import java.util.List;
import org.hibernate.SQLQuery;
import org.hibernate.Session;


/**
 *
 * @author miguel
 */
public class ProtocoloDAO extends GenericDAO {

    /** Creates a new instance of ProtocoloDAO */
    public ProtocoloDAO() {
    }

    public int addProtocolo(Protocolo protocolo){
        savingPojo(protocolo);
       return protocolo.getiD();
}

public void removeProtocolo(Protocolo protocolo){
    removePojo(protocolo);
}

public void updateProtocolo(Protocolo protocolo){
    savingPojo(protocolo);
}

public Protocolo getProtocolo(int ProtocoloId){
   Protocolo protocolo = gettingPojo(Protocolo.class, ProtocoloId);
    return protocolo;
}

public List<Protocolo> getProtocolos(){
   return  getCleanList(Protocolo.class, "from Protocolo protocol");
}
public List<Protocolo> getTramiteProtocolos(){
   return  getCleanList(Protocolo.class, "from protocolo protocolo where numeroProcesso = :numeroProcesso");
}
    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    
    public String Analise(String SQL, String Value){      
        // getSession().createQuery("FROM Protocolo WHERE id= 'sim' ").list();  
        SQLQuery result = session.createSQLQuery(SQL);
        Value =  result.toString();
        return Value;
}
}