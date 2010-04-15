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


/**
 *
 * @author miguel
 */
public class ClienteFaces {

        private List<cliente> ListOfCliente = null;
        private ClienteDAO clienteDAO = new ClienteDAO();
        private cliente selectedClient;
        private pessoaDAO pssDAO = new pessoaDAO();

    /** Creates a new instance of ClienteFaces */
    public ClienteFaces() {
    }

    public List<cliente> getListOfLayer() {
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
  public String FinishedLayer(){
      clienteDAO.addCliente(selectedClient);
      ListOfCliente = null;
      return "gotoListCliente";
  }
  public String removeLayer(){
      clienteDAO.removeClient(selectedClient);
            ListOfCliente = null;
      return "gotoListCliente";
  }
public String doUpdateLayer(){

    return "gotoUpdateClienter";
}
public String FinishUpdateLayer(){
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

}
