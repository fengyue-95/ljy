package com.ljy.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author fengyue
 * @date 2021/4/16
 *
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 *
 * 你可以按任意顺序返回答案。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 * 示例 2：
 *
 * 输入：nums = [3,2,4], target = 6
 * 输出：[1,2]
 * 示例 3：
 *
 * 输入：nums = [3,3], target = 6
 * 输出：[0,1]
 */
public class Leetcode1 {

    public static void main(String[] args) {
        int[] nums = new int[] {2, 7, 11, 15};
        int target=9;
        int[] ints = twoSum(nums, target);
        System.out.println(ints[0]+"  "+ints[1]);

    }


    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0; i < nums.length; i++) {
            int t1 = target - nums[i];
            if(map.containsKey(t1)){
                return new int[]{i,map.get(t1)};
            }
            map.put(nums[i],i);
        }
        return null;
    }

    /**
     * 解法2
     */
    //public static  int[] twoSum(int[] nums, int target) {
    //
    //    int [] res={};
    //    Map<Integer,Integer> contain = new HashMap<Integer,Integer>();
    //    for (int i=0;i<nums.length;i++){
    //        contain.put(nums[i],i);
    //    }
    //
    //    for (int i=0;i<nums.length;i++){
    //        int mid=target-nums[i];
    //        if(contain.containsKey(mid)&&(i!=(int)contain.get(mid))){
    //            res= new int[]{i, (int)contain.get(mid)};
    //            break;
    //        }
    //    }
    //    return res;
    //}

}
