package com.zxk.thread.syn;

public class UnsafeBuyTicket {
    public static void main(String[] args) {
        BuyTicket buyTicket = new BuyTicket();
        new Thread(buyTicket, "我").start();
        new Thread(buyTicket, "你").start();
        new Thread(buyTicket, "黄牛").start();
    }
}

class BuyTicket implements Runnable {
    private int ticketNum = 10;
    boolean flag = true;

    @Override
    public void run() {
        //买票
        while (flag) {
            try {
                buy();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    private synchronized void buy() throws InterruptedException {
        //判断是否有票
        if (ticketNum <= 0) {
            flag = false;
            return;
        }
        Thread.sleep(100);
        System.out.println(Thread.currentThread().getName() + "买到" + ticketNum--);
    }
}