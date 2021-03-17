package com.zxk.mode;

public class StaticProxy {

    public static void main(String[] args) {
        MarryCompany marryCompany = new MarryCompany(new Man("胡汉三"));
        marryCompany.marry();
    }


}

class Man implements Marry {
    private String name;

    Man(String name) {
        this.name = name;
    }

    @Override
    public void marry() {
        System.out.println(name + "结婚啦");
    }
}

class MarryCompany implements Marry {
    private Marry target;

    MarryCompany(Marry target) {
        this.target = target;
    }

    @Override
    public void marry() {
        before();
        marrying();
        after();
    }

    private void before() {
        System.out.println("收份子钱");
    }

    private void marrying() {
        this.target.marry();
    }

    private void after() {
        System.out.println("收拾现场");
    }
}

interface Marry {
    void marry();
}
