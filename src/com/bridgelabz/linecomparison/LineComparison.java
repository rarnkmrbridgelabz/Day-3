package com.bridgelabz.linecomparison;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1 and y1");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("The Values of (x1,y1) :" +x1+","+y1);
        System.out.println("Enter x2 and y2");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        System.out.println("The Values of (x2,y2) :" +x2+","+y2);
        double length = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        System.out.println("Length of Line :" +length);

    }
}
