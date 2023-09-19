package org.launchcode;

import java.sql.SQLOutput;

public class CD extends BaseDisc {
    // TODO: Implement your custom interface.
    int tracks;

    public CD(String name, Double storageCapacity, String discType, int spinSpeed, int tracks) {
        super(name, storageCapacity,discType, spinSpeed);
        this.tracks = tracks;
    }

    public int getTracks(){
        return tracks;
    }
    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones

    @Override
    public void spinDisc() {
        System.out.println("CD spinning at " + getSpinSpeed());
    }

    @Override
    public String readDisc() {
        return "CD read";
    }
    @Override
    public void writeDisc() {
        System.out.println("CD written");
    }
    @Override
    public void reportData() {
        System.out.println("name= " + getName());
        System.out.println("storageCapacity= " + getStorageCapacity());
        System.out.println("disc type= " + getDiscType());
        System.out.println("spin speed= " + getSpinSpeed());
        //System.out.println("number of tracks= " + getTracks());
    }

}
