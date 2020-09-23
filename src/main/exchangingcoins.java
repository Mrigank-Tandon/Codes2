package com.company;

import java.util.Scanner;

public class exchangingcoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=sc.nextInt();
        int r= (i/2)+(i/3)+(i/4);
        System.out.println(r);
    }
}
