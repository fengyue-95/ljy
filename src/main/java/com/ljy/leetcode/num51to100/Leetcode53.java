package com.ljy.leetcode.num51to100;

/**
 * @author fengyue
 * @date 2021/6/15
 *
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
 * 输出：6
 * 解释：连续子数组 [4,-1,2,1] 的和最大，为 6 。
 * 示例 2：
 *
 * 输入：nums = [1]
 * 输出：1
 * 示例 3：
 *
 * 输入：nums = [0]
 * 输出：0
 * 示例 4：
 *
 * 输入：nums = [-1]
 * 输出：-1
 * 示例 5：
 *
 * 输入：nums = [-100000]
 * 输出：-100000
 *  
 *
 * 提示：
 *
 * 1 <= nums.length <= 3 * 104
 * -105 <= nums[i] <= 105
 *
 */
public class Leetcode53 {
    public static void main(String[] args) {
       int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int i = maxSubArray(nums);
        System.out.println(i);
    }

    public static int maxSubArray(int[] nums) {
        if(nums.length==0){
            return -1;
        }
        int res=nums[0];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            //只有元素>0时才去+,因为负数相加只会越来越小
            if(sum>0){
                sum=sum+nums[i];
            }else{
                //因为是连续串，所以当遇到负数时，就置为当前数
                sum=nums[i];
            }
            res=Math.max(sum,res);
        }
        return res;
    }
}
