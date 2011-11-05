/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisjus.dao;

import br.com.sisjus.cadastro.pessoa;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author miguel
 */
public class pessoaDAO extends GenericDAO {

    private Integer Id;

    public pessoaDAO() {
        super();
    }

    public int addPerson(pessoa person) {
        savingPojo(person);
        return person.getId();


    }

    public void removePerson(pessoa person) {
        removePojo(person);
    }

    public void updatePerson(pessoa person) {
        savingPojo(person);
    }

    public pessoa getPerson(Integer personId) {
        pessoa person = gettingPojo(pessoa.class, personId);
        System.out.println("Pessoa Encontrada "+ person.getNome());
        return person;
    }

    public List<pessoa> getPesquisarPessoa() {
        Criteria c = getSession().createCriteria(pessoa.class);
        c.add(Restrictions.naturalId());
        pessoa pes = (pessoa) c.uniqueResult();
        c.addOrder(Order.asc("id"));
        System.out.println(c.list());
        return c.list();
        
    }

    public List<pessoa> getPeople() {
        return getCleanList(pessoa.class, "from pessoa person");
    }
    public List<pessoa> getEmailUser(){
        return getCleanList(pessoa.class, "from pessoa person");
    }
    public List<pessoa> getPeopleByID() {
        return getCleanList(pessoa.class, "from pessoa person where 'id' = '"+Id+"'");

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
