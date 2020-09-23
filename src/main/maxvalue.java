package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class maxvalue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        List<Integer>list=new ArrayList<>();
        for (int j = 0; j < i; j++) {
            list.add(sc.nextInt());
        }
        System.out.println(Collections.max(list));
        }

    }

