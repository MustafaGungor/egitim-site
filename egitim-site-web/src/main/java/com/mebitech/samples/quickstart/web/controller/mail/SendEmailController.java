package com.mebitech.samples.quickstart.web.controller.mail;
import com.mebitech.robe.persistence.api.query.search.SearchModel;
import com.mebitech.samples.quickstart.dao.mail.SendMailDao;
import com.mebitech.samples.quickstart.domain.mail.SendMail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *  Sabit Mail iletişim adresi için gönderim yapan controller (GET,POST)
 *
 * @author MustafaGungor
 * @version 1.0.0
 * @since 15/06/2017
 * @see SendMail
 */

@RestController
@RequestMapping(value = "sendEmail")
@Transactional
public class SendEmailController {
    /**
     * Mail kayıtları aynı zamanda veritabanına kayıt olsun diye tutuluyor
     */
    @Autowired
    private SendMailDao sendMailDao;

    /**
     * tüm mailleri geri dönen fonksiyon
     *
     * @return List<SendMail>
     */
    @RequestMapping(method = RequestMethod.GET)
    public List<SendMail> getListMail(){
        return sendMailDao.findAll();
    }

    /**
     * Mail kaydetme ve gönderme için Post methodundan faydalanıyor.
     * @param sendMail
     * @return
     */
    @RequestMapping(method = RequestMethod.POST)
    public SendMail sendEmail( @RequestBody SendMail sendMail){
        final String username = "mustafagungorq@gmail.com";
        final String password = "Mustafa1";
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        String name = sendMail.getSendName();
        String messageTitle = sendMail.getMailTitle();
        String messageBody = sendMail.getMail();
        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("mustafagungorq@gmail.com"));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse("mustafa.gungor@mebitech.com"));
            message.setSubject(messageTitle);
            message.setText("Hello , I'm "+ name
                    + "\n\n " + messageBody);

            Transport.send(message);

            System.out.println("Done");

        } catch (MessagingException e) {
//            throw new RuntimeException(e);
            System.out.println("hata error");
        }
        return sendMailDao.create(sendMail);
    }

//    public static void main(String [] args) {
//        final String username = "mustafagungorq@gmail.com";
//        final String password = "Mustafa1";
//
//        Properties props = new Properties();
//        props.put("mail.smtp.auth", "true");
//        props.put("mail.smtp.starttls.enable", "true");
//        props.put("mail.smtp.host", "smtp.gmail.com");
//        props.put("mail.smtp.port", "587");
//
//        Session session = Session.getInstance(props,
//                new javax.mail.Authenticator() {
//                    protected PasswordAuthentication getPasswordAuthentication() {
//                        return new PasswordAuthentication(username, password);
//                    }
//                });
//
//        try {
//
//            Message message = new MimeMessage(session);
//            message.setFrom(new InternetAddress("mustafagungorq@gmail.com"));
//            message.setRecipients(Message.RecipientType.TO,
//                    InternetAddress.parse("mustafa.gungor@mebitech.com"));
//            message.setSubject("Testing Subject");
//            message.setText("Dear Mail Crawler,"
//                    + "\n\n No spam to my email, please!");
//
//            Transport.send(message);
//
//            System.out.println("Done");
//
//        } catch (MessagingException e) {
//            throw new RuntimeException(e);
//        }
//    }
}
