/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sisjus.faces;

import br.com.sisjus.cadastro.pessoa;
import br.com.sisjus.dao.pessoaDAO;
import java.util.List;


/**
 *
 * @author miguel
 */
public class PersonFaces {

        private List<pessoa> ListOfPerson = null;
        private  pessoaDAO personDAO = new pessoaDAO();
        private pessoa selectedPerson;


    public String DoSearch(){
     selectedPerson = new pessoa();
     return "gotoSearch";
}
    public String pesquisarByID(){
        
        pessoaDAO pssDAO = new pessoaDAO();
        pssDAO.getPerson(selectedPerson.getId());
        return "PesquisaConcluida";
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
    public PersonFaces() {
    }

}
