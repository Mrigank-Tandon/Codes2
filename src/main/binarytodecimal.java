package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class binarytodecimal {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String s=sc.next();

        BigInteger i=new BigInteger(s,2);
        System.out.print(i);
     }
}

