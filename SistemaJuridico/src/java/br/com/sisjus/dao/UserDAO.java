/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sisjus.dao;

import br.com.sisjus.cadastro.Usuario;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;




/**
 *
 * @author miguel
 */
public class UserDAO extends GenericDAO {


    private Session session;

    public UserDAO(Session session){
        this.session = session;
    }

    public UserDAO(){
        this.session = getSesseion();
    }


    public int addUser(Usuario user){
        Session sessao = getSesseion();
        sessao.save(user);
        sessao.getTransaction().commit();
        sessao.close();
        return user.getId_user();

    }

    public void removeUser(Usuario user){
        Session sessao = getSesseion();
        sessao.delete(user);
        sessao.getTransaction().commit();
        sessao.close();
    }

    public void setUser(Usuario user){
        Session sessao = getSesseion();
        sessao.update(user);
        sessao.getTransaction().commit();
        sessao.close();
    }

    public boolean isValidLoginAndPassword(String Login, String Password){

        boolean valid;
        Session sessao = getSesseion();
        Query query = sessao.createQuery("from Usuario user where user.login = ? and user.password = ?");
        query.setString(1, Login);
        query.setString(2, Password);
        Usuario user = (Usuario) query.uniqueResult();
        valid = (user != null);
        sessao.getTransaction().commit();
        sessao.close();

        return valid;
    }

    public boolean isValidLoginAndPasswordNew(String Login, String Password){
        return getCleanPojo("from Usuario user where user.login = ? and user.password = ?", Login,Password) != null;
    }
    
    public List<Usuario> getUsers(){
        return getCleanList(Usuario.class, "from usuario user");
    }
}
