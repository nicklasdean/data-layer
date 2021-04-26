package com.example.demo.utility;

public class Singleton {
    private static Singleton instance = null;

    private Singleton(){}

    public Singleton getInstance(){
        if(instance != null){
            return instance;
        }
        instance = new Singleton();
        return instance;
    }
}
