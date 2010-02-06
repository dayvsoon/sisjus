/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sisjus.teste;

import br.com.sisjus.cadastro.HibernateUtil;
import br.com.sisjus.cadastro.advogadojuiz;
import br.com.sisjus.cadastro.funcionario;


/**
 *
 * @author miguel
 */
public class TesteManagerBean {

    /** Creates a new instance of TesteManagerBean */
    public TesteManagerBean() {
    }

    public String dotest(){
        System.out.println("Veja "+HibernateUtil.getInstance().getSession().get(advogadojuiz.class,1));
                return "refresh";
    }
}
