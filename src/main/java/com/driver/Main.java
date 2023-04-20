package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();

        obj.setMember(1);
        int ans = obj.getMember();


    }
}