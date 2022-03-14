package com.iict.corn_validator;
import org.springframework.scheduling.support.*;

import java.util.Date;

public class CornValidator {
    public static void main(String[] args) {
        CronSequenceGenerator cronSequenceGenerator = new CronSequenceGenerator("0 0 0 * * ?");
        System.out.println(cronSequenceGenerator.next(new Date()));
        double d = Double.valueOf(13)/2;
        System.out.println(d);//6.5
        System.out.println(Math.ceil(d));//7
    }
}
