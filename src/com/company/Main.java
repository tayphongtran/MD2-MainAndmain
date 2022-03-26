// File Main.java
package com.company;

public class Main {

    public static void main(String[] args) {
        // Test default constructor
        Circle circle1 = new Circle();
        main(circle1);

        // Test constructor has 1 parameter radius
        Circle circle2 = new Circle(2.0);
        main(circle2);

        // Test constructor has 2 parameter radius, color
        Circle circle3 = new Circle(2.0, "blue");
        main(circle3);

        // Test getter setter
        Circle circle4 = new Circle();
        circle4.setColor("Green");
        circle4.setRadius(3.0);
        main(circle4);
    }

     static void main(Circle circle) {
        System.out.println(circle.toString());
        System.out.println("Area: " + circle.getArea());
        System.out.println("oh");
    }
}