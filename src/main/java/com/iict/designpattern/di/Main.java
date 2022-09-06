package com.iict.designpattern.di;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        /*Shape shape = new Square();
        shape.draw();*/
//        triangle.draw();
//        AService aService = new AService(new BService(new AService(new BService())))
       /* BService bService = new BService();
        AService aService = new AService(bService);
        bService.setaService(aService);*/
       /* DrawShape drawShape = new DrawShape(new Square());
        DrawShape drawShape2 = new DrawShape(new Triangle());
        drawShape.drawShape();
        drawShape2.drawShape();*/
//        Map<String, String> map = new Hashtable<>();
       /* Map<String, String> hashMap = new HashMap<>(4, .5f);
        hashMap.put("add", "ad");*/
        HashMap m = new HashMap(4, 0.5f);
        m.put("dd","a");
        Field tableField = HashMap.class.getDeclaredField("table");
        tableField.setAccessible(true);
        Object[] table = (Object[]) tableField.get(m);
        System.out.println(table == null ? 0 : table.length);
//        System.out.println(hashMap);

    }
}
