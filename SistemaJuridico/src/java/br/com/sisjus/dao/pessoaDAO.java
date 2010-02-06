/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sisjus.dao;

import br.com.sisjus.cadastro.pessoa;
import java.util.List;

/**
 *
 * @author miguel
 */
public class pessoaDAO extends GenericDAO {


public pessoaDAO(){

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

public pessoa getPerson(int personId){
    pessoa person = gettingPojo(pessoa.class, personId);
    return person;
}

public List<pessoa> getPeople(){
   return  getCleanList(pessoa.class,"from pessoa person");
}


}

