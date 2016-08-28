package com.ayush.java.multithreading.demo2;

import java.util.Scanner;

/**
 * Main class for demo 2 example.
 *
 */
public class demo2main {
    public static void main(String[] args){
        VolatileExample volatileExample = new VolatileExample();
        Thread t1 = new Thread(volatileExample);
        t1.start();

        System.out.print("Hit enter to shut down the thread");
        Scanner s = new Scanner(System.in);
        s.nextLine();
        volatileExample.shutdown();
    }
}
