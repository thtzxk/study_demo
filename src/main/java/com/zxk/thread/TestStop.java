package com.zxk.thread;

//1.建议让线程正常停止——利用次数，不建议死循环
//2.建议使用标志位
//3.不要使用stop destroy 等过时方法
public class TestStop implements Runnable{
    private boolean flag = true;

    @Override
    public void run() {
        int i = 0;
        while (flag){
            System.out.println("-------------"+i++);
        }
    }

    public void stop(){
        flag = false;
    }

    public static void main(String[] args) {
        TestStop testStop = new TestStop();
        new Thread(testStop).start();

        for (int i = 0; i <100000 ; i++) {
            //System.out.println("main------"+i);
            if(i == 77777){
                testStop.stop();
                System.out.println("线程停止吧");
            }
        }
    }
}
