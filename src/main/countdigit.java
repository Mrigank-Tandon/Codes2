package com.company;


import java.util.Scanner;

public class countdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=sc.nextInt();
        int k=sc.nextInt();
        int a;
        int c=0;
        while(i>0){
            a=i%10;
            if(a==k){
                c++;
            }
            i=i/10;
        }
        System.out.println(c);


}}
