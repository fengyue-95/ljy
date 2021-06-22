package com.ljy.leetcode.num51to100;

import java.util.Arrays;

/**
 * @author fengyue
 * @date 2021/6/15
 *
 * 给你两个二进制字符串，返回它们的和（用二进制表示）。
 *
 * 输入为 非空 字符串且只包含数字 1 和 0。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: a = "11", b = "1"
 * 输出: "100"
 * 示例 2:
 *
 * 输入: a = "1010", b = "1011"
 * 输出: "10101"
 *  
 *
 * 提示：
 *
 * 每个字符串仅由字符 '0' 或 '1' 组成。
 * 1 <= a.length, b.length <= 10^4
 * 字符串如果不是 "0" ，就都不含前导零。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-binary
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Leetcode67 {

    public static void main(String[] args) {
        String a="1010";
        String b="1011";
        System.out.println(addBinary(a,b));
    }

    /**
     * 正常运算思路
     * @param a
     * @param b
     * @return
     */
    public static String addBinary(String a, String b) {
        StringBuffer sb=new StringBuffer();
        String[] aplit = a.split("");
        String[] bplit = b.split("");
        boolean suc=false;

        int i = a.length() - 1;
        int j = b.length() - 1;
        for (; i >= 0 || j >= 0;) {
            Integer achar=0;
            if(i>=0){
                achar = Integer.valueOf(aplit[i]);
            }
            Integer bchar=0;
            if(j>=0){
                bchar = Integer.valueOf(bplit[j]);
            }
            int sum = achar.intValue() + bchar.intValue();
            if(suc){
                sum=sum+1;
            }
            if(sum>=2) {
                //说明需要进位
                if (sum == 2) {
                    sb.append(0);
                } else {
                    sb.append(1);
                }
                suc = true;
            }else{
                sb.append(sum);
                suc = false;
            }
            i--;
            j--;
        }
        if(suc){
            sb.append(1);
        }

        return sb.reverse().toString();
    }

}
