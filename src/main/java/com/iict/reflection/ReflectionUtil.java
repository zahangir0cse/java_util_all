package com.iict.reflection;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.lang.reflect.Method;

public final class ReflectionUtil {
    private static final Logger logger = LogManager.getLogger(ReflectionUtil.class.getName());
    public static Method getMethod(String registerClassName, String methodName, Class ... parameters){
        Class className = null;
        Method method = null;
        try {
            className = Class.forName(registerClassName);
            try {
                method = className.getMethod(methodName, parameters); // Non static
            }catch (Exception e){
                method = className.getDeclaredMethod(methodName, parameters); // Static
            }
            method.setAccessible(true);//To access private method
            return method;
        } catch (Exception e) {
            logger.error("Reflection exception");
            return null;
        }
    }
}
