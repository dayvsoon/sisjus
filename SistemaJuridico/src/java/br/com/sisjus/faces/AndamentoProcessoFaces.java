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
import br.com.sisjus.dao.pessoaDAO;
import br.com.sisjus.dao.processDAO;
import br.com.sisjus.sistema.Configuracoes;
import br.com.sisjus.util.Email;
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
    private Configuracoes selectConfig;
    private processDAO procDAO = new processDAO();
    private pessoaDAO pssDAO = new pessoaDAO();
    private StatusProcessoDAO statusDao = new StatusProcessoDAO();
    private int Choise;
    public String sendEmail;
    public static String dominioEmail;
    private String emailDeEnvio;
    private String assunto;
    public static String seuEmail;
    private String corpoEmail;
    public static String password;

    /** Creates a new instance of AndamentoProcessoFaces */
    public AndamentoProcessoFaces() {
    }

    public String doAddAndamento() {
        selectedAndamento = new AndamentoProcesso();
        return "gotoAddNewAndamento";
    }

    public String backToPageBefore() {
        System.out.println("Voltando para o menu");
        return "BackPage";
    }

    public List<SelectItem> getAndamentosOfSystem() {
        List<SelectItem> toReturn = new LinkedList<SelectItem>();
        for (processo prc : procDAO.getProcesses()) {
            toReturn.add(new SelectItem(prc.getNumero_processo()));
        }
        return toReturn;
    }

    public List<SelectItem> getStatusOfBase() {
        List<SelectItem> toReturnStatus = new LinkedList<SelectItem>();
        for (StatusProcesso status : statusDao.getListStatus()) {
            toReturnStatus.add(new SelectItem(status.getId(), status.getId() + " - " + status.getDescricao()));
        }
        return toReturnStatus;
    }

    public List<SelectItem> getEmailUser() {
        List<SelectItem> toReturnEmail = new LinkedList<SelectItem>();
        for (pessoa prs : pssDAO.getEmailUser()) {
            toReturnEmail.add(new SelectItem(prs.getEmail(), prs.getNome() + " " + prs.getSobrenome()));
        }
        return toReturnEmail;
    }

    public String finishedProtocolo() throws InterruptedException {
        emailDeEnvio = selectConfig.getSeuEmail();
        dominioEmail = selectConfig.getDominioEmail();
        System.out.println("Email de envio: " + emailDeEnvio);
        System.out.println("dominio: " + dominioEmail);
        sendEmail = selectConfig.getSendEmail();
        System.out.println("Envair Email: " + sendEmail);
        assunto = "Andamento do Processo sob Nº " + selectedAndamento.getNumeroProcesso();
        corpoEmail = selectedAndamento.getObservacao_processo();
        System.out.println("-->  " + assunto);
        System.out.println("Escrito  " + corpoEmail);
        Choise = JOptionPane.showConfirmDialog(null, "Você tem certeza que deseja gravar?");
        System.out.println("Valor da escolha: " + Choise);
        password = selectConfig.getSuaSenha();
        if (Choise == 0) {
            if (sendEmail.equals("S")) {
                Email email = new Email(dominioEmail, seuEmail, assunto, emailDeEnvio, corpoEmail,password);
                System.out.println("Processo de captura concluido ");
                email.Send();
                andamentoDAO.addAndamentoProcesso(selectedAndamento);
                ListOfAndamento = null;
                JOptionPane.showMessageDialog(null, "Dado gravado no banco de dados com sucesso");
                return "gotoListProtocolo";
            } else {
                andamentoDAO.addAndamentoProcesso(selectedAndamento);
            }
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

    public String FinishUpdateProtocolo() {

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

    public String getSendEmail() {
        return sendEmail;
    }

    public void setSendEmail(String sendEmail) {
        this.sendEmail = sendEmail;
    }

    public StatusProcessoDAO getStatusDao() {
        return statusDao;
    }

    public void setStatusDao(StatusProcessoDAO statusDao) {
        this.statusDao = statusDao;
    }

    public String getDominioEmail() {
        return dominioEmail;
    }

    public void setDominioEmail(String dominioEmail) {
        this.dominioEmail = dominioEmail;
    }

    public pessoa getSelectPessoa() {
        return selectPessoa;
    }

    public void setSelectPessoa(pessoa selectPessoa) {
        this.selectPessoa = selectPessoa;
    }

    public String getEmailDeEnvio() {
        return emailDeEnvio;
    }

    public void setEmailDeEnvio(String emailDeEnvio) {
        this.emailDeEnvio = emailDeEnvio;
    }

    public pessoaDAO getPssDAO() {
        return pssDAO;
    }

    public void setPssDAO(pessoaDAO pssDAO) {
        this.pssDAO = pssDAO;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getSeuEmail() {
        return seuEmail;
    }

    public void setSeuEmail(String seuEmail) {
        this.seuEmail = seuEmail;
    }

    public String getCorpoEmail() {
        return corpoEmail;
    }

    public void setCorpoEmail(String corpoEmail) {
        this.corpoEmail = corpoEmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Configuracoes getSelectConfig() {
        return selectConfig;
    }

    public void setSelectConfig(Configuracoes selectConfig) {
        this.selectConfig = selectConfig;
    }
    
}