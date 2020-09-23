package com.company;

import java.util.*;

public class sort {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        ArrayList<Integer> arrayList=new ArrayList<>();
        for (int j = 0; j < i; j++) {
            arrayList.add(sc.nextInt());

        }
        Collections.sort(arrayList);
        arrayList.forEach(integer -> System.out.print(integer));


        }
}
