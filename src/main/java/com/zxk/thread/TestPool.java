package com.zxk.thread;

import java.util.concurrent.*;

public class TestPool {
    public static void main(String[] args) {
        //ExecutorService executorService = Executors.newFixedThreadPool(10);
        ExecutorService executorService = new ThreadPoolExecutor(4,7,1L, TimeUnit.SECONDS,new LinkedBlockingDeque<>(3),Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
        executorService.execute(new MyThread());
        executorService.execute(new MyThread());
        executorService.execute(new MyThread());
        executorService.execute(new MyThread());

        executorService.shutdown();
    }
}

class MyThread implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
