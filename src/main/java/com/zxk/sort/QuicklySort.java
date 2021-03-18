package com.zxk.sort;

import java.util.Arrays;

/**
 * @author zxk
 * @version 1.0
 * @description: TODO
 * @date 2021/3/11 16:11
 */
public class QuicklySort {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 46, 546, 5, 6, 5, 65, 6, 5, 6, 54, 64, 6, 4, 65, 45, 4};
        quick(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void quick(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int index = getIndex(arr, low, high);
        quick(arr, low, index - 1);
        quick(arr, index + 1, high);
    }

    static int getIndex(int[] arr, int low, int high) {
        int temp = arr[low];
        while (low < high) {
            while (low < high && arr[high] > temp) {
                high--;
            }
            arr[low] = arr[high];
            while (low < high && arr[low] <= temp) {
                low++;
            }
            arr[high] = arr[low];

        }
        arr[low] = temp;
        return low;
    }
}
