package com.cai.tm.workthread;

/**
 * Created by reason on 18/4/17.
 */
public class Request implements Runnable {
    private final String name; //委托者
    private final int number; //请求者编号

    public Request(String name,int number){
        this.name = name;
        this.number = number;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" executes "+this);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Request from" +name +" No."+number;
    }
}
