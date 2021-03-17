package com.zxk.thread.syn;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class TestJUC {
    public static void main(String[] args) {
        //CopyOnWriteArrayList<Object> list = new CopyOnWriteArrayList<>();
        List list = new ArrayList();
        for (int i = 0; i <10000 ; i++) {
            new Thread(()->{
               list.add(Thread.currentThread().getName());
            }).start();
        }
        System.out.println(list.size());
    }
}
