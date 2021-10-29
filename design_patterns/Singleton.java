package com.design_patterns;

public class Singleton {
    private static Singleton obj;

    private Singleton(){
        System.out.println("Ctor");
    }

    public synchronized static Singleton getInstance(){
        if(obj==null)
            obj=new Singleton();
        return obj;
    }
}
