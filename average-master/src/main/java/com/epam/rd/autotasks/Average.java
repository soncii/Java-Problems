package com.epam.rd.autotasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Use Scanner methods to read input
        int i=0;
        int sum=0;
        int temp=0;
        while (true) {
            temp=scanner.nextInt();
            if (temp==0) {
                break;
            }
            sum+=temp;
            i++;
        }
        if (i==0) {
            System.out.println(0);
        } else
        System.out.println(sum/i);
    }

}