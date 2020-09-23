package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class setbits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
             while(sc.hasNextLine()) {


                 String s = sc.next();
                 BigInteger b = new BigInteger(s);
                 System.out.println(b.bitCount());

             }
        }
    }
}
