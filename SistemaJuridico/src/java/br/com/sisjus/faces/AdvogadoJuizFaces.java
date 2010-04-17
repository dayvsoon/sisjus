/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sisjus.faces;

import br.com.sisjus.cadastro.advogadojuiz;
import br.com.sisjus.cadastro.pessoa;
import br.com.sisjus.dao.advogadoJuizDAO;
import br.com.sisjus.dao.pessoaDAO;
import java.util.LinkedList;
import java.util.List;
import javax.faces.model.SelectItem;
import javax.swing.JOptionPane;
/**
 *
 * @author miguel
 */
public class AdvogadoJuizFaces {

        private List<advogadojuiz> ListOfLayer = null;
        private advogadoJuizDAO AdvogadoJuizDAO = new advogadoJuizDAO();
        private advogadojuiz selectedLayer;
        private pessoaDAO pssDAO = new pessoaDAO();
        private int Choise;

    /** Creates a new instance of AdvogadoJuizFaces */
    public AdvogadoJuizFaces() {
    }

    public List<advogadojuiz> getListOfLayer() {
       if (ListOfLayer == null){
           ListOfLayer = AdvogadoJuizDAO.getLayers();
       }
        return ListOfLayer;
    }
    public List<SelectItem> getClientsOfSystem(){
        List<SelectItem> toReturn = new LinkedList<SelectItem>();
        for(pessoa prs : pssDAO.getPeople()){
            toReturn.add(new SelectItem(prs.getNome()+" "+prs.getSobrenome(),prs.getNome()+" "+prs.getSobrenome()));
        }
        return toReturn;
    }
      public String doAddLayer(){
        selectedLayer = new advogadojuiz();
        return "gotoAddNewLayer";
    }
  public String FinishedLayer(){
       Choise = JOptionPane.showConfirmDialog(null, "Você tem certeza que deseja gravar?");
     System.out.println("Valor da escolha: "+Choise);
     if(Choise == 0){
      AdvogadoJuizDAO.addLayer(selectedLayer);
      ListOfLayer = null;
       JOptionPane.showMessageDialog(null, "Dado gravado no banco de dados com sucesso");
      return "gotoListLayer";
  }else
       JOptionPane.showMessageDialog(null, "Dado não gravado no banco de dados");
      return "DontGoListCliente";
  }
  public String removeLayer(){
      Choise = JOptionPane.showConfirmDialog(null, "Você tem certeza que deseja remover?");
     System.out.println("Valor da escolha: "+Choise);
     if(Choise == 0){
      AdvogadoJuizDAO.removeLayer(selectedLayer);
            ListOfLayer = null;
            JOptionPane.showMessageDialog(null, "Dado removido do banco de dados com sucesso");
      return "gotoListLayer";
  }else
       JOptionPane.showMessageDialog(null, "Dado não gravado no banco de dados");
      return "DontGoListCliente";
  }
public String doUpdateLayer(){

    return "gotoUpdateLayer";
}
public String FinishUpdateLayer(){
      AdvogadoJuizDAO.updateLayer(selectedLayer);
      ListOfLayer = null;
      return "gotoListLayer";


}

    public int getChoise() {
        return Choise;
    }

    public void setChoise(int Choise) {
        this.Choise = Choise;
    }

    public advogadoJuizDAO getAdvogadoJuizDAO() {
        return AdvogadoJuizDAO;
    }

    public void setAdvogadoJuizDAO(advogadoJuizDAO AdvogadoJuizDAO) {
        this.AdvogadoJuizDAO = AdvogadoJuizDAO;
    }

    public advogadojuiz getSelectedLayer() {
        return selectedLayer;
    }

    public void setSelectedLayer(advogadojuiz selectedLayer) {
        this.selectedLayer = selectedLayer;
    }
  
}
