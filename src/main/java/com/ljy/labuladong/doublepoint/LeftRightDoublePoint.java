package com.ljy.labuladong.doublepoint;

/**
 * 左右指针
 * 
 * @author fengyue
 * @date 2021/8/16
 */
public class LeftRightDoublePoint {

    /**
     * 二分查找
     * 
     * @return
     */
    int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            }
        }
        return -1;

    }

    /**
     * 两数之和
     * 
     * @param nums
     * @param target
     * @return
     */
    int[] toSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new int[] { left + 1, right + 1 };
            } else if (sum > target) {
                right--;
            } else if (sum < target) {
                left++;
            }
        }
        return new int[] {};
    }

    /**
     * 反转数组
     * 
     * @param nums
     */
    void reverse(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }

    }

}
