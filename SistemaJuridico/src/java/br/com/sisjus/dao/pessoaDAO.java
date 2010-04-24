/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sisjus.dao;

import br.com.sisjus.cadastro.pessoa;
import java.util.List;
import org.hibernate.Session;


/**
 *
 * @author miguel
 */
public class pessoaDAO extends GenericDAO {

    protected Session session;

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
public pessoa pesquisaPessoaById(int id){
    return (pessoa) session.load(pessoa.class, id);
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


}

