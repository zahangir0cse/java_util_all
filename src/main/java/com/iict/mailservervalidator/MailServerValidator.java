package com.iict.mailservervalidator;

import  java.util.Hashtable;
import  javax.naming.*;
import  javax.naming.directory.*;

public class MailServerValidator {
    public static void main( String args[] ) {
        try {
            System.out.println(doLookup("gmail.com"));
        }catch (NamingException e){
            System.out.println("No mail server");
        }

    }

    static int doLookup( String hostName ) throws NamingException {
        Hashtable environmentHashtable = new Hashtable();
        environmentHashtable.put("java.naming.factory.initial",
                "com.sun.jndi.dns.DnsContextFactory");
        DirContext dirContext = new InitialDirContext(environmentHashtable);
        Attributes attributes =
                dirContext.getAttributes( hostName, new String[] { "MX" });
        Attribute attribute = attributes.get( "MX" );
        if( attribute == null ) return( 0 );
        return( attribute.size() );
    }
}