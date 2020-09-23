package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class playingwithbits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int i=sc.nextInt();
            int b = sc.nextInt();
            int l=0;
            for (int j = i; j <=b ; j++) {
               String r=String.valueOf(j);
                BigInteger n = new BigInteger(r);
                l=l+(n.bitCount());
            }
            System.out.println(l);

        }

    }
}
