/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisjus.util;


import java.util.Date;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.*;
import javax.swing.JOptionPane;

/**
 *
 * @author miguel
 */
public class Email {

    public String dominio;
    private String CorpoDoEmail;
    private String SeuEmail;
    private String SuaSenha;
    private String AssuntoEmail;
    private String EmailDeEnvio;
    
    public Email() {
    }

    public Email(String dominio,String seuEmail, String assunto, String emailEnvio,String texto, String password) {
        this.dominio = dominio;
        this.SeuEmail = seuEmail;
        this.AssuntoEmail = assunto;
        this.EmailDeEnvio = emailEnvio;
        this.CorpoDoEmail = texto;
        this.SuaSenha = password;
    }
    
    
    public void Send() throws InterruptedException{
  System.out.println("Enviar E-mail");
        Properties props = new Properties();
    
    if (dominio.equals("hotmail")) {
            System.out.println("Entrou no Hotmail");
            /** Parâmetros de conexão com servidor Hotmail */
           
            props.put("mail.transport.protocol", "smtp");
            props.put("mail.smtp.host", "smtp.live.com");
            props.put("mail.smtp.socketFactory.port", "587");
            props.put("mail.smtp.socketFactory.fallback", "false");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.port", "587");
        } else if (dominio.equals("gmail")) {
            System.out.println("Entrou no gmail");
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.socketFactory.port", "465");
            props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.port", "465");
        } else if (dominio.equals("yahoo")) {
            System.out.println("Entrou no yahoo");
            Object put = props.put("mail.smtp.host", "smtp.mail.yahoo.com");
            props.put("mail.smtp.socketFactory.port", "465");
            Object put1 = props.put("mail.smtp.auth", "true");
            Object put2 = props.put("mail.smtp.port", "25");

        }
        System.out.println(dominio);
       Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {

          
            @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(SeuEmail, SuaSenha);
                    }
                });
        session.setDebug(true);
      

          try {
 
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(SeuEmail));
			message.setRecipients(Message.RecipientType.TO,  InternetAddress.parse(EmailDeEnvio));
			message.setSubject(AssuntoEmail);
			message.setText(CorpoDoEmail);
                        message.setSentDate(new Date());
						

			Transport.send(message);
 
			System.out.println("Done");
 
		
	
            System.out.println("Feito!!!");
            JOptionPane.showMessageDialog(null, "Está sendo enviado...");
            Thread.sleep(1200); 
            JOptionPane.showMessageDialog(null, "Enviado com Sucesso!");
        } catch (MessagingException e) {
           JOptionPane.showMessageDialog(null, "Envio não completado devido "+e);
           Exception ex = null;
}

    
}

    public String getAssuntoEmail() {
        return AssuntoEmail;
    }

    public void setAssuntoEmail(String AssuntoEmail) {
        this.AssuntoEmail = AssuntoEmail;
    }

    public String getCorpoDoEmail() {
        return CorpoDoEmail;
    }

    public void setCorpoDoEmail(String CorpoDoEmail) {
        this.CorpoDoEmail = CorpoDoEmail;
    }

    public String getEmailDeEnvio() {
        return EmailDeEnvio;
    }

    public void setEmailDeEnvio(String EmailDeEnvio) {
        this.EmailDeEnvio = EmailDeEnvio;
    }

    public String getSeuEmail() {
        return SeuEmail;
    }

    public void setSeuEmail(String SeuEmail) {
        this.SeuEmail = SeuEmail;
    }

    public String getSuaSenha() {
        return SuaSenha;
    }

    public void setSuaSenha(String SuaSenha) {
        this.SuaSenha = SuaSenha;
    }

    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }
    
}