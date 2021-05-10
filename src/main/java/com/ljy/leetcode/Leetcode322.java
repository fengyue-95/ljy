package com.ljy.leetcode;

import java.util.Arrays;

/**
 * @author fengyue
 * @date 2021/5/10 给定不同面额的硬币 coins 和一个总金额 amount。编写一个函数来计算可以凑成总金额所需的最少的硬币个数。如果没有任何一种硬币组合能组成总金额，返回 -1。 你可以认为每种硬币的数量是无限的。
 *   示例 1： 输入：coins = [1, 2, 5], amount = 11 输出：3 解释：11 = 5 + 5 + 1 示例 2： 输入：coins = [2], amount = 3 输出：-1 示例 3：
 * 输入：coins = [1], amount = 0 输出：0 示例 4： 输入：coins = [1], amount = 1 输出：1 示例 5： 输入：coins = [1], amount = 2 输出：2   提示： 1
 * <= coins.length <= 12 1 <= coins[i] <= 231 - 1 0 <= amount <= 104
 */
public class Leetcode322 {

    public static void main(String[] args) {
        int[] coins = {1};
        int amount = 0;
        int i = coinChange(coins, amount);
        System.out.println(i);
    }

    /**
     * 遍历所有最优解
     * 
     * @param coins
     * @param amount
     * @return
     *
     * [1]
     * 0
     */
    public static int coinChange(int[] coins, int amount) {
        if (coins.length == 0) {
            return -1;
        }

        // 初始化最优解存放数组
        int[] dp = new int[amount + 1];
        // [0,-1,-1...-1]
        Arrays.fill(dp, 1, dp.length, -1);

        for (int i = 1; i <=amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                // 如果当前金额面值小于等于i，并且金额i-coins[j]存在最优解
                if (coins[j] <=i && dp[i - coins[j]] != -1) {
                    // 如果当前金额还未计算或者dp[i]比正在计算的最优解大
                    if (dp[i] == -1 || dp[i] > dp[i - coins[j]] + 1) {
                        dp[i] = dp[i - coins[j]] + 1;
                    }
                }
            }
        }
        if(dp[amount]!=-1){
            return dp[amount];
        }

        return -1;
    }
}
