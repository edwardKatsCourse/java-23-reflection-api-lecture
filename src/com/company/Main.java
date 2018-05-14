package com.company;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws
            IllegalAccessException,
            InstantiationException,
            InvocationTargetException {

        Class clazz = Counter.class;

        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {
            System.out.println(method.getName());

            if (method.getName().equals("add")) {
                method.invoke(clazz.newInstance());
            }

            if (method.getName().equals("addTwoDigits")) {
                method.invoke(clazz.newInstance(), 100, 100);
            }

            if (method.getName().equals("getInUpperCase")) {
                Object o = method.invoke(clazz.newInstance(), "blue");
                String result = null;
                if (o instanceof String) {
                    result = (String) o;
                }

                System.out.println(result);
            }
        }

    }
}








