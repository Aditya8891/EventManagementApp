/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

public class email {
    
     public static void main(String args[])
     {
        
               String to = "adipandit4777@gmail.com";
               String from = "adipandit8891@gmail.com";
               String host = "localhost";
               Properties properties = System.getProperties();
               properties.setProperty("mail.smtp.host", host);
               Session session = Session.getDefaultInstance(properties);
               try {
         
                        MimeMessage message = new MimeMessage(session);
                        message.setFrom(new InternetAddress(from));
                        message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
                        message.setSubject("This is the Subject Line!");
                        message.setText("This is actual message");

        
                        Transport.send(message);
                        System.out.println("Sent message successfully....");
                    } catch (MessagingException mex) {
                                 
                        mex.printStackTrace();
                        
                    }


     }
}
  