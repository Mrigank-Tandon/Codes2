package com.company;

import java.util.Scanner;

public class armstrongno {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int l=n;
        int c=0;
        int k=0;
        int temp=n;
        int a;
        while(l>0){
            l=l/10;
            k++;
        }
        while(n>0)
        {
            a=n%10;
            n=n/10;
            c=c+(int)Math.pow(a,k);
        }
        if(temp==c){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
