package com.zxk.lambda;

interface ILove {
    void love(int a);
}

class Love implements ILove {
    @Override
    public void love(int a) {
        System.out.println(a + "----->");
    }
}

public class TestLambda2 {
    static class Love2 implements ILove {
        @Override
        public void love(int a) {
            System.out.println(a + "----------->");
        }
    }

    public static void main(String[] args) {
        ILove love = new Love();
        love.love(1);

        love = new Love2();
        love.love(2);

        class Love3 implements ILove {
            @Override
            public void love(int a) {
                System.out.println(a + "-------->");
            }
        }

        love = new Love3();
        love.love(3);

        love = new ILove() {
            @Override
            public void love(int a) {
                System.out.println(a + "---------->");
            }
        };
        love.love(4);

        //简化过程

        love = (int a) -> {
            System.out.println(a + "------>");
        };
        love.love(4);

        love = (a) -> {
            System.out.println(a + "------>");
        };
        love.love(5);

        love = a -> {
            System.out.println(a + "-------->");
        };
        love.love(6);

        love = a -> System.out.println(a + "---------->");
        love.love(7);

    }
}
