package com.kuang.bean;

/**
 * @author Intian
 * @create 2021-07-05 10:01
 */
public class person {
    private String str;
    public String getStr() {
        return str;
    }
    public void setStr(String str) {
        this.str = str;
    }
    @Override
    public String toString() {
        return "person{str='" + str + '}';
    }
}
