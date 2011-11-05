/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sisjus.dao;

import br.com.sisjus.cadastro.funcionario;
import java.util.List;

/**
 *
 * @author miguel
 */
public class FuncionarioDAO extends GenericDAO {

    public FuncionarioDAO() {
    }

    public int addfuncionario(funcionario fun) {
        savingPojo(fun);
        return fun.getId();


    }

    public void removefuncionario(funcionario fun) {
        removePojo(fun);
    }

    public int updatefuncionario(funcionario fun) {
        updatePojo(fun);
        return fun.getId();
    }

    public funcionario getfuncionario(int funId) {
        funcionario fun = gettingPojo(funcionario.class, funId);
        return fun;
    }

    public List<funcionario> getEmployees() {
        return getCleanList(funcionario.class, "from funcionario fun");
    }
}
