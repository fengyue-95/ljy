package com.ljy.labuladong.sliderWindow;

import java.util.HashMap;

/**
 * @author fengyue
 * @date 2021/8/17
 */
public class SlideWindowPoint {

    public static void main(String[] args) {
        String s= "bbaa";
        String t= "aba";

        String window = minWindow(s, t);
        System.out.println("window="+window);
    }

    /**
     * 最小覆盖子串
     * 
     * @param s
     * @param t
     * @return
     */
    public static String minWindow(String s, String t) {
        char[] source = s.toCharArray();
        char[] target = t.toCharArray();

        HashMap<Character, Integer> window = new HashMap<>();
        HashMap<Character, Integer> need = new HashMap<>();

        // 初始化目标数据
        for (char c : target) {
            if (need.containsKey(c)) {
                Integer integer = need.get(c);
                integer = integer + 1;
                window.put(c,integer);
                need.put(c, integer);
            } else {
                window.put(c,1);
                need.put(c, 1);
            }
        }

        int left = 0, right = 0;
        int vaild = 0;

        int start = 0;
        int len = Integer.MAX_VALUE;

        while (right < source.length) {
            // 移入窗口的对象
            char c = source[right];
            right++;



            if (need.containsKey(c)) {

                Integer i1 = need.get(c);
                if(i1>0){
                    need.put(c,i1-1);
                    vaild++;
                }
            }

            // 说明窗口里已经包含了所有目标元素，开始缩小左窗口
            while (vaild== target.length) {
                // 在这里更新最小覆盖子串
                if (right - left < len) {
                    start = left;
                    len = right - left;
                }
                // 移除的对象
                char d = source[left];
                left++;

                if (need.containsKey(d)) {
                    // 如果移除的是目标元素
                    if (window.containsKey(d)) {
                        if (window.get(d).equals(need.get(d))) {
                            vaild--;
                        }
                        Integer integer = window.get(d);
                        integer = integer - 1;
                        window.put(d, integer);
                    }

                }
            }

        }
        return len == Integer.MAX_VALUE ? "" : s.substring(start, start+len);
    }


    //public static String minWindow(String s, String t) {
    //    if (s == null || s.length() == 0 || t == null || t.length() == 0){
    //        return "";
    //    }
    //    int[] need = new int[128];
    //    //记录需要的字符的个数
    //    for (int i = 0; i < t.length(); i++) {
    //        need[t.charAt(i)]++;
    //    }
    //    //l是当前左边界，r是当前右边界，size记录窗口大小，count是需求的字符个数，start是最小覆盖串开始的index
    //    int l = 0, r = 0, size = Integer.MAX_VALUE, count = t.length(), start = 0;
    //    //遍历所有字符
    //    while (r < s.length()) {
    //        char c = s.charAt(r);
    //        if (need[c] > 0) {//需要字符c
    //            count--;
    //        }
    //        need[c]--;//把右边的字符加入窗口
    //        if (count == 0) {//窗口中已经包含所有字符
    //            while (l < r && need[s.charAt(l)] < 0) {
    //                need[s.charAt(l)]++;//释放右边移动出窗口的字符
    //                l++;//指针右移
    //            }
    //            if (r - l + 1 < size) {//不能右移时候挑战最小窗口大小，更新最小窗口开始的start
    //                size = r - l + 1;
    //                start = l;//记录下最小值时候的开始位置，最后返回覆盖串时候会用到
    //            }
    //            //l向右移动后窗口肯定不能满足了 重新开始循环
    //            need[s.charAt(l)]++;
    //            l++;
    //            count++;
    //        }
    //        r++;
    //    }
    //    return size == Integer.MAX_VALUE ? "" : s.substring(start, start + size);
    //}

}
