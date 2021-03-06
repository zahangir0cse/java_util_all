package com.iict.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionMain {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, ClassNotFoundException, InstantiationException {
        //static void method
        String className = "com.iict.barcode.BarCodeGen";
        Method method = ReflectionUtil.getMethod(className, "createBarCode128", String.class);
        method.invoke(Class.forName(className),"1234");

        //static void method
        String className1 = "com.iict.reflectiontest.ReflectionTest";
        Method method1 = ReflectionUtil.getMethod(className1, "helloStatic");
        method1.invoke(Class.forName(className1));

        //static non-void method

//        String className2 = "com.iict.reflectiontest.ReflectionTest";
        Method method2 = ReflectionUtil.getMethod(className1, "helloStatic",String.class);
        String s = (String) method2.invoke(Class.forName(className1),"Hello Static");
        System.out.println(s);

        //Non static non-void method

        Method method3 = ReflectionUtil.getMethod(className1, "helloNonStatic1", String.class);
        String s3 = (String) method3.invoke(Class.forName(className1).newInstance(),"Hello non Static");
        System.out.println(s3);

        //Non static void method

        Method method4 = ReflectionUtil.getMethod(className1, "helloNonStatic");
        method4.invoke(Class.forName(className1).newInstance());

    }
}
