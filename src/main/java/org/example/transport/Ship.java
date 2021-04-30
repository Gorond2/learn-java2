package org.example.transport;

public class Ship extends Transport{

    private int vodoizmeshenie;

    public Ship(String model, int weightLimit, int speed, int costPerKilometr, int vodoizmeshenie) {
        super(model, weightLimit, speed, costPerKilometr);
        this.vodoizmeshenie = vodoizmeshenie;
    }

    public int getVodoizmeshenie() {
        return vodoizmeshenie;
    }

    public void setVodoizmeshenie(int vodoizmeshenie) {
        this.vodoizmeshenie = vodoizmeshenie;
    }

    @Override
    public void getSchet(int needRange, int needWeight){
        double cost = 0;

        cost = (needRange * getCostPerKilometr()) - ( (needRange * getCostPerKilometr()) * 0.1) ;
        System.out.println("На корабле "+getModel()+" дествует скидка, цена перевозки:" + cost);
    }
}
