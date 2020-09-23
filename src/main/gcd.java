package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a1=String.valueOf(sc.nextInt());
        String a2=String.valueOf(sc.nextInt());
        BigInteger a=new BigInteger(a1);
        BigInteger b=new BigInteger(a2);
        System.out.println(a.gcd(b));

    }
}
