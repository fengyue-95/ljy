package com.ljy.leetcode.offer;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import com.ljy.leetcode.datastructure.MyLinkedList;

/**
 * @author fengyue
 * @date 2021/6/22
 *
 * 字符串的排列
 *
 * 输入一个字符串，打印出该字符串中字符的所有排列。
 *
 *  
 *
 * 你可以以任意顺序返回这个字符串数组，但里面不能有重复元素。
 *
 *  
 *
 * 示例:
 *
 * 输入：s = "abc"
 * 输出：["abc","acb","bac","bca","cab","cba"]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/zi-fu-chuan-de-pai-lie-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Offer38 {
    static Set<String> res = new HashSet<>();

    public static void main(String[] args) {
        String s="aab";
        String[] permutation = permutation(s);
    }

    public static String[] permutation(String s) {
        char[] arr = s.toCharArray();
        MyLinkedList<Character> stack = new MyLinkedList<>();
        backtrack(arr,stack);
        String[] strings = res.toArray(new String[0]);
        System.out.println(strings);
        return strings;

    }

    private static void backtrack(char[] nums, MyLinkedList<Character> stack) {

        //nums 1,2,3
        if(stack.size()==nums.length){
            //说明已经遍历结束（遍历到树到叶子节点）
            res.add(stack.toString());
            return;
        }

        for (int i=0;i<nums.length;i++){
            if(stack.contains(nums[i])){
                //说明该路径已经被遍历过；
                continue;
            }
            stack.add(nums[i]);
            backtrack(nums,stack);
            //栈退回
            stack.removeLast();
        }

    }

}
