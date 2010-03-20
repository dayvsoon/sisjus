/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sisjus.faces;

import br.com.sisjus.cadastro.processo;
import br.com.sisjus.dao.processDAO;
import java.util.List;


/**
 *
 * @author miguel
 */
public class ProcessoFaces {

        private List<processo> ListOfProcess = null;
        private processDAO processDAO = new processDAO();
        private processo selectedProcesso;


    /** Creates a new instance of ProcessoFaces */
    public ProcessoFaces() {
    }


    public List<processo> getListOfFuncionario() {
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



}
