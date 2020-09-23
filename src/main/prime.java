package com.company;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

            int v=sc.nextInt();
           int flag=0;
            for(int i = 2; i <= v/2; ++i)
            {

                if(v % i == 0)
                {
                  flag=1;
                   break;
                }

            }
            if(flag==1){
                System.out.println("Not Prime");
            }
            else{
                System.out.println("Prime");
            }

        }
}
