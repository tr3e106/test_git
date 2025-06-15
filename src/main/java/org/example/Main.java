package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
//        int index = 3;
//        do {
//            system.out.println("Gia tri i: " + index);
//            index ++;
//        } while (index <= 3);

//        for (int i = 1; i <= 5 ; i++ )
//        {
//            system.out.println("Gia tri i: ");
//        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = 0;
        int N = scanner.nextInt(n);
        //bt 1:

        int j = 0;
        for (int i = 0; i <= n; i++)
        {
            j= n + i;
        }
        System.out.println("Tong tu 1 den N la: " +j);

//        //bt2:
//        int n=0;
//        int j = 0;
//        int read = System.in.read(n);
//        for (int i = 0; i <= n ; i= i+2)
//        {
//            j = j + i;
//        }
//        System.out.println("Tong so chan tu 0 den N la: "+ j);
    }
}