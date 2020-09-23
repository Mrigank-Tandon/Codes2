package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class evenafterodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=sc.nextInt();
        ArrayList<Integer>even=new ArrayList<>();
        ArrayList<Integer> odd=new ArrayList<>();
        ArrayList<Integer>result=new ArrayList<>();
        for (int j = 0; j < i; j++) {
            int k=sc.nextInt();
            if(k%2==0){
                even.add(k);
            }
            else{
                odd.add(k);
            }

        }odd.addAll(even);

       odd.forEach(integer -> System.out.print(integer+" "));

        }
}
