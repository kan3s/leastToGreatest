package com.company;
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {


   public static ArrayList<Integer> lowToGreat(ArrayList<Integer>array)
    {
        int first = 0;
        int second = 1;
        int x;
        int y;
       for (int c = 0; c < array.size()-1; c++)
       {
           x = array.get(first);
           y = array.get(second);

           if (x > y)
           {
               array.set(first,y);
               array.set(second,x);
               first++;
               second++;
           }
           else
               {
               first++;
               second++;
           }
       }
return array;
   }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your values; enter STOP to conclude");
        ArrayList<Integer> array = new ArrayList<Integer>();
        String stop = scan.nextLine();
        int n;

        while (!(stop.equals("STOP"))){
            n = in.nextInt();
            array.add(n);
            stop = scan.nextLine();
        }
            System.out.println(array);
            System.out.println(lowToGreat(array));

    }
}
