package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
        //'member' has private access in 'com.driver.RWOnly'
//        obj.member = 1;
//        System.out.print(obj.member);

        obj.setMember(1);
        int ans = obj.getMember();
        System.out.print(ans);

    }
}