package com.xw.j2se.thread;

public class InterruptThreadLn {

    public static class ThreadLn extends Thread {
        @Override
        public void run() {
            while(!isInterrupted()) {
//                try {
//                    System.out.println("running...");
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                    break;
//                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Thread t = new ThreadLn();
        t.start();
        Thread.sleep(2000);
        t.interrupt();
    }
}
