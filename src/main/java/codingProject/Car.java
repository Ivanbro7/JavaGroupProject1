package codingProject;
/*
Create a Class Car that would have the following fields: carPrice and color
and method calculateSalePrice() which should be returning a price of the
car.
Create 2 sub classes: Sedan and Truck. The Truck class has a field as weight
and has its own implementation of calculateSalePrice() method in which
returned price is calculated as following: if weight>2000 then returned price
car should include 10% discount, otherwise 20% discount.
The Sedan class has field as length and also does it is own implementation
of calculateSalePrice(): if length of sedan is >20 feet then returned car price
should include 5% discount, otherwise 10% discount
 */

public class Car {

    private double carPrice;
    private String color;
    public double calculateSalesPrice(){
        return carPrice;
    }
    public double getCarPrice(){
        return carPrice;
    }


    public Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }
}

class Sedan extends Car{
    private double length;
    public Sedan (double carPrice, String color, double length){
        super(carPrice, color);
        this.length = length;
    }

    public double calculateSalesPrice(){
        if(length > 20){
            return getCarPrice() * 0.95;
        } else {
            return getCarPrice() * 0.9;
        }
    }

}

class Truck extends Car{
    private double weight;
    public Truck(double carPrice, String color, double weight) {
        super(carPrice, color);
        this.weight = weight;
    }
    public double calculateSalesPrice(){
        if(weight > 2000){
            return getCarPrice() * 0.9;
        } else {
            return getCarPrice() * 0.8;
        }
    }
}

class CarTester{
    public static void main(String[] args) {

        Truck t = new Truck(12000,"Black",2500);
        System.out.println("The sales price of the Truck with discount is: " + t.calculateSalesPrice());

        Sedan s = new Sedan(10000, "Blue", 15);
        System.out.println("The sales price of the Sedan with discount is: " + s.calculateSalesPrice());
    }
}
