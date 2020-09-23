package com.company;

import java.util.Scanner;

public class compression2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        int f;
        char[]chars = s.toCharArray();
        for (int i = 0; i<chars.length ; i++) {

            f = 0;
            System.out.print(chars[i]);
            try {
                while (chars[i + 1] == chars[i]) {
                    i++;
                    f++;
                }
            }
            catch (ArrayIndexOutOfBoundsException e){

        }
            System.out.print(f+1);

        }

}
}
