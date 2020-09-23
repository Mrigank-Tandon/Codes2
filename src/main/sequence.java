package com.company;

import java.util.Scanner;

public class sequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int max=Integer.MAX_VALUE;
        int c=0;
        int k=0;
        int t=sc.nextInt();
        while(t-- >0){
            int i=sc.nextInt();
            if(i<max && c!=1){
                max=i ;
            }
            else if(i>max ){
                max=i;
               c=1;

            }
            else if(i<max && c==1){
                k=1;
                break;
            }
            else if(i==0){
                System.out.print("false");
                System.exit(0);
            }
            else if(i==max){
                System.out.println("false");
                System.exit(0);
            }





        }
        if(k==1){
            System.out.println("false");
        }
        else{
            System.out.println("true");
        }



        }
}


