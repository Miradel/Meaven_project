package com.cyberrtek.utilities;

public class Singleton {


    private  static String str;

    private Singleton(){}

    public static String get(){
        if(str==null){
            System.out.println("Adding a value");
            str= "sdadfaff";
        }
        return str;
    }
}
