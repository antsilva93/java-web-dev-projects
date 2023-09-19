package org.launchcode;

public class DVD extends BaseDisc {
    // TODO: Implement your custom interface.
    String studio;
    public DVD(String name, Double storageCapacity, String discType, int spinSpeed, String studio) {
        super(name, storageCapacity, discType, spinSpeed);
        this.studio = studio;
    }

    public String getStudio() {
        return studio;
    }

    @Override
    public void spinDisc() {
        System.out.println("DVD spinning at " + getSpinSpeed());
    }

    @Override
    public String readDisc() {
        return "dvd read";
    }
    @Override
    public void writeDisc() {
        System.out.println("dvd written");
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
