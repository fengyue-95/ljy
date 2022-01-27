package com.ljy.wangzheng;

import java.util.HashMap;
import java.util.Map;

/**
 * 台阶问题 一共有n个台阶，一次最多上1个或者2个台阶
 * 
 * @author fengyue
 * @date 2022/1/27
 */
public class StepProblem {

    private static final Map<Integer, Integer> history = new HashMap<Integer, Integer>();

    public static void main(String[] args) {
        int count = count(3);
        System.out.println(count);
    }

    public static int count(int n) {
        if (n <= 1) {
            return 1;
        }
        if (history.containsKey(n)) {
            return history.get(n);
        }
        int sum = count(n - 1) + count(n - 2);
        history.put(n, sum);

        return sum;
    }

}
