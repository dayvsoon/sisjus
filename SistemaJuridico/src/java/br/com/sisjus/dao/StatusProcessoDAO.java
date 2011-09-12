/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisjus.dao;

import br.com.sisjus.cadastro.StatusProcesso;
import java.util.List;

/**
 *
 * @author miguel
 */
public class StatusProcessoDAO extends GenericDAO {

    public StatusProcessoDAO() {
        super();
    }

    public StatusProcesso getStatusP(int statusID) {
        StatusProcesso status = gettingPojo(StatusProcesso.class, statusID);
        return status;
    }

    public List<StatusProcesso> getListStatus() {
        return getCleanList(StatusProcesso.class, "FROM StatusProcesso status");
    }
}
