package com.company;

public class Main {

    static int sumThreeNumbers(int number1, int number2, int number3)
    {
        return (number1 + number2 + number3);
    }

    public static void main(String[] args) {
        sumThreeNumbers(2, 1, 3);
        System.out.println(sumThreeNumbers(1, 2 ,3)); // Should be 6
        Car car = new Car(2);
        car.addDoor();
        System.out.println(car.numberOfDoors);
    }

}
