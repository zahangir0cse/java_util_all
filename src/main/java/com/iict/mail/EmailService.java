package com.iict.mail;

import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.util.List;

public class EmailService {
    private Boolean sendMimeMail(String[] to, String subject, String text, Boolean isHtml, List<File> attachments) {
        try {
            Session session = MailConstraint.getSessionInstance();
            MimeMessage message = new MimeMessage(session);
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setFrom(MailConstraint.USERNAME);
            helper.setTo(to);
            helper.setSubject(subject);
            helper.setText(text, isHtml);
            if (attachments != null && attachments.size() > 0) {
                for (File file : attachments) {
                    helper.addAttachment(file.getName(), file);
                }
            }
            Transport.send(message);
            System.out.println("Send email to: " + to);
            return true;
        } catch (Exception e) {
            System.out.println("Problem with sending email to: " + to + " error message: " + e.getMessage());
            return false;
        }
    }

    public Boolean sendHtmlMail(String[] to, String subject, String text, List<File> attachments) {
        return sendMimeMail(to, subject, text, true, attachments);
    }

    public Boolean sendHtmlMail(String[] to, String subject, String text) {
        return sendMimeMail(to, subject, text, true, null);
    }
    public Boolean sendNonHtmlMail(String[] to, String subject, String text) {
        return sendMimeMail(to, subject, text, false, null);
    }

    public Boolean sendNonHtmlMail(String[] to, String subject, String text, List<File> attachments) {
        return sendMimeMail(to, subject, text, false, attachments);
    }
}
