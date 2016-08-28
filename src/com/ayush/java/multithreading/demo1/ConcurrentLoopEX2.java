package com.ayush.java.multithreading.demo1;

/**
 * Concurrent for loop example with two threads
 * executing in parallel. We are creating threads
 * here by implementing the runnable interface.
 */
public class ConcurrentLoopEX2 implements Runnable{

    @Override
    public void run() {
        for(int i=0 ; i<10 ; i++){
            System.out.println("EX2 Iteration : "+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
