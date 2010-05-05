/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sisjus.util;

import java.util.List;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;



/**
 *
 * @author miguel
 */
public class AcessoTwitter {

public String User;
public String password;

    public void SeguindoTwitter(){
    try {
        String usuario = this.User;
        String senha = this.password;
        //conectando
        Twitter twitter = new TwitterFactory().getInstance(User,password);

        //recuperando a timeline
        List<Status> timeline = twitter.getFriendsTimeline();
        System.out.println("Exibindo a timeline");
        System.out.println("----------------------------------------");
        for (Status s : timeline) {
            System.out.println(s.getUser().getScreenName() + " - " + s.getText());
        }
        System.out.println("----------------------------------------");

        //atualizando o status
        String novoStatus = "Atualizadno";
        twitter.updateStatus(novoStatus);
        System.out.println("Status atualizado com sucesso!");
    } catch (TwitterException ex) {
        System.out.println("Erro: " + ex.toString());
    }


}

    public String getUser() {
        return User;
    }

    public void setUser(String User) {
        this.User = User;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
