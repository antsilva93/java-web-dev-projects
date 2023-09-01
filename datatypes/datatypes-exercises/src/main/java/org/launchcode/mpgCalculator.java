package org.launchcode;

import java.util.Scanner;
public class mpgCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles did you drive:");
        double milesDriven = input.nextDouble();

        System.out.println("How many gallons of gas did you consume:");
        double gasGalUsed = input.nextDouble();

        double mpgCalc = milesDriven/gasGalUsed;
        System.out.println("Your trip averaged " + mpgCalc + " miles per gallon");
    }
}
