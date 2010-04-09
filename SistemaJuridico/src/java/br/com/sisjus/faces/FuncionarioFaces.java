/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sisjus.faces;

import br.com.sisjus.cadastro.funcionario;
import br.com.sisjus.dao.FuncionarioDAO;
import java.util.List;
import javax.faces.model.SelectItem;


/**
 *
 * @author miguel
 */
public class FuncionarioFaces {

        private List<funcionario> ListOfFuncionario = null;
        private FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        private funcionario selectedFuncionario;


    /** Creates a new instance of FuncionarioFaces */
    public FuncionarioFaces() {
    }


    public List<funcionario> getListOfFuncionario() {
       if (ListOfFuncionario == null){
           ListOfFuncionario = funcionarioDAO.getEmployees();
       }
        return ListOfFuncionario;
    }
    
      public String doAddEmployee(){
        selectedFuncionario = new funcionario();
        return "gotoAddNewFuncionario";
    }
  public String FinishedFuncionario(){
      funcionarioDAO.addfuncionario(selectedFuncionario);
      ListOfFuncionario = null;
      return "gotoListFuncionario";
  }
  public String removeFuncionario(){
      funcionarioDAO.removefuncionario(selectedFuncionario);
            ListOfFuncionario = null;
      return "gotoListFuncionario";
  }
public String doUpdateLayer(){

    return "gotoUpdateFuncionario";
}
public String FinishUpdateLayer(){
      funcionarioDAO.updatefuncionario(selectedFuncionario);
      ListOfFuncionario = null;
      return "gotoListFuncionario";


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
