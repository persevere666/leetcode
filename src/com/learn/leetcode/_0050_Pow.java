package com.learn.leetcode;

public class _0050_Pow {

    //
    public static void main(String[] args) {
        int n = Integer.MIN_VALUE;
        int m = -n;
        String b1 = Integer.toBinaryString(n);
        String b2 = Integer.toBinaryString(m);
        String b3 = Integer.toBinaryString(0);
        String b4 = Integer.toBinaryString(-0);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        int n3 = 5;
        int m3 = -n3;
        //Integer.parseInt(b4, m3)
        System.out.println("n3="+Integer.toBinaryString(n3));
        System.out.println("m3="+Integer.toBinaryString(m3));
    }
}
