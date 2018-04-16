package com.cai.tm.guardedsuspension;

/**
 * 请求类
 * Created by reason on 18/2/25.
 */
public class Request {
    private final String name;

    public Request(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return "[Request " + name + " ]";
    }
}
