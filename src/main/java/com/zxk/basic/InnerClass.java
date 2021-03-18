package com.zxk.basic;

public class InnerClass {
    private int id;
    private void out(){
        System.out.println("外部类方法");
    }

    public void method(){
        //局部内部类
        class B{

        }
    }

    public static void main(String[] args) {
        new C(){
            @Override
            public void Hello() {
                System.out.println("C.hello");
            }
        }.Hello();
    }

    //普通内部类
    public class Inner {
        public void in(){
            System.out.println("内部类方法");
        }
        public void getOutId(){
            System.out.println(id);
        }
    }

    //静态内部类
    public static class Inner2{

    }
}

interface C {
    void Hello();
}

//同级的类
class A{

}
