package com.bridgelabz.linecomparison;
import java.util.Scanner;
public class LineComparison {
    public int x1, x2, y1, y2;
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1 and y1");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        System.out.println("The Values of (x1,y1) :" +x1+","+y1);
    }
    public double formula(){
        double linelength = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        return linelength;
    }
    public static void condition(double linelength1, double linelength2) {
        if (linelength1 > linelength2){
            System.out.println("Line 1 is greater than Line 2");
        } else if (linelength1 < linelength2) {
            System.out.println("Line 1 is lesser than Line 2");
        } else {
            System.out.println("Both the lines are Equal");
        }
    }
    public static void main(String[] args) {
        LineComparison line1 = new LineComparison();
        line1.input();
        double linelength1 = line1.formula();
        System.out.println("Length of the line 1 =" + linelength1);
        LineComparison line2 = new LineComparison();
        line2.input();
        double linelength2 = line2.formula();
        System.out.println("Length of the line 2 =" + linelength2);
        System.out.println("------------------------------------");
        System.out.println("Length of the line 1 =" + linelength1);
        System.out.println("Length of the line 2 =" + linelength2);
        condition(linelength1, linelength2);
    }
}
