package com.zxk.thread;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSleep2 {
    public static void tenDown() throws InterruptedException {
        int num = 10;
        while (true){
            Thread.sleep(1000);
            System.out.println(num--);
            if(num <= 0){
                break;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
       //tenDown();
       Date start = new Date(System.currentTimeMillis());
       while (true){
           Thread.sleep(1000);
           System.out.println(new SimpleDateFormat("HH:mm:ss:sss").format(start));
           start = new Date(System.currentTimeMillis());
       }

    }
}
