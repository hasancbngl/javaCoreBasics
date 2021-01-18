package com.company;

public class ThreadE implements Runnable {

    Thread myThread;

    public ThreadE() {
        myThread = new Thread(this, "ThreadE");
        System.out.println("created Thread: " + myThread.getName());
        System.out.println(myThread);
    }


    @Override
    public void run() {
        for (int i = 4; i > 0; i--) {
            System.out.println("Thread: " + TestThread.currentThread() + ", " + i);
            // Let the thread sleep for a while.
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
