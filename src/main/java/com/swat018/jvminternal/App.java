package com.swat018.jvminternal;

import java.util.List;

public class App {

    static String myName;

    static {
        myName = "jinwoo";
    }

    private String foo = "bar";

    public static void main(String[] args) {
//        System.out.println(App.class.getClassLoader());
//        System.out.println(List.class.getClassLoader());
        Thread.currentThread();
        System.out.println(App.class.getSuperclass());
    }
}
