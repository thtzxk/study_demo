package com.zxk.thread;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

//练习Thread，实现多线程同步下载图片
public class TestThread2 extends Thread{

    private String url;//网络图片地址
    private String name;//保存的文件名

    public TestThread2(String url, String name){
        this.url = url;
        this.name = name;
    }

    @Override
    public void run() {
        WebDownloader webDownloader = new WebDownloader();
        webDownloader.downloader(url,name);
        System.out.println("下载的文件名为："+name);
    }

    public static void main(String[] args) {
        TestThread2 t1 =new TestThread2("https://img.alicdn.com/imgextra/i4/411980463/O1CN014t9Gci1FI5u3Z3sN0_!!411980463.jpg","tb1");
        TestThread2 t2 =new TestThread2("https://img.alicdn.com/imgextra/i4/411980463/O1CN014t9Gci1FI5u3Z3sN0_!!411980463.jpg","tb2");
        TestThread2 t3 =new TestThread2("https://img.alicdn.com/imgextra/i4/411980463/O1CN014t9Gci1FI5u3Z3sN0_!!411980463.jpg","tb3");
        t1.start();
        t2.start();
        t3.start();
    }
}

class WebDownloader{
    //下载方法
    public void downloader(String url,String name){
        try {
            FileUtils.copyURLToFile(new URL(url),new File(name));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO异常，downloader方法出现异常");
        }
    }
}
