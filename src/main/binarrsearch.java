package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class binarrsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=sc.nextInt();

        int arr[]=new int[i];
        for (int j = 0; j < i; j++) {
            arr[j]=sc.nextInt();

        }
        int m=sc.nextInt();
        System.out.println(Arrays.binarySearch(arr,m));



}}
