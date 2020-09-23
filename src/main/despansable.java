package com.company;

import java.util.Scanner;
import java.util.Stack;

public class despansable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();


        while(t-- >0){
            String st=sc.nextLine();
            char arr[]=st.toCharArray();
            Stack <Character> s = new Stack<>();
            for(char i:arr){
                if(i=='(')
                {
                    s.push('(');
                }
                if(i==')'){
                    s.pop();
                }
            }
            if(s.isEmpty()){
                System.out.println("Not Duplicates");
            }else {
                System.out.println("Duplicate");
            }

        }

    }
}
