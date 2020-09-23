package com.company;
import java.math.BigInteger;
import java.util.Scanner;

public class decimaltooctal {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String s=sc.next();

        BigInteger i=new BigInteger(s);
        System.out.print(i.toString(8));
    }
}
