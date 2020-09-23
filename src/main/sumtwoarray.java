package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class sumtwoarray {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        ArrayList<Integer> list = new ArrayList<>();
        int carry = 0;
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        while (i >= 0 || j >= 0) {
            int sum = 0;
            if (i >= 0) {
                sum += arr1[i];
            }
            if (j >= 0) {

                    sum += arr2[j];


                sum += carry;
                list.add(i, sum % 10);
                carry = sum / 10;
                i--;
                j--;
            }
            if (carry != 0) {
                list.add(0, carry);
            }
            list.forEach(integer -> System.out.print(integer + ", "));
            System.out.print("END");

        }

    }
}
