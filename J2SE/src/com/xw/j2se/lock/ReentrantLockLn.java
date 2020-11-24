package com.xw.j2se.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockLn {

    static ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) {
        // 获取锁，导致阻塞
        lock.lock();
        // 获取锁，不会导致阻塞
        lock.tryLock();
        // 释放当前线程持有锁
        lock.unlock();

        Condition condition = lock.newCondition();
    }




}
