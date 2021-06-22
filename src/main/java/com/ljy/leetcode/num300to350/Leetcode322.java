package com.ljy.leetcode.num300to350;

import java.util.Arrays;

import javax.swing.*;

/**
 * @author fengyue
 * @date 2021/6/21
 * 322. 零钱兑换
 *
 * 给定不同面额的硬币 coins 和一个总金额 amount。编写一个函数来计算可以凑成总金额所需的最少的硬币个数。如果没有任何一种硬币组合能组成总金额，返回 -1。
 *
 * 你可以认为每种硬币的数量是无限的。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：coins = [1, 2, 5], amount = 11
 * 输出：3
 * 解释：11 = 5 + 5 + 1
 * 示例 2：
 *
 * 输入：coins = [2], amount = 3
 * 输出：-1
 * 示例 3：
 *
 * 输入：coins = [1], amount = 0
 * 输出：0
 * 示例 4：
 *
 * 输入：coins = [1], amount = 1
 * 输出：1
 * 示例 5：
 *
 * 输入：coins = [1], amount = 2
 * 输出：2
 *  
 *
 * 提示：
 *
 * 1 <= coins.length <= 12
 * 1 <= coins[i] <= 231 - 1
 * 0 <= amount <= 104
 */
public class Leetcode322 {

    public static void main(String[] args) {
        int amount = 11;
        int[] coins = { 1, 2, 5 };

        int i = coinChange(coins, amount);
        System.out.println(i);
    }

    public static int coinChange(int[] coins, int amount) {
        // 初始化最优解存放数组
        int[] memo = new int[amount + 1];
        // [0,amount+1,amount+1...amount+1]
        Arrays.fill(memo, 1, memo.length, amount + 1);
        memo[0] = 0;

        // 这个循环主要是为了填充初始化的memo数组，并存放数组下标金额的最少使用零钱的张数
        for (int i = 0; i < memo.length; i++) {

            // 举例：打算计算金额为6的最少张数，看看是memo[6]与{memo[5]+1,memo[4]+1,memo[1]+1}中的最小【ps：这里的memo[5]已经是memo[5]和memo[4]+1的较小者了，memo[4],memo[1]一样的】
            for (int coin : coins) {
                if (i - coin < 0) {
                    continue;
                }
                memo[i] = Math.min(memo[i], 1 + memo[i - coin]);
            }
        }
        return (memo[amount] == amount + 1) ? -1 : memo[amount];
    }



}
