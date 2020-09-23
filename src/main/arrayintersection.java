package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class arrayintersection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=sc.nextInt();
        ArrayList<Integer>list=new ArrayList<>();
        for (int j = 0; j < i; j++) {
            list.add(sc.nextInt());

        }
        ArrayList<Integer>list2=new ArrayList<>();
        for (int j = 0; j < i; j++) {
            list2.add(sc.nextInt());

        }
        list2.retainAll(list);
        System.out.println(list2.subList(1,i));
    }
}
