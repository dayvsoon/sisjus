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

public processo getProcess(int processId){
    processo process = gettingPojo(processo.class, processId);
    return process;
}

public List<processo> getProcesses(){
   return  getCleanList(processo.class,"from processo process");

}
public List<processo> getProcessesProtocol(){
    return getCleanList(processo.class,"from processo process inner join protocolo protocolo on (process.processnumber = protocolo.id) where protocolo.arquivado <> 'Sim'");
}
//select PROCESSNUMBER from APP.PROCESS inner Join APP.PROTOCOLO on (PROCESSNUMBER = App.PROTOCOLO.ID) where App.PROTOCOLO.ARQUIVADO <> 'Sim';
//select PROCESSNUMBER FROM app.PROCESS inner Join app.ANDAMENTO on (APP.PROCESS.PROCESSNUMBER = APP.ANDAMENTO.ID) WHERE APP.ANDAMENTO.STATUS <> '15';

public List<processo> getProcessesAndamento(){
     return getCleanList(processo.class,"from processo process inner join andamentoprocesso andamentoprocesso on (process.processnumber = andamentoprocesso.id) where andamentoprocesso.status <> '9'");
}
public List<processo> getProcessesFinally(){
   return  (List<processo>) SearchProcess("select processnumber, processdescription from "+ processo.class +" where status = 'Finalizado'");

}
public List<processo> getProcessByUser(int userID){
    return getCleanList(processo.class, "from processo process where process.owner.id = ?1", userID);
}


}
