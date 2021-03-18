package com.zxk.hashMapStudy;

/**
 * @author zxk
 * @version 1.0
 * @description: TODO
 * @date 2021/3/8 17:22
 */
public interface MapTest {
    void put(Object key, Object value);

    Object get(Object key);

    int size();

    boolean isEmpty();

    interface Entry {
        Object getKey();

        Object getValue();
    }
}
