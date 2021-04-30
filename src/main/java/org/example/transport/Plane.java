package org.example.transport;

public class Plane extends Transport{

    private  int dlinna;

    public Plane(String model, int weightLimit, int speed, int costPerKilometr, int dlinna) {
        super(model, weightLimit, speed, costPerKilometr);
        this.dlinna = dlinna;
    }

    @Override
    public void getSchet(int needRange, int needWeight) {
        double cost = 0;

        cost = needRange * getCostPerKilometr();
        System.out.println(getModel() + " перевезёт "+needWeight+" на расстояние "+needRange+" за "+cost+"$");
    }

}
