package com.company;

import org.omg.CORBA.WStringSeqHelper;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String ip = scan.next();
        int arr[] = new int[26];
        for (int i=0;i<ip.length();i++){
            int series = ip.charAt(i);
            arr[series-97]++;
        }
        for (int i=0;i<26;i++){
            if (arr[i]>0){
                System.out.printf("%c %d\n",i+97,arr[i]);
            }
        }
    }
}
