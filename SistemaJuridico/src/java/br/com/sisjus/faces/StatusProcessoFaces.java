/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisjus.faces;

import br.com.sisjus.cadastro.StatusProcesso;
import br.com.sisjus.dao.StatusProcessoDAO;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.faces.model.SelectItem;

/**
 *
 * @author miguel
 */
public class StatusProcessoFaces {

   
    private StatusProcesso selectedStatus;
    private StatusProcessoDAO statusDao = new StatusProcessoDAO();
    private List<StatusProcesso> ListOfStatus = new ArrayList<StatusProcesso>();
    
    
    
     public StatusProcessoFaces() {
    }
     
      public List<StatusProcesso> getListOfStatus() {
       if (ListOfStatus == null){
           ListOfStatus = statusDao.getListStatus();
       }
        return ListOfStatus;
    }
      
      public List<SelectItem> getStatusOfBase(){
        List<SelectItem> toReturn = new LinkedList<SelectItem>();
        for(StatusProcesso status : statusDao.getListStatus()){
            toReturn.add(new SelectItem(status.getId(),status.getId()+" - "+status.getDescricao()));
        }
        return toReturn;
    }

    public StatusProcesso getSelectedStatus() {
        return selectedStatus;
    }

    public void setSelectedStatus(StatusProcesso selectedStatus) {
        this.selectedStatus = selectedStatus;
    }

    public StatusProcessoDAO getStatusDao() {
        return statusDao;
    }

    public void setStatusDao(StatusProcessoDAO statusDao) {
        this.statusDao = statusDao;
    }

      
}
