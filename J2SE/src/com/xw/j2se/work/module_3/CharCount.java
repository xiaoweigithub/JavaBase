package com.xw.j2se.work.module_3;

import java.text.MessageFormat;

public class CharCount {

    private static final String a = "ABCD123!@#$%ab";

    public static void main(String[] args) {
        int lowCases = 0;
        int upperCases = 0;
        int numberCases = 0;
        int specialCases = 0;
        for(byte c : a.getBytes()) {
            if('a' <= c && 'z' >= c)
                lowCases++;
            else if('A' <= c && 'Z' >= c)
                upperCases++;
            else if('0' <= c && '9' >= c)
                numberCases++;
            else
                specialCases++;
        }
        System.out.println(MessageFormat.format("小写字母个数：{0}，大写字母个数：{1}，数字个数：{2}，其他字符个数：{3}",
                lowCases,upperCases,numberCases,specialCases));
    }




}
