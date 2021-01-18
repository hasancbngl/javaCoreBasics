package com.company;

public class Main {


    public static void main(String[] args) throws InterruptedException {

        TestThread testThread = new TestThread();
        testThread.start();


        for(int i=0;i<6;i++) {
            Thread.yield(); 
            System.out.println("main Thread: " +  i);
           // Thread.sleep(250);
      //      Thread.currentThread().join();

        }




        /*
       // TestThread testThread = new TestThread();
       // testThread.start();
          for(int i=0;i<11;i++) {
            ThreadE threadE = new ThreadE();
            threadE.myThread.start(); // when the thread starts it executes the run method

              // System.out.println(threadE.myThread.isAlive());

        }

      Thread myThread = new Thread();
        System.out.println(myThread.currentThread());
        System.out.println(myThread.getId());
        System.out.println(myThread.getPriority());

*/



    }
}
