package com.cai.tm.producerconsumer;

/**
 * 生产者消费者模式
 * Created by reason on 18/4/17.
 */
public class Main {
    public static void main(String[] args) {
        Table table = new Table(3);
        new MakerThread("Maker1",table,1).start();
        new MakerThread("Maker2",table,2).start();
        new MakerThread("Maker3",table,3).start();
        new EaterThread("eater1",table,4).start();
        new EaterThread("eater2",table,5).start();
        new EaterThread("eater3",table,6).start();

    }
}
