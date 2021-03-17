package com.zxk.thread.syn;

import java.util.concurrent.locks.ReentrantLock;

public class TestLock {
    public static void main(String[] args) {
        TestLock2 testLock2 = new TestLock2();
        new Thread(testLock2).start();
        new Thread(testLock2).start();
        new Thread(testLock2).start();
    }
}
class TestLock2 implements Runnable{
    private final ReentrantLock lock = new ReentrantLock();

    int ticketNum = 10;
    @Override
    public void run() {
        //lock.lock();
        try {
            while (true){
                if(ticketNum < 0){
                    break;
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(ticketNum--);
            }
        }finally {
            //lock.unlock();
        }

    }
}
