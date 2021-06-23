package com.iict.mail;

import java.util.Properties;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;

public final class MailConstraint {
    private MailConstraint() {

    }

    public static final String USERNAME = "noreply@crackcodebd.com";
    public static final String PASSWORD = "crackPassword";
    public static final String PORT = "25";
    public static final String HOST = "mail.crackcodebd.com";
    public static final String IS_AUTH = "true";
//    public static final String IS_TLS = "true";

    public static Properties getPropertiesInstance() {
        Properties properties = new Properties();
        properties.put("mail.smtp.host", HOST);
        properties.put("mail.smtp.port", PORT);
        properties.put("mail.smtp.auth", IS_AUTH);
        properties.put("mail.debug", "true");
//        properties.put("mail.smtp.starttls.enable", IS_TLS);
        properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        return properties;
    }

    public static Session getSessionInstance() {
        return Session.getInstance(getPropertiesInstance(), new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(USERNAME, PASSWORD);
            }
        });
    }
}
