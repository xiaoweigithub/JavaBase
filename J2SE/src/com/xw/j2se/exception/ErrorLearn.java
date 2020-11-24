package com.xw.j2se.exception;

public class ErrorLearn {

    private static final boolean a;


    {
//        try {
//            throw new Exception("asdasd");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

    /*
        静态块抛出异常或者错误
     */
    static {
        a = true;
        if(a) {
            throw new Error("error");
//            try {
//                throw new Exception("exception");
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
        }

    }
}
