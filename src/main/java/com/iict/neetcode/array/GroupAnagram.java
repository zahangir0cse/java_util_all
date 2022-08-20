package com.iict.neetcode.array;

import java.util.*;

public class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        if(strs == null || strs.length == 0){
            return result;
        }
        Map<String, List<String>> map = new HashMap<>();
        for(String str: strs){
            char [] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            List<String> list = map.getOrDefault(sorted, new ArrayList<>());
            list.add(str);
            map.put(sorted, list);
        }
        for(Map.Entry<String, List<String>> listEntry: map.entrySet()){
            result.add(listEntry.getValue());
        }
        return result;
    }
}
