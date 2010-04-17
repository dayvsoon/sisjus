/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sisjus.faces;

import br.com.sisjus.cadastro.cliente;
import br.com.sisjus.cadastro.pessoa;
import br.com.sisjus.dao.ClienteDAO;
import br.com.sisjus.dao.pessoaDAO;
import java.util.LinkedList;
import java.util.List;
import javax.faces.model.SelectItem;
import javax.swing.JOptionPane;


/**
 *
 * @author miguel
 */
public class ClienteFaces {

        private List<cliente> ListOfCliente = null;
        private ClienteDAO clienteDAO = new ClienteDAO();
        private cliente selectedClient;
        private pessoaDAO pssDAO = new pessoaDAO();
        private int Choise;

    /** Creates a new instance of ClienteFaces */
    public ClienteFaces() {
    }

    public List<cliente> getListOfClient() {
       if (ListOfCliente == null){
           ListOfCliente = clienteDAO.getClients();
       }
        return ListOfCliente;
    }
      public String doAddCliente(){
        selectedClient = new cliente();
        return "gotoAddNewCliente";
    }
      public String doAddClientJuridico(){
          selectedClient = new cliente();
          return "gotoAddNewClienteJuridico";
      }
  public String FinishedClient(){
     Choise = JOptionPane.showConfirmDialog(null, "Você tem certeza que deseja gravar?");
     System.out.println("Valor da escolha: "+Choise);
     if(Choise == 0){
     clienteDAO.addCliente(selectedClient);
      ListOfCliente = null;
      JOptionPane.showMessageDialog(null, "Dado gravado no banco de dados com sucesso");
      return "gotoListCliente";
  }else
      JOptionPane.showMessageDialog(null, "Dado não gravado no banco de dados");
      return "DontGoListCliente";
  }
  public String removeClient(){
       Choise = JOptionPane.showConfirmDialog(null, "Você tem certeza que deseja remover?");
        if(Choise == 0){
             clienteDAO.removeClient(selectedClient);
             ListOfCliente = null;
             JOptionPane.showMessageDialog(null, "Dado removido no banco de dados com sucesso");
             return "gotoListCliente";
          }else
             JOptionPane.showMessageDialog(null, "Dado não removido do banco de dados");
              return "DontGoListCliente";
  }
  
public String doUpdateClient(){

    return "gotoUpdateClienter";
}
public String FinishUpdateClient(){

      clienteDAO.updateClient(selectedClient);
      ListOfCliente = null;
      return "gotoListCliente";


}
    public List<SelectItem> getClientsOfSystem(){
        List<SelectItem> toReturn = new LinkedList<SelectItem>();
        for(pessoa prs : pssDAO.getPeople()){
            toReturn.add(new SelectItem(prs.getId()+" "+prs.getNome(),prs.getId().toString()+" "+ prs.getNome()+" " + prs.getSobrenome()));
        }
        return toReturn;
    }

    public List<cliente> getListOfCliente() {
        return ListOfCliente;
    }

    public void setListOfCliente(List<cliente> ListOfCliente) {
        this.ListOfCliente = ListOfCliente;
    }

    public cliente getSelectedClient() {
        return selectedClient;
    }

    public void setSelectedClient(cliente selectedClient) {
        this.selectedClient = selectedClient;
    }

    public int getChoise() {
        return Choise;
    }

    public void setChoise(int Choise) {
        this.Choise = Choise;
    }

    public ClienteDAO getClienteDAO() {
        return clienteDAO;
    }

    public void setClienteDAO(ClienteDAO clienteDAO) {
        this.clienteDAO = clienteDAO;
    }

    public pessoaDAO getPssDAO() {
        return pssDAO;
    }

    public void setPssDAO(pessoaDAO pssDAO) {
        this.pssDAO = pssDAO;
    }

}
