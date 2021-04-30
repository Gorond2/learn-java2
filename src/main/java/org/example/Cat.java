package org.example;

public class Cat {
    String name;
    String breed;
    int weight = 5;
    boolean isAngry = true;

    Cat(String newName, String newBread){
        this(newName, newBread, 4, false);
    }


    Cat(String newName, String newBread, int newWeight, boolean newIsAngry){
        name = newName;
        breed = newBread;
        weight = newWeight;
        isAngry = newIsAngry;
    }

    public void sayMeow(int count){
        for(int i = 1; i<= count; i++){
            System.out.println(name +" "+breed+": Мяу!");
        }
    }

}
