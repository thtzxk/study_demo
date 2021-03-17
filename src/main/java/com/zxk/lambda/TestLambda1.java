package com.zxk.lambda;

// 定义接口
interface ILike{
    void lambda();
}

//1 外部内部类
class Like implements ILike{
    @Override
    public void lambda() {
        System.out.println("外部内部类：i like lambda");
    }
}

public class TestLambda1 {

    //2 静态内部类
    static class Like2 implements ILike{
        @Override
        public void lambda() {
            System.out.println("静态内部类：i like lambda2");
        }
    }

    public static void main(String[] args) {
        ILike like = new Like();
        like.lambda();

        like = new Like2();
        like.lambda();

        //3 局部内部类
        class Like3 implements ILike{
            @Override
            public void lambda() {
                System.out.println("局部内部类：i like lambda3");
            }
        }
        like = new Like3();
        like.lambda();

        //4 匿名内部类
        like = new ILike() {
            @Override
            public void lambda() {
                System.out.println("匿名内部类：i like lambda4");
            }
        };
        like.lambda();

        //5 lambda简化匿名内部类
        like = ()->{
            System.out.println("lambda表达式：i like lambda5");
        };
        like.lambda();
    }
}

