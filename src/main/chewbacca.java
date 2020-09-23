package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class chewbacca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();

        ArrayList<Integer>arrayList=new ArrayList<>();
        char []c=s.toCharArray();
        for (char i:c
             ) {

            int r=Math.abs(9-Integer.parseInt(String.valueOf(i)));
            if(r>Integer.parseInt(String.valueOf(i))){
                arrayList.add(Integer.valueOf(String.valueOf(i)));
            }
            else if(r<Integer.parseInt(String.valueOf(i))){
                arrayList.add(Integer.valueOf(String.valueOf(r)));
            }

        }
         if(arrayList.get(0)==0) {
             arrayList.set(0,9);
         }
         arrayList.forEach(integer -> System.out.print(integer));

}}

