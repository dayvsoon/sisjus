/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sisjus.faces;

import br.com.sisjus.cadastro.cliente;
import br.com.sisjus.dao.ClienteDAO;
import java.util.List;


/**
 *
 * @author miguel
 */
public class ClienteFaces {

        private List<cliente> ListOfCliente = null;
        private ClienteDAO clienteDAO = new ClienteDAO();
        private cliente selectedClient;


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

}
