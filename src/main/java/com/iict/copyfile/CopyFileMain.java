package com.iict.copyfile;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class CopyFileMain {
    public static void main(String[] args) throws IOException {
        File sourceFile = new File("D:\\erp_docs\\ApplianceChange\\01-07-2020\\a54a8ce2-7b97-4690-ba06-ba12967d59e6\\MeterReadingSheet_01-07-2020.pdf");
        File targetFile = new File("D:\\erp_docs\\ApplianceChangeNew");
        if (!targetFile.exists()) {
            targetFile.mkdirs();
        }
        FileUtils.copyFileToDirectory(sourceFile, targetFile);
    }
}
