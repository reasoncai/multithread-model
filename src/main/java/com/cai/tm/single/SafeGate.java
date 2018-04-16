package com.cai.tm.single;

/**
 * 线程安全的门类
 * Created by reason on 18/2/24.
 */
public class SafeGate {
        private int count = 0;
        private String name = "Nobody";
        private String address = "Nowhere";

        public synchronized void pass(String name, String address) {
            this.count++;
            this.name = name;
            this.address = address;
            check();
        }

        @Override
        public synchronized String toString() {
            return "No." + count + ": " + name + ", " + address;
        }

        private void check() {
            if(name.charAt(0) != address.charAt(0)){
                System.out.println("****BROKEN****"+toString());
            }
        }
    }

