/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sisjus.cadastro;

/**
 *
 * @author miguel
 */

import br.com.sisjus.sistema.Configuracoes;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
/**
 *
 * @author miguel
 */
public class HibernateUtil {


    private static final long serialVersionUID = 1L;
    private static HibernateUtil hu;
    private SessionFactory sessionFactory;
   


    private HibernateUtil() {
         sessionFactory =  new AnnotationConfiguration()
                  .setProperty("hibernate.dialect", "org.hibernate.dialect.DerbyDialect")
                  .setProperty("hibernate.connection.driver_class", "org.apache.derby.jdbc.ClientDriver")
                  .setProperty("hibernate.connection.url","jdbc:derby://localhost:1527/Sisjus")
                  .setProperty("hibernate.connection.username","manager")
                  .setProperty("hibernate.connection.password","manager")
                  .setProperty("hibernate.default_schema","MANAGER" )
                  .setProperty("hibernate.hbm2ddl.auto","create")
                  .setProperty("hibernate.show_sql","true")
                  .setProperty("hibernate.format_sql","true")
                  .setProperty("hibernate.c3p0.acquire_increment","1")
                  .setProperty("hibernate.c3p0.idle_test_period","100")
                  .setProperty("hibernate.c3p0.max_size","10")
                  .setProperty("hibernate.c3p0.max_statements","0")
                  .setProperty("hibernate.c3p0.min_size","5")
                  .setProperty("hibernate.c3p0.timeout","100")
                  .addAnnotatedClass(pessoa.class)
                  .addAnnotatedClass(cliente.class)
                  .addAnnotatedClass(funcionario.class)
                  .addAnnotatedClass(Usuario.class)
                  .addAnnotatedClass(advogadojuiz.class)
                  .addAnnotatedClass(processo.class)
                  .addAnnotatedClass(Protocolo.class)
                  .addAnnotatedClass(StatusProcesso.class)
                  .addAnnotatedClass(AndamentoProcesso.class)
                  .addAnnotatedClass(Configuracoes.class)
                  .buildSessionFactory();
    }


    public Session getSession(){

        Session SessionToReturn = sessionFactory.openSession();
        SessionToReturn.beginTransaction();
        return SessionToReturn;
    }


    public static HibernateUtil getInstance(){
       if(hu == null){
           hu = new HibernateUtil();
       }
      return hu;
   }

    public static HibernateUtil getHu() {
        return hu;
    }

    public static void setHu(HibernateUtil hu) {
        HibernateUtil.hu = hu;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }


}

