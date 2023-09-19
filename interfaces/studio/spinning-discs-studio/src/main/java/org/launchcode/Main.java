package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.
        BaseDisc testCD = new CD("CD 1", 256.00, "album", 22999, 10);
        //POLYMORPHISM
        DVD testDVD = new DVD("movie", 1024.48, "comedy", 1234, "MGM Studios");

        // TODO: Call each CD and DVD method to verify that they work as expected.
        testCD.spinDisc();
        testCD.writeDisc();
        testCD.readDisc();
        testCD.reportData();

        testDVD.spinDisc();
        testDVD.writeDisc();
        testDVD.readDisc();
        testDVD.reportData();

        System.out.println(testCD.getCurrentId());
        System.out.println(testDVD.getCurrentId());
    }
}