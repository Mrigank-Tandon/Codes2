package com.company;

import java.util.Scanner;

public class camelcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       String s = sc.next();
       char ch[]=s.toCharArray();
       int i=1;
        System.out.print(ch[0]);
        while(ch[i]!='\0'){
            if(ch[i]>='A'&&ch[i]<='Z')
                System.out.println();
            System.out.print(ch[i]);
            i++;

            }
        }

        }



