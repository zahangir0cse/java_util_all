package com.iict.dbfreader;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.jamel.dbf.processor.DbfProcessor;
import org.jamel.dbf.utils.DbfUtils;

import java.io.File;
import java.util.List;

@Data
@AllArgsConstructor
class Lower{
    private String lCode;
}

public class Main {
    public static void main(String[] args) {
        File dbf = new File("D:\\Exam Result\\Lower\\1.DBF");
        List<Lower> lowerList = DbfProcessor.loadData(dbf, row -> {
            // here we can change string encoding if it is needed
            String lCode = new String(DbfUtils.trimLeftSpaces((byte[]) row[1]));
//            Number zip = (Number) row[1];
//            Date createdAt = (Date) row[2];

            return new Lower(lCode);
        });

        System.out.println("Lower: " + lowerList);
    }
}
