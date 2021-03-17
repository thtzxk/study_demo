package com.zxk.thread;

public class TestThread4 implements Runnable {

    private int num = 10;

    @Override
    public void run() {
        while(Thread.currentThread().getName().equals("88")){
            System.out.println("god bless you");
        }
        while (true) {
            if(num <= 0){
                break;
            }
            System.out.println(Thread.currentThread().getName() + "拿到了第" + num-- + "个数");
        }

    }

    public static void main(String[] args) {
        TestThread4 testThread4 = new TestThread4();

        Thread thread = new Thread(testThread4,"88");
        thread.setDaemon(true);
        thread.start();

        new Thread(testThread4,"小明").start();
        new Thread(testThread4,"黄牛").start();
        new Thread(testThread4,"胡主席").start();
        new Thread(testThread4,"老师").start();
        new Thread(testThread4,"张立新").start();



    }



}
