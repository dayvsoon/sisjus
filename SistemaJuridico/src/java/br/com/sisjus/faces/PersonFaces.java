/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sisjus.faces;

import br.com.sisjus.cadastro.HibernateUtil;
import br.com.sisjus.cadastro.pessoa;
import br.com.sisjus.dao.pessoaDAO;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.faces.model.SelectItem;
import org.hibernate.Session;

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
        

    public String doSearch(){
         if (ListOfPerson == null){
          //  selectedPerson = new pessoa().pesquisarPorId(id); 
           ListOfPerson = (List<pessoa>) personDAO.getPesquisarPessoa();
       }
    return "gotoSearch";
}
    
    public List<pessoa> getPessoaPesquisa(Integer id){
        if (ListOfPerson == null){
           ListOfPerson = (List<pessoa>) personDAO.getPerson(id);
       }
        return ListOfPerson;
    }
    public List<pessoa> dadosPessoa(){
         if (ListOfPerson == null){
            ListOfPerson = (List<pessoa>) selectedPerson.pesquisarPorId(id);
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
      public String editPerson(){
          return "EditPerson";
      }
      public String doUpdatePerson(){
           personDAO.addPerson(selectedPerson);
          ListOfPerson = null;
       return "gotoUpdatePerson1";
}
        public String updatePerson(){
          personDAO.addPerson(selectedPerson);
          ListOfPerson = null;
       return "gotoUpdatePerson";
}
    public String finishUpdatePerson(){
      personDAO.updatePerson(selectedPerson);
      ListOfPerson = null;
      //selectedPerson = new pessoa();
      return "gotoListPerson";
}
   
    public List<SelectItem> getPeopleBD(){
        List<SelectItem> toReturn = new LinkedList<SelectItem>();
        for(pessoa prs : personDAO.getPeople()){
             toReturn.add(new SelectItem(prs.getId(),prs.getNome()+" " + prs.getSobrenome()));
        }
         return toReturn;
    }
    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
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
