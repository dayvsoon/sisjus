/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sisjus.faces;

import br.com.sisjus.cadastro.advogadojuiz;
import br.com.sisjus.dao.advogadoJuizDAO;
import java.util.List;
/**
 *
 * @author miguel
 */
public class AdvogadoJuizFaces {

        private List<advogadojuiz> ListOfLayer = null;
        private advogadoJuizDAO AdvogadoJuizDAO = new advogadoJuizDAO();
        private advogadojuiz selectedLayer;


    /** Creates a new instance of AdvogadoJuizFaces */
    public AdvogadoJuizFaces() {
    }

    public List<advogadojuiz> getListOfLayer() {
       if (ListOfLayer == null){
           ListOfLayer = AdvogadoJuizDAO.getLayers();
       }
        return ListOfLayer;
    }
      public String doAddLayer(){
        selectedLayer = new advogadojuiz();
        return "gotoAddNewLayer";
    }
  public String FinishedLayer(){
      AdvogadoJuizDAO.addLayer(selectedLayer);
      ListOfLayer = null;
      return "gotoListLayer";
  }
  public String removeLayer(){
      AdvogadoJuizDAO.removeLayer(selectedLayer);
            ListOfLayer = null;
      return "gotoListLayer";
  }
public String doUpdateLayer(){

    return "gotoUpdateLayer";
}
public String FinishUpdateLayer(){
      AdvogadoJuizDAO.updateLayer(selectedLayer);
      ListOfLayer = null;
      return "gotoListLayer";


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
