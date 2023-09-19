package org.launchcode;

//shared behaviors:
//both spin
//both store data
//both read data
//both can write data(?)
//base report of shared fields
//inserted into a drive

//Interface Behaviors
// - both spin; spinDisc()
// - both read by laser; readDisc()
// - both written by laser; writeDisc()
// - both store data; storeData()
// - both report data; reportData()
// - both need to be stopped; stopDisc()

//Abstract Class Behaviors
// - fields; storage space, spin rate, rate of data transfer
//       physical fields; channel bits length, thickness, space between spiral's loops


public interface OpticalDisc {
    //declare and initialize constant fields
    int maxRPM = 23000;

    //add method signature for each behavior
    void spinDisc();
    String readDisc();
    void writeDisc();
    void reportData(); //prints

    //String reportData() //return string

}
