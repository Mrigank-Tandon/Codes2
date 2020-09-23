package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class cumalativesum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        ArrayList<Integer>arrayList=new ArrayList<>();
        while (sc.hasNextInt()) {
            int i = sc.nextInt();
            sum=sum+i;
            if(sum<0){
                break;
            }
            else {

                arrayList.add(i);
            }
        }
       arrayList.forEach((n) -> System.out.println(n));

        }


        }




       
        

