package com.iict.processimage;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;

public class ProcessImage {

    public static String crackImage(String filePath) {
        File imageFile = new File(filePath);
        ITesseract instance = new Tesseract();
        instance.setDatapath("C:\\Tess4J");
        instance.setLanguage("eng");
        try {
            String result = instance.doOCR(imageFile);
            return result;
        } catch (TesseractException e) {
            System.err.println(e.getMessage());
            return "Error while reading image";
        }
    }

    public static void main(String[] args) {
        System.out.printf(crackImage("D:\\test_image\\test3.PNG"));
    }
}
