package com.cai.tm.single;

/**
 * 不断通过门的人
 * Created by reason on 18/2/24.
 */
public class UserThread extends Thread{
    private final Gate gate;
    private final  String myName;
    private final String myAddress;
    public UserThread(Gate gate,String myName,String myAddress){
        this.gate = gate;
        this.myName = myName;
        this.myAddress = myAddress;
    }
    @Override
    public void run(){
        System.out.println(this.myName +" BEGIN");
        while (true){
            gate.pass(myName,myAddress);
        }
    }
}
