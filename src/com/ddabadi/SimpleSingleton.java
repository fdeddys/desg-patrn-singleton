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

    public static SimpleSingleton instance = new SimpleSingleton();

    public static SimpleSingleton getInstance(){
        return instance;
    }

    public void VoidHello(){
        System.out.println("Hello from singleton class");
    }



}
