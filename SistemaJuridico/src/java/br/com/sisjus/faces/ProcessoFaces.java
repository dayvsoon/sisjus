/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sisjus.faces;

import br.com.sisjus.cadastro.StatusProcesso;
import br.com.sisjus.cadastro.advogadojuiz;
import br.com.sisjus.cadastro.cliente;
import br.com.sisjus.cadastro.processo;
import br.com.sisjus.dao.ClienteDAO;
import br.com.sisjus.dao.StatusProcessoDAO;
import br.com.sisjus.dao.advogadoJuizDAO;
import br.com.sisjus.dao.processDAO;
import java.util.LinkedList;
import java.util.List;
import javax.faces.model.SelectItem;



/**
 *
 * @author miguel
 */
public class ProcessoFaces {

        private List<processo> ListOfProcess = null;
        private processDAO processDAO = new processDAO();
        private processo selectedProcesso;
        private ClienteDAO cltDAO = new ClienteDAO();
        private advogadoJuizDAO adzDAO = new advogadoJuizDAO();
        private StatusProcessoDAO statusDao = new StatusProcessoDAO();


    /** Creates a new instance of ProcessoFaces */
    public ProcessoFaces() {
    }

 public List<SelectItem> getClientOfSystem(){
        List<SelectItem> toReturn = new LinkedList<SelectItem>();
        for(cliente clt : cltDAO.getClients() ){
            toReturn.add(new SelectItem(clt.getNome_pessoa() + " "+ clt.getId(),clt.getNome_pessoa() + " " + clt.getCpfcnpj() ));
        }
        return toReturn;
    }
 public List<SelectItem> getLayerOfSystem(){
     List<SelectItem> toReturn = new LinkedList<SelectItem>();
      for(advogadojuiz adz : adzDAO.getSelectedLayers() ){
          toReturn.add(new SelectItem(adz.getId_advogadojuiz() + " " + adz.getId_pessoa(), adz.getId_pessoa() + " "+ adz.getCod_oab()));

      }
      return toReturn;
 }
public List<SelectItem> getMajorLayerOfSystem(){
     List<SelectItem> toReturn = new LinkedList<SelectItem>();
      for(advogadojuiz adz : adzDAO.getSelectedMajorLayers() ){
          toReturn.add(new SelectItem(adz.getId_advogadojuiz() + " " + adz.getId_pessoa(), adz.getId_pessoa() + " Nº "+ adz.getNvara() +" - "+ adz.getDescricaodaVara()));

      }
      return toReturn;
 }

 public List<SelectItem> getStatusOfBase(){
        List<SelectItem> toReturnStatus = new LinkedList<SelectItem>();
        for(StatusProcesso status : statusDao.getListStatus()){
            toReturnStatus.add(new SelectItem(status.getId(),status.getId()+" - "+status.getDescricao()));
        }
        return toReturnStatus;
    }
 
    public List<processo> getListOfProcess() {
       if (ListOfProcess == null){
           ListOfProcess = processDAO.getProcesses();
       }
        return ListOfProcess;
    }
    public List<processo> getListOfProcessFinally(){
         if (ListOfProcess == null){
           ListOfProcess = processDAO.getProcessesFinally();
       }
        return ListOfProcess;
    }
    public String doAddProcesso(){
        selectedProcesso = new processo();
        return "gotoAddNewProcess";
    }
  public String FinishedProcess(){
      processDAO.addProcess(selectedProcesso);
      ListOfProcess = null;
      return "gotoListProcess";
  }
  public String removeProcess(){
      processDAO.removeProcess(selectedProcesso);
            ListOfProcess = null;
      return "gotoListProcess";
  }
public String doUpdateProcess(){
    return "gotoUpdateProcess";
}
public String FinishUpdateProcess(){
      processDAO.updateProcess(selectedProcesso);
      ListOfProcess = null;
      return "gotoListProcess";
}
public String backPage(){
    return "backPageMenu";
}

    public advogadoJuizDAO getAdzDAO() {
        return adzDAO;
    }

    public void setAdzDAO(advogadoJuizDAO adzDAO) {
        this.adzDAO = adzDAO;
    }

    public ClienteDAO getCltDAO() {
        return cltDAO;
    }

    public void setCltDAO(ClienteDAO cltDAO) {
        this.cltDAO = cltDAO;
    }

    public processDAO getProcessDAO() {
        return processDAO;
    }

    public void setProcessDAO(processDAO processDAO) {
        this.processDAO = processDAO;
    }

    public processo getSelectedProcesso() {
        return selectedProcesso;
    }

    public void setSelectedProcesso(processo selectedProcesso) {
        this.selectedProcesso = selectedProcesso;
    }



}
