package com.cai.tm.guardedsuspension;

/**
 * guarded suspension模式
 * 通过让线程等待来保证实例的安全性
 * Created by reason on 18/2/25.
 */
public class Main {
    public static void main(String[] args) {
        RequestQueue requestQueue = new RequestQueue();
        new ClientThread(requestQueue,"client",1234567L).start();
        new ServerThread(requestQueue,"server",7654321L).start();
    }
}
