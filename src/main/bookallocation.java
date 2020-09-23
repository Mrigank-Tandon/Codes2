package com.company;

import java.util.Scanner;

public class bookallocation {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int books = sc.nextInt();
            int students = sc.nextInt();
            int[] page = new int[books];
            for (int i = 0; i < page.length; i++) {
                page[i] = sc.nextInt();
            }
            int lo = 0;
            int hi = 0;
            for (int i : page) {
                hi += i;
            }

            int ans = 0;
            while (lo <= hi) {
                int mid = (lo + hi) / 2;
                if (isitpossible(page, mid, students)) {
                    hi = mid - 1;
                    ans = mid;
                } else {
                    lo = mid + 1;
                }
            }
            System.out.println(ans);
        }

    }

    public static boolean isitpossible(int[] page, int mid, int nos) {
        int numberofstudent = 1;
        int pageread = 0;
        int i = 0;
        while (i < page.length) {
            if (pageread + page[i] <= mid) {
                pageread += page[i];
                i++;
            } else {
                pageread = 0;
                numberofstudent++;
                if (numberofstudent > nos) {
                    return false;
                }

            }

        }

        return true;
    }
}
