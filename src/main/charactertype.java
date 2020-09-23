package com.company;

import java.util.Scanner;

public class charactertype {
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        char ch =sc.next().charAt(0);
        int a=(int)ch;
        if(a>64&& a<91){
            System.out.println("U");
        }
        else if(a>96&&a<123){
            System.out.println("L");
        }
        else{
            System.out.println("I");
        }
    }
}
