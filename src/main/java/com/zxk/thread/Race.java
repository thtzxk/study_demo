package com.zxk.thread;

public class Race implements Runnable {

    private static String winner;

    @Override
    public void run() {

        for (int i = 0; i < 1000; i++) {
            if (Thread.currentThread().getName().equals("兔子") && i % 22 == 0) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println(Thread.currentThread().getName() + "已经走了" + i + "步了！");

            if(gameOver()){
                System.out.println(winner + "已经赢了");
                System.exit(0);
            }
        }

        winner = Thread.currentThread().getName();
    }

    private static boolean gameOver(){
        return winner != null;
    }

    public static void main(String[] args) {
        Race race = new Race();
        new Thread(race,"兔子").start();
        new Thread(race,"乌龟").start();

    }
}
