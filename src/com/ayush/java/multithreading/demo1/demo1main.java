package com.ayush.java.multithreading.demo1;

/**
 * Main program for demo 1.
 */
public class demo1main {
    public static void main(String[] args){

        // Running thread by extending the thread class
        ConcurrentLoopEX1 ex1t1 = new ConcurrentLoopEX1();
        ex1t1.start();

        ConcurrentLoopEX1 ex1t2 = new ConcurrentLoopEX1();
        ex1t2.start();

        /*Sleeping for 3 seconds to let the first example class to complete iterations*/
        try {
            Thread.sleep(3*10*100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Running thread by implementing the runnable interface
        Thread ex2t1 = new Thread(new ConcurrentLoopEX2());
        ex2t1.start();

        Thread ex2t2 = new Thread(new ConcurrentLoopEX2());
        ex2t2.start();

        /*Sleeping for 3 seconds to let the second example class to complete iterations*/

        try {
            Thread.sleep(3*10*100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Running as an anonymous class

        Thread ex3t1 = new Thread(new Runnable() {
            @Override
            public void run() {
               for(int i=0;i<10;i++){
                   System.out.println("EX3 Iteration : "+i);
                   try {
                       Thread.sleep(100);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }
            }
        });
        ex3t1.start();

        Thread ex3t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++){
                    System.out.println("EX3 Iteration : "+i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        ex3t2.start();
    }
}
