/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sisjus.faces;

import br.com.sisjus.cadastro.pessoa;
import br.com.sisjus.dao.pessoaDAO;
import br.com.sisjus.util.Log;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.faces.model.SelectItem;
import javax.swing.JOptionPane;
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
        private int Choise;
        private int loop;
        private boolean turnOn;
        public String data = br.com.sisjus.util.Data.Formatador;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
        

    public void doSearch(){
      //  selectedPerson = new pessoa().pesquisarPorId(id); 
           selectedPerson =  personDAO.getPerson(selectedPerson.getId());
    }
    //return "gotoSearch";

    
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
      Choise = JOptionPane.showConfirmDialog(null, "Você tem certeza que deseja gravar?");
       if(Choise == 0){
          Log.TurnOn();
           personDAO.addPerson(selectedPerson);
          Log.info("Dados gravado, nome = "+ selectedPerson.getNome().toString()+" em  "+data);
          System.out.println("Nome: "+selectedPerson.getNome().toString()+"");
          JOptionPane.showMessageDialog(null, "Dado gravado no banco de dados com sucesso");
          ListOfPerson = null;
      loop = JOptionPane.showConfirmDialog(null, "Você deseja inserir outro dado?");
      while( loop == 0){
          selectedPerson = new pessoa();
          personDAO.addPerson(selectedPerson);
           Log.info("Dados gravado, uma nova pessoa" + data);
           ListOfPerson = null;
          JOptionPane.showMessageDialog(null, "Dado gravado no banco de dados com sucesso");
      return "gotoListPerson";
       }}else
          JOptionPane.showMessageDialog(null, "Dado não gravado no banco de dados");
      return "DontGoRecordNewPerson";
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

    public int getChoise() {
        return Choise;
    }

    public void setChoise(int Choise) {
        this.Choise = Choise;
    }

    public int getLoop() {
        return loop;
    }

    public void setLoop(int loop) {
        this.loop = loop;
    }

    public boolean isTurnOn() {
        return turnOn;
    }

    public void setTurnOn(boolean turnOn) {
        this.turnOn = turnOn;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }


}
