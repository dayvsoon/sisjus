/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sisjus.dao;

import br.com.sisjus.cadastro.cliente;
import java.util.List;
/**
 *
 * @author miguel
 */
public class ClienteDAO extends GenericDAO {


public ClienteDAO(){
     super();
}

public int addCliente(cliente client){
  savingPojo(client);
  return client.getId();


}
public void removeClient(cliente client){
    removePojo(client);
}
public void updateClient(cliente client){
    savingPojo(client);
}

public cliente getClient(int clientId){
    cliente client = gettingPojo(cliente.class, clientId);
    return client;
}

public List<cliente> getClients(){
   return  getCleanList(cliente.class, "from cliente client");
}



}
