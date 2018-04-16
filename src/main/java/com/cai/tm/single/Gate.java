package com.cai.tm.single;

/**
 * 门类(非线程安全)
 * Created by reason on 18/2/24.
 */
public class Gate {
    private int count = 0;
    private String name = "Nobody";
    private String address = "Nowhere";

    public  void pass(String name, String address) {
        this.count++;
        this.name = name;
        this.address = address;
        check();
    }

    @Override
    public  String toString() {
        return "No." + count + ": " + name + ", " + address;
    }

    private void check() {
        if(name.charAt(0) != address.charAt(0)){
            System.out.println("****BROKEN****"+toString());
        }
    }
}
