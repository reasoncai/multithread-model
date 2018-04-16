package com.cai.tm.single;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Single Threaded Execution模式
 * 确保同一时间内只能让一个线程执行处理
 * Created by reason on 18/2/24.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Testing Gate");
        Gate gate = new Gate();
        new UserThread(gate,"Alice","Alaska").start();
        new UserThread(gate,"Bobby","Brazil").start();
        new UserThread(gate,"Chris","Canada").start();


    }
}
