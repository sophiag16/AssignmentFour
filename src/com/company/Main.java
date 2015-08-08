package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter no. of asterisks");

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int count=0;

        while(num-->0)
        {
            count++;
            int c=count;
            System.out.println("");
            while(c-->0)
            {

                System.out.print("*");
            }
        }
    }
}
