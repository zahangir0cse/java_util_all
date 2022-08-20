package com.iict.neetcode.array;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EncodeAndDecodeString {
    public static void main(String[] args) {
        String [] strings = {"aab", "3dd", "#asj"};
        System.out.println(encode(strings));
        decode("3#aab3#3dd4##asj");
    }
    public static String encode(String [] strings){
        StringBuilder sb = new StringBuilder();
        for(String str: strings){
            sb.append(str.length()).append("#").append(str);
        }
        return sb.toString();
    }

    public static String[] decode(String s){
        List<String> result = new ArrayList<>();
        decodeUtil(s, result);
        return result.toArray(new String[0]);
    }

    private static void decodeUtil(String s, List<String> result){
        String regex = "^\\d+#.+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        if(matcher.matches()){
            int len = Integer.parseInt(s.substring(0,1));
           result.add(s.substring(2, len+2));
            s = s.substring(len+2);
            decodeUtil(s, result);
        }
    }
}
