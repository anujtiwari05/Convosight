package com.babydestination.automation.notificationHelper;

import java.util.Date;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
//import org.eclipse.jetty.websocket.api.Session
import com.babydestination.automation.notificationHelper.*;

public class SendEmail {


        public void emailSend () throws MessagingException {
            String to = "ishan@babydestination.com";
            String subject = "Automation Test Report | "+new Date();
            String msg ="Find the Below Report for Automation, To Open the report first download it on your laptop then click on the downloaded html file-: ";
            final String from ="anujtiwari05@gmail.com";
            final  String password ="anujanuj@password";


            Properties props = new Properties();
            props.setProperty("mail.transport.protocol", "smtp");
            props.setProperty("mail.host", "smtp.gmail.com");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.port", "465");
            props.put("mail.debug", "true");
            props.put("mail.smtp.socketFactory.port", "465");
            props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
            props.put("mail.smtp.socketFactory.fallback", "false");
            Session session = Session.getDefaultInstance(props,
                    new javax.mail.Authenticator() {
                        protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication(from,password);
                        }
                    });

            session.setDebug(false);
            Transport transport = session.getTransport();
            InternetAddress addressFrom = new InternetAddress(from);

            MimeMessage message = new MimeMessage(session);
            message.setSender(addressFrom);
            message.setSubject(subject);
            message.setContent(msg, "text/plain");
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

            transport.connect();
//            transport.send(message);
            emailHelper.sendAttachmentEmail(session,to,subject,msg);
            transport.close();
        }
}

