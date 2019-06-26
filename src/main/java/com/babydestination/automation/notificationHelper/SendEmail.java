package com.babydestination.automation.notificationHelper;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;
//import org.eclipse.jetty.websocket.api.Session
import com.babydestination.automation.notificationHelper.*;

public class SendEmail {


        public void emailSend () throws MessagingException {
            Calendar calendar = Calendar.getInstance();
            SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh");
            String  to[]={"anujtiwari05@gmail.com","ishan@babydestination.com","naved@babydestination.com","kartik@babydestination.com","tarun@babydestination.com","sachin@babydestination.com"};

            String subject = "Automation Test Report | "+new Date();
            String msg ="Hi All," +
                    " " +
                    "Please find the Below Report of Automation Testing, To Open the report first download it on your laptop then click on the downloaded html file-: ";
            final String from ="anuj@babydestination.com";
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



            BodyPart messageBodyPart=new MimeBodyPart();

            // Fill the message
            messageBodyPart.setText(msg);

            // Create a multipart message for attachment
            Multipart multipart=new MimeMultipart();

            // Set text message part
            multipart.addBodyPart(messageBodyPart);

            // Second part is attachment
            messageBodyPart=new MimeBodyPart();

            String filename=System.getProperty("user.dir")+"/src/main/java/com/babydestination/automation/report/test"+formater.format(calendar.getTime())+".html";
            DataSource source=new FileDataSource(filename);
            messageBodyPart.setDataHandler(new DataHandler(source));
            messageBodyPart.setFileName(filename);
            multipart.addBodyPart(messageBodyPart);

            // Send the complete message parts
            message.setContent(multipart);



            InternetAddress[] sendTo = new InternetAddress[to.length];
            for (int i = 0; i <to.length; i++) {
                System.out.println("Send to:" + to[i]);
                sendTo[i] = new InternetAddress(to[i]);
            }
//            message.addRecipient(Message.RecipientType.TO, sendTo);
            message.setRecipients(javax.mail.internet.MimeMessage.RecipientType.TO,
                    sendTo);


            transport.connect();
            transport.send(message);
//            emailHelper.sendAttachmentEmail(session,to,subject,msg);
            transport.close();
        }
}

