package com.company;


import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        if(s.equals(new StringBuilder(s).reverse().toString())){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }



        }
    }

