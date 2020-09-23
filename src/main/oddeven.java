package com.company;

import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        while(t-->0){
            int sum=0;
            int sum1=0;
            int arr[]=new int[100];
            for (int i = 0; i < 100; i++) {
                arr[i]=sc.nextInt();
            }
            for(int i:arr){
                if(arr[i]%2==0){
                    sum=sum+1;
                }else{
                    sum1=sum1+1;
                }
            }
            if(sum%4==0&& sum1%3==0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }

        }
}}
