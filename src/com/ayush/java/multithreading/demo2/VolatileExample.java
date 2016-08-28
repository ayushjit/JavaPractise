package com.ayush.java.multithreading.demo2;

/**
 * Use of the volatile key word.
 */
public class VolatileExample implements Runnable{

    /*The variable is set to be volatile
    so that the compiler does not do any
    optimization on this variable. If the
    variable is not volatile and some other
    thread(Main program thread in this case)
    calls for the method shutdown it
    is not guaranteed that the running thread
    will read the 'running' variable as false.
    The thread might have a cached version
    of the variable and might keep running
    the while loop. We can also say that
    the variable is guaranteed to be read
    and written from the main memory instead
    of the CPU cache.
    */

    private boolean running = true;

    @Override
    public void run() {
        while (running){
            System.out.println("In loop!!");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void shutdown(){
        running = false;
    }
}
