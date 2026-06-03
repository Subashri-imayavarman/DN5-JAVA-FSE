class Car {

    String make;
    String model;
    int year;

    void displayDetails() {
        System.out.println("Make : " + make);
        System.out.println("Model : " + model);
        System.out.println("Year : " + year);
    }
}

public class CarDemo {

    public static void main(String[] args) {

        Car car1 = new Car();

        car1.make = "Hyundai";
        car1.model = "i20";
        car1.year = 2023;

        car1.displayDetails();
    }
}

/*
Sample Output:
Make : Hyundai
Model : i20
Year : 2023
*/