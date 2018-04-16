package com.cai.tm.producerconsumer;

import java.util.Random;

/**
 * 蛋糕师（生产者）
 * Created by reason on 18/4/17.
 */
public class MakerThread extends Thread {
    private final Random random;
    private final Table table;
    private static int id = 0; //蛋糕的流水号（所有蛋糕师共用）

    public MakerThread(String name, Table table, long seed) {
        super(name);
        this.table = table;
        this.random = new Random(seed);
    }

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(random.nextInt(1000));
                String cake = "[Cake No." + nextId() + " by " + getName() + " ]";
                table.put(cake);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static synchronized int nextId() {
        return id++;
    }
}
