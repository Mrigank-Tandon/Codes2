package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        BigInteger i =new BigInteger(a);
        BigInteger j=new BigInteger(b);
        BigInteger mul=i.multiply(j);
        BigInteger gcd=i.gcd(j);
        BigInteger lcm=mul.divide(gcd);
        System.out.println(lcm);
    }
}
