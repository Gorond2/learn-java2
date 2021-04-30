package org.example.transport;

public abstract class Transport {
    private String model;
    private int weightLimit;
    private int speed;
    private int costPerKilometr;




    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeightLimit() {
        return weightLimit;
    }

    public void setWeightLimit(int weightLimit) {
        this.weightLimit = weightLimit;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getCostPerKilometr() {
        return costPerKilometr;
    }

    public void setCostPerKilometr(int costPerKilometr) {
        this.costPerKilometr = costPerKilometr;
    }
    //----------------------------------------------

    public Transport(String model, int weightLimit, int speed, int costPerKilometr) {
        this.model = model;
        this.weightLimit = weightLimit;
        this.speed = speed;
        this.costPerKilometr = costPerKilometr;
    }

    //-----------------------------------------------
    abstract void getSchet(int needRange, int needWeight);
}
