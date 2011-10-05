/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisjus.faces;


import br.com.sisjus.cadastro.AndamentoProcesso;
import br.com.sisjus.cadastro.StatusProcesso;
import br.com.sisjus.cadastro.pessoa;
import br.com.sisjus.cadastro.processo;
import br.com.sisjus.dao.AndamentoProcessoDAO;
import br.com.sisjus.dao.StatusProcessoDAO;
import br.com.sisjus.dao.processDAO;
import br.com.sisjus.util.Email;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.faces.model.SelectItem;
import javax.swing.JOptionPane;

/**
 *
 * @author miguel
 */
public class AndamentoProcessoFaces {
    
        private List<AndamentoProcesso> ListOfAndamento = null;
        private AndamentoProcessoDAO andamentoDAO = new AndamentoProcessoDAO();
        private AndamentoProcesso selectedAndamento;
        private pessoa selectPessoa;
        private processDAO procDAO = new processDAO();
        private StatusProcessoDAO statusDao = new StatusProcessoDAO();
        private int Choise;
        private boolean sendEmail;
        private String dominioEmail;
    /** Creates a new instance of AndamentoProcessoFaces */
    public AndamentoProcessoFaces() {
    }
    
  
    
    public String doAddAndamento(){
        selectedAndamento = new AndamentoProcesso();
        return "gotoAddNewAndamento";
    }
    
     public String backToPageBefore(){
         System.out.println("Voltando para o menu");
        return "BackPage";
    }
     
    
    
    public List<SelectItem> getAndamentosOfSystem(){
        List<SelectItem> toReturn = new LinkedList<SelectItem>();
        for(processo prc : procDAO.getProcesses() ){
            toReturn.add(new SelectItem(prc.getNumero_processo()));
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
    
    public String FinishedProtocolo() throws InterruptedException {
        System.out.println("dominio: "+dominioEmail);
        System.out.println("Envair Email: "+sendEmail);
        Choise = JOptionPane.showConfirmDialog(null, "Você tem certeza que deseja gravar?");
        System.out.println("Valor da escolha: " + Choise);
        if (Choise == 0) {
            if(sendEmail == true){
                Email email = new Email(dominioEmail);
                email.Send();
            }else
            andamentoDAO.addAndamentoProcesso(selectedAndamento);
            ListOfAndamento = null;
            JOptionPane.showMessageDialog(null, "Dado gravado no banco de dados com sucesso");
            return "gotoListProtocolo";
        } else {
            JOptionPane.showMessageDialog(null, "Dado não gravado no banco de dados");
        }
        return "DontGoListProtocolo";

    }
     
    public String removeProtocolo() {
        Choise = JOptionPane.showConfirmDialog(null, "Você tem certeza que deseja remover?");
        if (Choise == 0) {
            andamentoDAO.removeProtocolo(selectedAndamento);
            ListOfAndamento = null;
            JOptionPane.showMessageDialog(null, "Dado removido no banco de dados com sucesso");
            return "gotoListProtocolo";
        } else {
            JOptionPane.showMessageDialog(null, "Dado não removido do banco de dados");
        }
        return "DontGoListProtocolo";
    }

public String FinishUpdateProtocolo(){

      andamentoDAO.updateProtocolo(selectedAndamento);
      ListOfAndamento = null;
      return "gotoListProtocolo";

}

    public int getChoise() {
        return Choise;
    }

    public void setChoise(int Choise) {
        this.Choise = Choise;
    }

    public List<AndamentoProcesso> getListOfAndamento() {
        return ListOfAndamento;
    }

    public void setListOfAndamento(List<AndamentoProcesso> ListOfAndamento) {
        this.ListOfAndamento = ListOfAndamento;
    }

    public AndamentoProcessoDAO getAndamentoDAO() {
        return andamentoDAO;
    }

    public void setAndamentoDAO(AndamentoProcessoDAO andamentoDAO) {
        this.andamentoDAO = andamentoDAO;
    }

    public processDAO getProcDAO() {
        return procDAO;
    }

    public void setProcDAO(processDAO procDAO) {
        this.procDAO = procDAO;
    }

    public AndamentoProcesso getSelectedAndamento() {
        return selectedAndamento;
    }

    public void setSelectedAndamento(AndamentoProcesso selectedAndamento) {
        this.selectedAndamento = selectedAndamento;
    }

    public boolean isSendEmail() {
        return sendEmail;
    }

    public void setSendEmail(boolean sendEmail) {
        this.sendEmail = sendEmail;
    }

    public StatusProcessoDAO getStatusDao() {
        return statusDao;
    }

    public void setStatusDao(StatusProcessoDAO statusDao) {
        this.statusDao = statusDao;
    }


}