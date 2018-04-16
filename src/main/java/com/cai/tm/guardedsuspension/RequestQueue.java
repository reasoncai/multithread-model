package com.cai.tm.guardedsuspension;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 请求队列
 * Created by reason on 18/2/25.
 */
public class RequestQueue {
    private final Queue<Request> queue = new LinkedList<Request>();
    public synchronized Request getRequest(){
        while (queue.peek() == null){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return queue.remove();
    }

    public synchronized void putRequest(Request request){
        queue.offer(request);
        notifyAll();
    }

}
