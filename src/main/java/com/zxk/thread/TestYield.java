package com.zxk.thread;

//礼让 允许->就绪  礼让不一定成功，主要看cpu心情
public class TestYield {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        new Thread(thread1,"A").start();
        new Thread(thread1,"B").start();
    }

    static class Thread1 implements Runnable{
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName()+"---开始");
            Thread.yield();
            System.out.println(Thread.currentThread().getName()+"---结束");
        }
    }
}



