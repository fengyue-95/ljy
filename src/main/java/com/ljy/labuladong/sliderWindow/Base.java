package com.ljy.labuladong.sliderWindow;

import java.util.HashMap;

/**
 * @author fengyue
 * @date 2021/8/17
 */
public class Base {

    /* 滑动窗口算法框架 */
    void slidingWindow(String s, String t) {
        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();

        char[] chars = t.toCharArray();

        for (char c : chars) {
            if (need.containsKey(c)) {
                Integer integer = need.get(c);
                integer = integer + 1;
                need.put(c, integer);
            } else {
                need.put(c, 1);
            }
        }

        char[] array = s.toCharArray();

        int left = 0, right = 0;
        int valid = 0;
        while (right < array.length) {
            // c 是将移入窗口的字符
            char c = array[right];
            // 右移窗口
            right++;
            // 进行窗口内数据的一系列更新

            /*** debug 输出的位置 ***/
            System.out.println("window: [" + left + ", " + right + "%d)\n");
            /********************/

            // 判断左侧窗口是否要收缩
            // while (window needs shrink) {
            // d 是将移出窗口的字符
            char d = array[left];
            // 左移窗口
            left++;
            // 进行窗口内数据的一系列更新
        }
    }
}
