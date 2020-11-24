package com.xw.j2se.exception;

public class ErrorTest {

    public static void main(String[] args) {

        ErrorLearn error = new ErrorLearn();

        Thread c = new Thread(()->{
            while (true) {
                System.out.println("running");
            }
        });
    }

}
