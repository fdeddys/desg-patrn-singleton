package com.ddabadi;

/**
 * Created with IntelliJ IDEA.
 * User: deddy
 * Date: 12/3/17
 * Time: 9:42 AM
 * To change this template use File | Settings | File Templates.
 */

public class SimpleSingleton {

//    public SimpleSingleton() {
//    }

    private SimpleSingleton(){}

    private static SimpleSingleton instance = null;

    public static SimpleSingleton getInstance(){
        if(instance == null){
            instance = new SimpleSingleton();
        }
        return instance;
    }

    public void VoidHello(){
        System.out.println("Hello from singleton class");
    }

    public void VoidHi(){
        System.out.println("Hi... from singleton again");
    }



}
