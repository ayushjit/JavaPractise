package com.ayush.java.multithreading.demo1;

/**
 * Concurrent for loop example with two threads
 * executing in parallel. We are creating threads
 * here by extending the thread class.
 *
 */
public class ConcurrentLoopEX1 extends Thread{
   public void run(){
       for(int i=0;i<10;i++) {
           System.out.println("EX1 Iteration : "+i);
           try {
               Thread.sleep(100);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
   }
}

