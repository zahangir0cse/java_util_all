package com.iict.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPattern {
    public static void main(String[] args) {
        System.out.println(isMatchPattern("abc@abc.com", "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$"));
    }
    private static Boolean isMatchPattern(String text, String patternString) {
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();
    }
}
