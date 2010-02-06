/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sisjus.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author miguel
 */
public class Data {

    static Date dia = new Date(System.currentTimeMillis());
    public static String Formatador = new SimpleDateFormat("dd/MM/yyyy").format(dia);

}
