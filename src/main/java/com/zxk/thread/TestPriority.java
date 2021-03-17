package com.zxk.thread;

public class TestPriority {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + "--->" + Thread.currentThread().getPriority());

        MyPriority myPriority = new MyPriority();

        Thread t1 = new Thread(myPriority,"1");
        Thread t2 = new Thread(myPriority,"2");
        Thread t3 = new Thread(myPriority,"3");
        Thread t4 = new Thread(myPriority,"4");
        Thread t5 = new Thread(myPriority,"5");
        Thread t6 = new Thread(myPriority,"6");
        Thread t7 = new Thread(myPriority,"7");

        t2.setPriority(1);
        t3.setPriority(4);
        t4.setPriority(Thread.MAX_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);
        //t6.setPriority(-1);
        //t7.setPriority(11);


        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        //t6.start();
        //t7.start();
    }
}

class MyPriority implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "--->" + Thread.currentThread().getPriority());
    }
}
