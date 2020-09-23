package com.company;

import java.util.*;

public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        String sr=String.valueOf(i);
        StringBuffer br=new StringBuffer(sr);

        System.out.println(br.reverse());

    }
}
