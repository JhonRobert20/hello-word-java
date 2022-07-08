package com.company;

public class Car {
    int numberOfDoors;

    Car(int numberOfDoors){
        this.numberOfDoors = numberOfDoors;
    }

    public void addDoor(){
        this.numberOfDoors += 1;
    }
}
