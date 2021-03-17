package com.zxk.thread;

public class TestSleep implements Runnable {

    private int num = 10;

    @Override
    public void run() {
        while (true) {
            if (num <= 0) {
                break;
            }
            try{
                Thread.sleep(10);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "拿到了第" + num-- + "个数");
        }
    }

    public static void main(String[] args) {
        TestThread4 testThread4 = new TestThread4();
        new Thread(testThread4, "小明").start();
        new Thread(testThread4, "黄牛").start();
        new Thread(testThread4, "胡主席").start();
        new Thread(testThread4, "老师").start();
        new Thread(testThread4, "张立新").start();
    }
}
