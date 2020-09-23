package com.company;

import java.util.HashMap;

import java.util.Scanner;



class stringcompression
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String s= sc.next();
        char arr[]=s.toCharArray();
        HashMap<Character, Integer> count=new HashMap<Character, Integer>();
        for(char i: arr)
        {
            if(count.containsKey(i)){
                count.put(i,count.get(i)+1);
            }
            else{
                count.put(i,1);
            }


        }
        count.entrySet().forEach(characterIntegerEntry -> {
            System.out.print(characterIntegerEntry.getKey()+""+characterIntegerEntry.getValue());
        });
        }





        }




