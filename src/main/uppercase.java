package com.company;

import java.util.Scanner;

public class uppercase {
    public static void main(String[] args) {


    Scanner sc=new Scanner(System.in);
    char c = sc.next().charAt(0);
    int v=(int)c;
		if((v>=65)&& (v<=90))
        {
        System.out.print("UPPERCASE");
      }
		else
		    if((v>96)&& (v<123))
		{
        System.out.print("lowercase");
       }
		else{
        System.out.print("Invalid");
    }

}}
