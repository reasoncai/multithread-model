package com.cai.tm.producerconsumer;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created by reason on 18/4/17.
 */
public class SafeTable extends ArrayBlockingQueue<String> {
    public SafeTable(int count) {
        super(count);
    }

    public void put(String cake) throws InterruptedException{
        System.out.println(Thread.currentThread().getName() + " puts " + cake);
        super.put(cake);
    }

    public String take() throws InterruptedException {
        String cake = super.take();
        System.out.println(Thread.currentThread().getName()+" takes "+cake);
        return cake;
    }
}
