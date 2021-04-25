package com.iict.corn_validator;
import org.springframework.scheduling.support.*;

import java.util.Date;

public class CornValidator {
    public static void main(String[] args) {
        CronSequenceGenerator cronSequenceGenerator = new CronSequenceGenerator("0 0 3 1 * *");
        System.out.println(cronSequenceGenerator.next(new Date()));
    }
}
