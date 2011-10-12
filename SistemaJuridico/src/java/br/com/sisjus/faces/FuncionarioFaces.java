/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sisjus.faces;

import br.com.sisjus.cadastro.funcionario;
import br.com.sisjus.cadastro.pessoa;
import br.com.sisjus.dao.FuncionarioDAO;
import br.com.sisjus.dao.pessoaDAO;
import java.util.LinkedList;
import java.util.List;
import javax.faces.model.SelectItem;
import javax.swing.JOptionPane;


/**
 *
 * @author miguel
 */
public class FuncionarioFaces {

        private List<funcionario> ListOfFuncionario = null;
        private FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        private funcionario selectedFuncionario;
        private pessoaDAO pssDAO = new pessoaDAO();
        private int Choise;


    /** Creates a new instance of FuncionarioFaces */
    public FuncionarioFaces() {
    }


    public List<funcionario> getListOfFuncionario() {
       if (ListOfFuncionario == null){
           ListOfFuncionario = funcionarioDAO.getEmployees();
       }
        return ListOfFuncionario;
    }
    public List<SelectItem> getClientsOfSystem(){
        List<SelectItem> toReturn = new LinkedList<SelectItem>();
        for(pessoa prs : pssDAO.getPeople()){
            toReturn.add(new SelectItem(prs.getNome()+" "+prs.getSobrenome(),prs.getNome()+" "+prs.getSobrenome()));
        }
        return toReturn;
    }
    
      public String doAddEmployee(){
        selectedFuncionario = new funcionario();
        return "gotoAddNewFuncionario";
    }
  public String finishedFuncionario(){
       Choise = JOptionPane.showConfirmDialog(null, "Você tem certeza que deseja gravar?");
     System.out.println("Valor da escolha: "+Choise);
     if(Choise == 0){
      funcionarioDAO.addfuncionario(selectedFuncionario);
      ListOfFuncionario = null;
      JOptionPane.showMessageDialog(null, "Dado gravado no banco de dados com sucesso");
      return "gotoListFuncionario";
  }else
       JOptionPane.showMessageDialog(null, "Dado não gravado no banco de dados");
      return "DontGoListCliente";
  }
  public String removeFuncionario(){
      funcionarioDAO.removefuncionario(selectedFuncionario);
            ListOfFuncionario = null;
      return "gotoListFuncionario";
  }
public String doUpdateEmployee(){
    return "gotoUpdateFuncionario";
}
public String finishUpdateEmployee(){
      funcionarioDAO.updatefuncionario(selectedFuncionario);
      ListOfFuncionario = null;
      return "gotoListFuncionario";


}
   public String gotoMenu(){
      return "GotoMenu";
    }
    public int getChoise() {
        return Choise;
    }

    public void setChoise(int Choise) {
        this.Choise = Choise;
    }

    public pessoaDAO getPssDAO() {
        return pssDAO;
    }

    public void setPssDAO(pessoaDAO pssDAO) {
        this.pssDAO = pssDAO;
    }

    public FuncionarioDAO getFuncionarioDAO() {
        return funcionarioDAO;
    }

    public void setFuncionarioDAO(FuncionarioDAO funcionarioDAO) {
        this.funcionarioDAO = funcionarioDAO;
    }

    public funcionario getSelectedFuncionario() {
        return selectedFuncionario;
    }

    public void setSelectedFuncionario(funcionario selectedFuncionario) {
        this.selectedFuncionario = selectedFuncionario;
    }

}
