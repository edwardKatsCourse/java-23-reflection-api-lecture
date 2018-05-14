package com.junit;

import java.lang.reflect.Method;
import java.util.Comparator;

public class MethodComparator implements Comparator<Method> {

    @Override
    public int compare(Method o1, Method o2) {
        if (o1.getName().equals("before")) {
            return -1;
        }

        if (o2.getName().equals("before")) {
            return 1;
        }

        if (o1.getName().equals("after")) {
            return -1;
        }

        if (o2.getName().equals("after")) {
            return 1;
        }

        return o1.getName().compareTo(o2.getName());
    }
}
