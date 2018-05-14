package com.junit;

public class Test {


    public void before() {
        System.out.println("before");
    }

    public void testMethod1() {
        int i = 1 + 2;
    }

    public void testMethod2() {
        throw new RuntimeException("database connection lost");

    }

    public void testMethod3() {
        System.out.println("testMethod3");
    }

    public void testMethod4() {
        int i = 2/0;
    }

    public void after() {
        System.out.println("after");
    }
}
