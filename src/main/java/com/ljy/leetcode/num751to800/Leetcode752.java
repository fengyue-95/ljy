package com.ljy.leetcode.num751to800;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * @author fengyue
 * @date 2021/7/19
 *
 * 你有一个带有四个圆形拨轮的转盘锁。每个拨轮都有10个数字： '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' 。每个拨轮可以自由旋转：例如把 '9' 变为 '0'，'0' 变为
 * '9' 。每次旋转都只能旋转一个拨轮的一位数字。
 *
 * 锁的初始数字为 '0000' ，一个代表四个拨轮的数字的字符串。
 *
 * 列表 deadends 包含了一组死亡数字，一旦拨轮的数字和列表里的任何一个元素相同，这个锁将会被永久锁定，无法再被旋转。
 *
 * 字符串 target 代表可以解锁的数字，你需要给出解锁需要的最小旋转次数，如果无论如何不能解锁，返回 -1 。
 *
 *  
 *
 * 示例 1:
 *
 * 输入：deadends = ["0201","0101","0102","1212","2002"], target = "0202"
 * 输出：6
 * 解释：
 * 可能的移动序列为 "0000" -> "1000" -> "1100" -> "1200" -> "1201" -> "1202" -> "0202"。
 * 注意 "0000" -> "0001" -> "0002" -> "0102" -> "0202" 这样的序列是不能解锁的，
 * 因为当拨动到 "0102" 时这个锁就会被锁定。
 * 示例 2:
 *
 * 输入: deadends = ["8888"], target = "0009"
 * 输出：1
 * 解释：
 * 把最后一位反向旋转一次即可 "0000" -> "0009"。
 * 示例 3:
 *
 * 输入: deadends = ["8887","8889","8878","8898","8788","8988","7888","9888"], target = "8888"
 * 输出：-1
 * 解释：
 * 无法旋转到目标数字且不被锁定。
 * 示例 4:
 *
 * 输入: deadends = ["0000"], target = "8888"
 * 输出：-1
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/open-the-lock
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Leetcode752 {

    public static void main(String[] args) {
        String[] deadends= {"8888"};
        String target= "0009";
        int i = openLock(deadends, target);
        System.out.println(i);

    }

    public static int openLock(String[] deadends, String target) {

        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        Set<String> dead = new HashSet<>();

        for (int i = 0; i < deadends.length - 1; i++) {
            dead.add(deadends[i]);
        }

        queue.offer("0000");
        visited.add("0000");
        int times = 0;

        while (!queue.isEmpty()) {

            int size = queue.size();

            for (int i = 0; i < size; i++) {
                String current = queue.poll();

                // 遇到死亡数字，继续
                if (dead.contains(current)) {
                    continue;
                }
                // 遇到目标数字，返回
                if (target.equals(current)) {
                    return times;
                }

                for (int j = 0; j < 4; j++) {
                    String plusOne = plusOne(current, j);
                    if (!visited.contains(plusOne)) {
                        queue.offer(plusOne);
                        visited.add(plusOne);
                    }

                    String minusOne = minusOne(current, j);
                    if (!visited.contains(minusOne)) {
                        queue.offer(minusOne);
                        visited.add(minusOne);
                    }

                }

            }

            times++;
        }

        return times;
    }

    // 第一步，遍历出所有可能

    /**
     * +1操作
     * 
     * @param str
     * @param index
     * @return
     */
    static String  plusOne(String str, int index) {
        char[] array = str.toCharArray();
        // 9+1=10==0
        if (array[index] == '9') {
            array[index] = '0';
        } else {
            array[index] += array[index];
        }
        return array.toString();
    }

    static String minusOne(String str, int index) {
        char[] array = str.toCharArray();
        // 0-1==9
        if (array[index] == '0') {
            array[index] = '9';
        } else {
            array[index] -= array[index];
        }
        return array.toString();
    }

    public void total() {
        Queue<String> queue = new LinkedList<>();
        queue.offer("0000");
        int depth = 0;
        while (!queue.isEmpty()) {
            int sz = queue.size();

            for (int i = 0; i < sz; i++) {
                String curr = queue.poll();

                for (int j = 0; j < 4; j++) {
                    String plus = plusOne(curr, j);
                    String minue = minusOne(curr, j);
                    queue.offer(plus);
                    queue.offer(minue);
                }
            }

        }

    }

}
