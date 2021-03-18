package com.zxk.study;

import com.zxk.study.entity.User;
import com.zxk.study.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.CountDownLatch;

@SpringBootTest
class StudyApplicationTests {
//
//    @Autowired
//    private UserMapper userMapper;
//
//    @Test
//    void findAll() {
//        //查询user表中所有数据
//        List<User> users = userMapper.selectList(null);
//        users.forEach(System.out::println);
//    }
//
//    @Test
//    void addUser(){
//        User user = new User();
//        user.setAge(66);
//        user.setEmail("lucy.qq.com");
//        user.setName("东方不败");
//        int insert = userMapper.insert(user);
//        System.out.println("insert:"+insert);
//    }
//
//    @Test
//    void updateUser(){
//        User user = new User();
//        user.setId(1309862728680103937l);
//        user.setAge(120);
//        int row = userMapper.updateById(user);
//        System.out.println(row);
//    }
//
//    //测试乐观锁
//    @Test
//    public void testOptimisticLocker(){
//        User user = userMapper.selectById(1309862728680103937l);
//        user.setAge(99);
//        userMapper.updateById(user);
//    }
//
//    @Test
//    public void testSelectBatch(){
//        List users = userMapper.selectBatchIds(Arrays.asList(1l,2l,3l));
//        System.out.println(users);
//    }
//
//    @Test
//    public void testSelectByMap(){
//        Map map = new HashMap();
//        map.put("age",18);
//        List users = userMapper.selectByMap(map);
//        System.out.println(users);
//    }
//
//
//    public static void main(String[] args) throws Exception {
//        // 构造一个10000个元素的集合
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < 10000; i++) {
//            list.add(i);
//        }
//        // 统计并行执行list的线程
//        Set<Thread> threadSet = new CopyOnWriteArraySet<>();
//        // 并行执行
//        list.parallelStream().forEach(integer -> {
//            Thread thread = Thread.currentThread();
//            // System.out.println(thread);
//            // 统计并行执行list的线程
//            threadSet.add(thread);
//        });
//        System.out.println("threadSet一共有" + threadSet.size() + "个线程");
//        System.out.println("系统一个有"+Runtime.getRuntime().availableProcessors()+"个cpu");
//        List<Integer> list1 = new ArrayList<>();
//        List<Integer> list2 = new ArrayList<>();
//        for (int i = 0; i < 100000; i++) {
//            list1.add(i);
//            list2.add(i);
//        }
//        Set<Thread> threadSetTwo = new CopyOnWriteArraySet<>();
//        CountDownLatch countDownLatch = new CountDownLatch(2);
//        Thread threadA = new Thread(() -> {
//            list1.parallelStream().forEach(integer -> {
//                Thread thread = Thread.currentThread();
//                // System.out.println("list1" + thread);
//                threadSetTwo.add(thread);
//            });
//            countDownLatch.countDown();
//        });
//        Thread threadB = new Thread(() -> {
//            list2.parallelStream().forEach(integer -> {
//                Thread thread = Thread.currentThread();
//                // System.out.println("list2" + thread);
//                threadSetTwo.add(thread);
//            });
//            countDownLatch.countDown();
//        });
//
//        threadA.start();
//        threadB.start();
//        countDownLatch.await();
//        System.out.print("threadSetTwo一共有" + threadSetTwo.size() + "个线程");
//
//        System.out.println("---------------------------");
//        System.out.println(threadSet);
//        System.out.println(threadSetTwo);
//        System.out.println("---------------------------");
//        threadSetTwo.addAll(threadSet);
//        System.out.println(threadSetTwo);
//        System.out.println("threadSetTwo一共有" + threadSetTwo.size() + "个线程");
//        System.out.println("系统一个有"+Runtime.getRuntime().availableProcessors()+"个cpu");
//    }
}
