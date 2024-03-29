/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sisjus.faces;

import br.com.sisjus.cadastro.Usuario;
import br.com.sisjus.dao.UserDAO;
import br.com.sisjus.util.Log;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;


/**
 *
 * @author miguel
 */
public class UserFaces {

    private List<Usuario> ListOfUsers = null;
    private UserDAO userDAO = new UserDAO();
    private Usuario selectedUser;
    private String login;
    private String password;
    /** Creates a new instance of UserFaces */
    public UserFaces() {
    }

    public List<Usuario> getListOfUsers() {
       if (ListOfUsers == null){
           ListOfUsers = userDAO.getUsers();
       }
        return ListOfUsers;
    }

    public String doAutenthicLogin(){
       Log.TurnOn();
        if(userDAO.isValidLoginAndPassword(login, password)){
            Log.info("O usuario "+login+ " efetuou o login");
            return "DoLoginSucessful";

        }else {
            FacesMessage msg = new FacesMessage("Usuário ou senha inválido!");
            FacesContext.getCurrentInstance().addMessage("erro", msg);
            Log.Warning(msg.toString());
            return "DonotLoginSucessful";
        }
    }
    public String DoLinkedWithMenu(){
        return "gotoDisplayEE";
    }
    public void setListOfUsers(List<Usuario> ListOfUsers) {
        this.ListOfUsers = ListOfUsers;
    }

    public UserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
    public String LinkFromMSGEnterToMenu(){
        return "WaitSucessful";
    }
    public String backtoMenu(){
        return "gotobacktotheMenu";
    }
    public String backToMainMenu(){
        return "MainMenu";
    }
    public String doAddUser(){
        selectedUser = new Usuario();
        return "gotoAddNewUser";
    }
  public String FinishedUser(){
      userDAO.addUser(selectedUser);
      ListOfUsers = null;
      return "gotoListUsers";
  }
  public String removeUser(){
      userDAO.removeUser(selectedUser);
            ListOfUsers = null;
      return "gotoListUsers";
  }

    public Usuario getSelectedUser() {
        return selectedUser;
    }

    public void setSelectedUser(Usuario selectedUser) {
        this.selectedUser = selectedUser;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

   
    
}
