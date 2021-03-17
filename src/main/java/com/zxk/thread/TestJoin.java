package com.zxk.thread;

public class TestJoin implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            System.out.println("线程vip来了"+i);
        }
    }


    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new TestJoin());
        thread.start();

        for (int i = 0; i <1000 ; i++) {
            System.out.println("========="+i);
            if(i == 333){
                thread.join();
            }
        }
    }
}
