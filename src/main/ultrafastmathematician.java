package com.company;



import java.util.Scanner;


public class ultrafastmathematician {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            String k=sc.next();
            String u=sc.next();
            char[]a=k.toCharArray();
            char[]b=u.toCharArray();
            for (int i = 0; i <b.length ; i++) {


                if ((a[i] == '0' && b[i] == '0') || (a[i] == '1' && b[i] == '1'))
                    System.out.print(0);
                else
                    System.out.print(1);


            }
            System.out.println();

        }

    }
}
