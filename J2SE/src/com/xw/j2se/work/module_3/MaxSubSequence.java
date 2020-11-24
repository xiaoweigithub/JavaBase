package com.xw.j2se.work.module_3;

/**
 * 最长公共子序列
 */
public class MaxSubSequence {

    private static final String a = "helloword";
    private static final String b = "ehllowodr";

    public static void main(String[] args) {
        System.out.println(normalSubSequence(a,b));
    }

    private static String normalSubSequence(final String a,final String b) {
        final String min = a.length() < b.length() ? a : b;
        final String max = a.length() < b.length() ? b : a;
        int length = min.length();
        //长度为i的连续子串
        for (int i = length; i > 0; i--) {
            //从0开始计算
            for(int j = 0; j + i < length; j++) {
                final String temp = min.substring(j,j + i);
                if(max.contains(temp))
                    return temp;
            }
        }
        return "";
    }
}
