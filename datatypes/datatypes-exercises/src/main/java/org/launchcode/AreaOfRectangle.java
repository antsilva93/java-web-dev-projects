package org.launchcode;

import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the rectangle's length:");
        int rectLength = input.nextInt();

        System.out.println("What is the rectangle's width:");
        int rectWidth = input.nextInt();

        int rectArea = rectLength * rectWidth;
        System.out.println("The area of the rectangle is " + rectArea + " units squared.");
    }
}
