package codingProject;
/*
Create an Interface 'Shape' with undefined methods as calculateArea and
calculatePerimeter. Create 2 classes Circle & Square that implements
functionality defined in the Shape Interface. Test your code.
 */

public interface Shape {

    double calculateArea();

    double calculatePerimeter();
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }


}

class Square implements Shape {
    private double side;

    public Square(double side){
        this.side = side;
    }

    public double calculateArea(){
        return side * side;
    }

    public double calculatePerimeter(){
        return side * 4;
    }

}

class ShapeTester{
    public static void main(String[] args) {

        Circle c = new Circle(5);
        System.out.println("The area of the circle is: " + c.calculateArea());
        System.out.println("The perimeter of the circle is: " + c.calculatePerimeter());

        Square s = new Square(5);
        System.out.println("The area of the square is: " + s.calculateArea());
        System.out.println("The perimeter of the square is: " + s.calculatePerimeter());
    }
}
