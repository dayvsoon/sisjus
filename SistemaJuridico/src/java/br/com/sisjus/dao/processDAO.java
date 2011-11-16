/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sisjus.dao;

import br.com.sisjus.cadastro.processo;
import java.util.List;
/**
 *
 * @author miguel
 */
public class processDAO extends GenericDAO {

    public processDAO() {
    }

    public int addProcess(processo process){
           savingPojo(process);
             return process.getId();


}
public void removeProcess(processo process){
    removePojo(process);
}
public void updateProcess(processo process){
    savingPojo(process);
}

public processo getProcess(Integer ProcessID){
    processo process = gettingPojo(processo.class, ProcessID);
    return process;
}

public List<processo> getProcesses(){
   return  getCleanList(processo.class,"from processo process");

}
public List<processo> getProcessesProtocol(){
    //inner join protocolo protocol on (process.processnumber = protocol.id) where protocol.arquivado <> 'Sim'
    return getCleanList(processo.class,"from processo process ");
}
//select PROCESSNUMBER from APP.PROCESS inner Join APP.PROTOCOLO on (PROCESSNUMBER = App.PROTOCOLO.ID) where App.PROTOCOLO.ARQUIVADO <> 'Sim';
//select PROCESSNUMBER FROM app.PROCESS inner Join app.ANDAMENTO on (APP.PROCESS.PROCESSNUMBER = APP.ANDAMENTO.ID) WHERE APP.ANDAMENTO.STATUS <> '15';

public List<processo> getProcessesAndamento(){
    //inner join andamentoprocesso andamentoprocess on (process.processnumber = andamentoprocess.id) where andamentoprocess.status <> '9'"
     return getCleanList(processo.class,"from processo process ");
}
public List<processo> getProcessesFinally(){
   return  (List<processo>) SearchProcess("select processnumber, processdescription from "+ processo.class +" where status = 'Finalizado'");

}
public List<processo> getProcessByUser(int userID){
    return getCleanList(processo.class, "from processo process where process.owner.id = ?1", userID);
}


}
