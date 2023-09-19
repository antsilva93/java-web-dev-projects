package org.launchcode;

public abstract class BaseDisc implements OpticalDisc {
    //declare fields shared/used by extended classes
    //  storage capacity, spin (maybe), spin speed, name, disc type,
    private String name;
    private Double storageCapacity;
    private String discType;
    private int spinSpeed;
    private static int id = 0;
    private int currentId;


    //SHARED CODE
    //constructors
    public BaseDisc(String name, Double storageCapacity, String discType, int spinSpeed) {
        this.name = name;
        this.storageCapacity = storageCapacity;
        this.discType = discType;
        this.spinSpeed = spinSpeed;
        this.currentId = id++;
        //id = id + 1;
    }
    //getters
    public String getName() {
        return name;
    }
    public double getStorageCapacity() {
        return storageCapacity;
    }
    public String getDiscType() {
        return discType;
    }
    public int getSpinSpeed() {
        return spinSpeed;
    }
    public int getId() {
        return id;
    }
    public int getCurrentId() {
        return currentId;
    }
    //setters
    // see constructor

    //custom methods


}
