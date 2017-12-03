package com.ddabadi;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        SimpleSingleton simple= SimpleSingleton.getInstance();

        simple.VoidHello();
        simple.VoidHi();
        simple.iterate_array();
    }
}

