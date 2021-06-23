package com.iict.mail;

public class MailMain {
    public static void main(String[] args) {
        String [] to = {"test@gmail.com", "test@abc.com"};
        System.out.println(new EmailService().sendNonHtmlMail(to, "Test  Mail", "This mail from "));
    }
}
