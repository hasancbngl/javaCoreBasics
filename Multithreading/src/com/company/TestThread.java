package com.company;

public class TestThread extends Thread{

    public TestThread(){
        //intialize the thread
        super("Test Thread");
        System.out.println(this);
    }


    @Override
    public void run() {
        for(int i=0;i<6;i++) {
            System.out.println("Test Thread: " +  i);
        }
        }
    }

