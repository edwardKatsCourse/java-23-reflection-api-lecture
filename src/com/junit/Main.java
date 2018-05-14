package com.junit;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {


        Class clazz = Test.class;

        Method [] methods = getOrderedMethods(clazz);

        for (Method method :methods) {
//            System.out.println(method.getName());

            try {
                method.invoke(clazz.newInstance());
//                System.out.println("Test passed");
                printMethodResult(method.getName(), "passed");
            } catch (InvocationTargetException e) {
//                System.out.println("Test failed");
                printMethodResult(method.getName(), "failed");
                System.out.println("Exception type: " + e.getCause().getClass().getName());
                System.out.println("Exception message: " + e.getCause().getMessage());

            }

            System.out.println("------------------");
        }
    }

    public static void printMethodResult(String methodName, String status) {
        System.out.printf("------------------%n" +
                "Method: %s has %s%n", methodName, status);
    }

    public static Method [] getOrderedMethods(Class clazz) {
        Method [] methods = clazz.getDeclaredMethods();
        Arrays.sort(methods, new MethodComparator());

        return methods;
    }


}
