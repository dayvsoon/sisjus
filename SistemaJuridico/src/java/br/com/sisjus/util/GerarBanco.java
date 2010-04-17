/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sisjus.util;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
/**
 *
 * @author miguel
 */
public class GerarBanco {

    public static void main(String[] args) {
		Configuration cfg = new AnnotationConfiguration();
		cfg.configure();

		SchemaExport SE = new SchemaExport(cfg);
		SE.create(true, true);

}
    
}
