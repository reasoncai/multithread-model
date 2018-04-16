package com.cai.tm.workthread;

import java.util.Random;
import java.util.concurrent.ExecutorService;

/**
 * Created by reason on 18/4/17.
 */
public class ClientThread extends Thread {
    private final ExecutorService executorService;
    private static final Random random = new Random();

    public ClientThread(String name,ExecutorService executorService){
        super(name);
        this.executorService = executorService;
    }
    @Override
    public void run() {
        try {
            for (int i=0;true;i++){
                Request request = new Request(getName(), i);
                executorService.execute(request);
                Thread.sleep(random.nextInt(1000));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
