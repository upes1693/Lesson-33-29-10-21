package com.design_patterns;

public class Singleton2 {
    private static Singleton2 obj=new Singleton2();

    private Singleton2(){
        System.out.println("Ctor");
    }
    public static Singleton2 getInstance(){
        return obj;
    }
}
