package com.company;

import java.util.Scanner;

public class prinseries {
    public static void pattern(int a, int b){
        int c=0;
        int i=1;
        while(a>c) {
            int r=(3*i++)+2;
            if(!(r%b==0)){
                System.out.println(r);
                c++;
            }

        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        pattern(a,b);

}}
