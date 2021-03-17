package com.zxk.demo;

public class Demo2 {
    static int i = 8;
    public static void main(String[] args) {
         judge("dd");

    }

    static void judge(String arg){
        assert arg.equals("dd");
        System.out.println("打印了");
    }
}
