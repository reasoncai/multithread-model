package com.cai.tm.producerconsumer;

import java.util.Random;

/**
 * 客人类吃蛋糕（消费者）
 * Created by reason on 18/4/17.
 */
public class EaterThread extends Thread{
    private final Random random;
    private final Table table;

    public EaterThread(String name,Table table,long seed){
        super(name);
        this.table = table;
        this.random = new Random(seed);
    }

    @Override
    public void run() {
        try {
            while(true){
                String cake = table.take();
                Thread.sleep(random.nextInt(1000));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
