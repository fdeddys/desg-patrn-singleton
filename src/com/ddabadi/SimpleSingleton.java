package com.ddabadi;

import java.util.ArrayList;

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

    public void iterate_array(){
        System.out.println("Singleton Iterate Array 1D, 2D, 3D ");
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Satu");
        arr.add("Dua");
        arr.add("Tiga");
        arr.add("Empat");
        arr.add("Lima");

        System.out.println("Array 1 d");

        System.out.print("{ ");
        for (String isi : arr){
            System.out.print(isi+" ");
        }
        System.out.println(" }");

        int[][] arr2D = {{1,2,3,4,5},{6,7,8,9,10}};
        System.out.println("Array 2D");
        System.out.print("{ ");
        for (int[] arr1D : arr2D ){
            System.out.print("{ ");
            for (int isi : arr1D){
                System.out.print(isi + "  ");
            }
            System.out.print("}");
        }
        System.out.println(" }");

        int [][][] arr3Dim = {{{1,2,3},{4,5,6},{7,8,9}},{{11,12,14},{14,15,16},{17,18,19}}};
        System.out.println("Array 3D");
        System.out.print("{ ");
        for (int[][] arr2Dim : arr3Dim){
            System.out.print("{ ");
            for (int[] arr1Dim : arr2Dim){
                System.out.print("{ ");
                for (int isi : arr1Dim){
                    System.out.print(isi + " ");
                }
                System.out.print(" }");
            }
            System.out.print(" }");
        }
        System.out.println(" }");
    }



}
