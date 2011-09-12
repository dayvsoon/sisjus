/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sisjus.faces;

import br.com.sisjus.cadastro.pessoa;
import br.com.sisjus.dao.pessoaDAO;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Example;


/**
 *
 * @author miguel
 */
public class PersonFaces {

        private List<pessoa> ListOfPerson = new ArrayList<pessoa>();
        private  pessoaDAO personDAO = new pessoaDAO();
        private pessoa selectedPerson;
        protected Session session;
        private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
        

    public String DoSearch(){
         if (ListOfPerson == null){
           ListOfPerson = personDAO.getPesquisarPessoa(id);
       }
    return "gotoSearch";
}
    public List<pessoa> getPessoaPesquisa(Integer id){
        if (ListOfPerson == null){
           ListOfPerson = personDAO.getPesquisarPessoa(id);
       }
        return ListOfPerson;
    }
    public List<pessoa> getListOfPerson() {
       if (ListOfPerson == null){
           ListOfPerson = personDAO.getPeople();
       }
        return ListOfPerson;
    }
      public String doAddPerson(){
        selectedPerson = new pessoa();
        return "gotoAddNewPerson";
    }

      public String FinishedPerson(){
      personDAO.addPerson(selectedPerson);
      ListOfPerson = null;
      return "gotoListPerson";
  }

      public String removePerson(){
      personDAO.removePerson(selectedPerson);
            ListOfPerson = null;
      return "gotoListPerson";
  }
      public String doUpdatePerson(){
      return "gotoUpdatePerson";
}
    public String FinishUpdatePerson(){
      personDAO.updatePerson(selectedPerson);
      ListOfPerson = null;
      return "gotoListPerson";


}
    

    public pessoaDAO getPersonDAO() {
        return personDAO;
    }

    public void setpessoaDAO(pessoaDAO personDAO) {
        this.personDAO = personDAO;
    }

    public pessoa getSelectedPerson() {
        return selectedPerson;
    }

    public void setSelectedPerson(pessoa selectedPerson) {
        this.selectedPerson = selectedPerson;
    }

    /** Creates a new instance of PersonFaces */


}
