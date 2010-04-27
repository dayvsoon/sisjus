/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sisjus.faces;

import br.com.sisjus.cadastro.Protocolo;
import br.com.sisjus.cadastro.processo;
import br.com.sisjus.dao.ProtocoloDAO;
import br.com.sisjus.dao.processDAO;
import java.util.LinkedList;
import java.util.List;
import javax.faces.model.SelectItem;
import javax.swing.JOptionPane;


/**
 *
 * @author miguel
 */
public class ProtocoloFaces {

        private List<Protocolo> ListOfProtocolo = null;
        private ProtocoloDAO protocoloDAO = new ProtocoloDAO();
        private Protocolo selectedProtocolo;
        private processDAO procDAO = new processDAO();
        private int Choise;

    /** Creates a new instance of ProtocoloFaces */
    public ProtocoloFaces() {
    }

      public List<Protocolo> getListOfProtocolo() {
       if (ListOfProtocolo == null){
           ListOfProtocolo = protocoloDAO.getProtocolos();
       }
        return ListOfProtocolo;
    }
      public String doAddProtocolo(){
        selectedProtocolo = new Protocolo();
        return "gotoAddNewProtocolo";
    }
     
  public String FinishedProtocolo(){
     Choise = JOptionPane.showConfirmDialog(null, "Você tem certeza que deseja gravar?");
     System.out.println("Valor da escolha: "+Choise);
     if(Choise == 0){
     protocoloDAO.addProtocolo(selectedProtocolo);
      ListOfProtocolo = null;
      JOptionPane.showMessageDialog(null, "Dado gravado no banco de dados com sucesso");
      return "gotoListProtocolo";
  }else
      JOptionPane.showMessageDialog(null, "Dado não gravado no banco de dados");
      return "DontGoListProtocolo";
  }
  public String removeProtocolo(){
       Choise = JOptionPane.showConfirmDialog(null, "Você tem certeza que deseja remover?");
        if(Choise == 0){
             protocoloDAO.removeProtocolo(selectedProtocolo);
             ListOfProtocolo = null;
             JOptionPane.showMessageDialog(null, "Dado removido no banco de dados com sucesso");
             return "gotoListProtocolo";
          }else
             JOptionPane.showMessageDialog(null, "Dado não removido do banco de dados");
              return "DontGoListProtocolo";
  }

public String doUpdateProtocolo(){

    return "gotoUpdateProtocolor";
}
public String FinishUpdateProtocolo(){

      protocoloDAO.updateProtocolo(selectedProtocolo);
      ListOfProtocolo = null;
      return "gotoListProtocolo";


}
public String BackingToMenu(){
    return "goToMenu";
}

public List<SelectItem> getProtocolosOfSystem(){
        List<SelectItem> toReturn = new LinkedList<SelectItem>();
        for(processo prc : procDAO.getProcesses() ){
            toReturn.add(new SelectItem(prc.getNumero_processo()));
        }
        return toReturn;
    }

    public int getChoise() {
        return Choise;
    }

    public void setChoise(int Choise) {
        this.Choise = Choise;
    }

    public processDAO getProcDAO() {
        return procDAO;
    }

    public void setProcDAO(processDAO procDAO) {
        this.procDAO = procDAO;
    }



    public ProtocoloDAO getProtocoloDAO() {
        return protocoloDAO;
    }

    public void setProtocoloDAO(ProtocoloDAO protocoloDAO) {
        this.protocoloDAO = protocoloDAO;
    }

    public Protocolo getSelectedProtocolo() {
        return selectedProtocolo;
    }

    public void setSelectedProtocolo(Protocolo selectedProtocolo) {
        this.selectedProtocolo = selectedProtocolo;
    }





}
