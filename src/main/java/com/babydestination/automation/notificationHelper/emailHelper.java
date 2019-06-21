package com.babydestination.automation.notificationHelper;

//import org.eclipse.jetty.websocket.api.Session;
import javax.mail.Session;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class emailHelper{

 public static void sendAttachmentEmail(Session session, String toEmail, String subject, String body){
     Calendar calendar = Calendar.getInstance();
     SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh");

        try{
        MimeMessage msg=new MimeMessage(session);
        msg.addHeader("Content-type","text/HTML; charset=UTF-8");
        msg.addHeader("format","flowed");
        msg.addHeader("Content-Transfer-Encoding","8bit");

        msg.setFrom(new InternetAddress("anujtiwari05@gmail.com"));

        msg.setReplyTo(InternetAddress.parse("anujtfr@gmail.com",false));

        msg.setSubject(subject,"UTF-8");

        msg.setSentDate(new Date());

        msg.setRecipients(Message.RecipientType.TO,InternetAddress.parse(toEmail,false));

        // Create the message body part
        BodyPart messageBodyPart=new MimeBodyPart();

        // Fill the message
        messageBodyPart.setText(body);

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
        msg.setContent(multipart);

        // Send message
        Transport.send(msg);
        System.out.println("EMail Sent Successfully with attachment!!");
        }catch(MessagingException e){
        e.printStackTrace();
        }
 }}