package com.xw.j2se.structrue;

public class StringLearn {

    public static void main(String[] args) {
        /*
            JVM底层优化字符串常量拼接优化
         */
        String a = "ab" + "cd";
        String b = "abcd";
        System.out.println(a == b); // true
        String c = "abcdef";
        String d = b + "ef";
        System.out.println(c == d); // false
        /*
            首次 new String时会在常量池和堆中各申请一块空间，堆中对象为常量池中对象的副本，即拷贝
         */
        String e = new String("abcdef");
        System.out.println(e == c); // false

        /*
            从Java9开始，String使用byte[]存储，并添加编码标识，节省空间
            String api
         */
        String s = "hello world 123";
        int pos = s.indexOf("hello");
        /*
            正则匹配
            ? 0-1次
            + 1-n次
            * 任意次
         */
        System.out.println(s.matches("^[a-zA-Z0-9]+$"));
        System.out.println(s.matches("^\\w?\\s\\w?\\s\\d?$"));

    }


}
