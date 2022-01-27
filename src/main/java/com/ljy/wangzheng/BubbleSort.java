package com.ljy.wangzheng;

/**
 * @author fengyue
 * @date 2022/1/27
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = { 4, 2, 3, 6, 5, 7, 9, 10 };
         sort(arr);
        System.out.println(arr);
    }

    public static void sort(int[] a) {
        int n = a.length;
        if (n <= 1) {
            return;
        }
        for (int i = 0; i < n; i++) {
            // 提前退出冒泡循环的标志位
            for (int j = 0; j < n ; j++) {
                if (a[i] > a[j]) { // 交换
                    int tmp = a[j];
                    a[j] = a[i];
                    a[i] = tmp;

                }
            }
        }
    }
}
