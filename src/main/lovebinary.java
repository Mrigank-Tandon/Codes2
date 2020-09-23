package com.company;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class lovebinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<BigInteger>arrayList=new ArrayList<>();
        int t=sc.nextInt();
        while(t-- >0){
            String i=String.valueOf(sc.nextInt());
            BigInteger bigInteger=new BigInteger(i,2);
            arrayList.add(bigInteger);

        }
        arrayList.forEach(n -> System.out.println(n));
    }
}
