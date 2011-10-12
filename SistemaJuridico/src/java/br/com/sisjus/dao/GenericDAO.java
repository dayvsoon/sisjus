/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sisjus.dao;

import br.com.sisjus.cadastro.HibernateUtil;
import br.com.sisjus.cadastro.pessoa;
import br.com.sisjus.cadastro.processo;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author miguel
 */


public abstract class GenericDAO {

 protected Session session;
protected Session getSesseion(){

    return HibernateUtil.getInstance().getSession();
}

protected  void savingPojo(Serializable pojo){
  Session sessao = getSesseion();
  sessao.saveOrUpdate(pojo);
  sessao.beginTransaction().commit();
  sessao.close();
}

protected  <T extends Serializable> T gettingPojo(Class<T> Searchclass, Serializable key){
  Session sessao = getSesseion();
  Serializable ReturnToObject = (Serializable) sessao.get(Searchclass, key);
  sessao.beginTransaction().commit();
  sessao.close();
    return (T) ReturnToObject;
}
protected void removePojo(Serializable pojotoRemove){
Session sessao = getSesseion();
  sessao.delete(pojotoRemove);
  sessao.beginTransaction().commit();
  sessao.close();

}
protected Serializable getCleanPojo(String query, Object... params){
    Session sessao = getSesseion();

    Query qr = sessao.createQuery(query);

   for(int i=1; i <= params.length; i++){
       qr.setParameter(i, params[i-1]);

   }
    Object returnObject = qr.uniqueResult();
    
   sessao.getTransaction().commit();
   sessao.close();
   return (Serializable) returnObject;
}

protected <T extends Serializable> List<T> getCleanList(Class<T> classToCast, String query, Object... params){
    Session sessao = getSesseion();

    Query qr = sessao.createQuery(query);

   for(int i=1; i <= params.length; i++){
       qr.setParameter(i, params[i-1]);

   }
    @SuppressWarnings("unchecked")
    List<T> returnObject = qr.list();

   sessao.getTransaction().commit();
   sessao.close();
   return returnObject;
}
public processo SearchProcess(String query){
      Session sessao = getSesseion();
       Query q = sessao.createQuery(query);
        sessao.getTransaction().commit();
           sessao.close();
		

		return (processo)q.uniqueResult();
	}
public List<pessoa> buscarSQL(String query){
    Session ses = getSesseion();
       Query q = ses.createSQLQuery(query);
       //q.setParameter("email", q); 
       ses.getTransaction().commit();
          // ses.close();
		

		return q.list();
}
//@SuppressWarnings("unchecked")
 //public T load(int id){
   //  return (T) session.load(persistentClass, id);
 //}
}
