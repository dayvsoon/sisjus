/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sisjus.dao;

import br.com.sisjus.cadastro.HibernateUtil;
import br.com.sisjus.cadastro.pessoa;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import br.com.sisjus.cadastro.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;


/**
 *
 * @author miguel
 */
public class pessoaDAO extends GenericDAO {

    private Integer Id;
    

public pessoaDAO(){
 super();
}

public int addPerson(pessoa person){
  savingPojo(person);
  return person.getId();


}
public void removePerson(pessoa person){
    removePojo(person);
}
public void updatePerson(pessoa person){
    savingPojo(person);
}

public pessoa getPerson(Integer personId){
    pessoa person = gettingPojo(pessoa.class, personId);
    return person;
}
/*
public pessoa pesquisaPessoaById(pessoa pes){
         
        pes = new pessoa();
        Session sessao = getSesseion();
        pes.setNome(pes.getNome());

        System.out.println("Valor: " +pes);
        pes = (pessoa) this.session.load(pessoa.class, pes.getId());
        
        sessao.close();

        return pes;
}*/
public List<pessoa> getPesquisarPessoa(Integer personId){
      Criteria c = getSession().createCriteria(pessoa.class);
	        c.add(Restrictions.ilike("id", personId));
	pessoa pes = (pessoa) c.uniqueResult();
                c.addOrder(Order.asc("id"));

        return c.list();
	    }
     

public List<pessoa> getPeople(){
   return  getCleanList(pessoa.class,"from pessoa person");
}

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }


}

