package com.ljy.leetcode.idea;

import java.util.LinkedList;
import java.util.List;

/**
 * @author fengyue
 * @date 2021/6/22
 * 全排列  元素不相同
 */
public class FullPermutation {

    public static List<String> res=new LinkedList<String>();
    public static void main(String[] args) {
        int[] nums={1,2,3};
        List<String> permute = permute(nums);
        System.out.println(permute);
    }

    public static List<String> permute(int[] nums){
        LinkedList<Integer> stack = new LinkedList<>();
        backtrack(nums,stack);
        return res;
    }


    public static void backtrack(int[] nums,LinkedList<Integer> stack){
        //nums 1,2,3
        if(stack.size()==nums.length){
            //说明已经遍历结束（遍历到树到叶子节点）
            String string = stack.toString();
            res.add(string);
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
