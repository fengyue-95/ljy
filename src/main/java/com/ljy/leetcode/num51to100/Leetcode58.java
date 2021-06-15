package com.ljy.leetcode.num51to100;

/**
 * @author fengyue
 * @date 2021/6/15
 *
 * 给你一个字符串 s，由若干单词组成，单词之间用空格隔开。返回字符串中最后一个单词的长度。如果不存在最后一个单词，请返回 0 。
 *
 * 单词 是指仅由字母组成、不包含任何空格字符的最大子字符串。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：s = "Hello World"
 * 输出：5
 * 示例 2：
 *
 * 输入：s = " "
 * 输出：0
 *  
 *
 * 提示：
 *
 * 1 <= s.length <= 104
 * s 仅有英文字母和空格 ' ' 组成
 */
public class Leetcode58 {


    public static int lengthOfLastWord(String s) {
        if(null == s || s.replaceAll(" ","").length()==0){
            return 0;
        }

        String[] s1 = s.split(" ");
        for (int i=s1.length-1;i<=s1.length-1;i++) {
            return s1[i].length();
        }
        return 0;
    }

    public static int lengthOfLastWord1(String s) {
        int length=0;
        for (int i=s.length()-1;i>=0;i--) {
           if(s.charAt(i)!=' '){
               length++;
           }else if(length>0){
               return length;
           }
        }

        return length;
    }
}
