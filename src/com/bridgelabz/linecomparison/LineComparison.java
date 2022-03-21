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

        double linelength1 = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        System.out.println("Length of Line :" +linelength1);

        System.out.println("Enter x3 and y3");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        System.out.println("The Values of (x3,y3) :" +x3+","+y3);
        System.out.println("Enter x4 and y4");
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();
        System.out.println("The Values of (x4,y4) :" +x4+","+y4);

        double linelength2 = Math.sqrt(Math.pow(x4-x3, 2) + Math.pow(y4-y3, 2));
        System.out.println("Length of Line :" +linelength2);

        System.out.println("The Lengths of the line are : ");
        System.out.println("Line 1 :" +linelength1);
        System.out.println("Line 2 :" +linelength2);

        if (linelength1 > linelength2){
            System.out.println("Line 1 is greater than Line 2");
        } else if (linelength1 < linelength2) {
            System.out.println("Line 1 is lesser than Line 2");
        } else {
            System.out.println("Both the lines are Equal");
        }

    }
}
