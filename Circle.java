public class Circle {
    private double radius;
    private String color;
    private static final double PI = 3.14; // Added static final variable PI

    // Default constructor
    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    // Parameterized constructor
    public Circle(double r) {
        this.radius = r;
    }

    public Circle(String color) {
        this.color = color;
    }

    public Circle(double r, String c) {
        this.radius = r;
        this.color = c;
    }

    // Method to display circle's properties
    public void display() {
        System.out.println(this.color + " " + this.radius);
    }

    // Getter for radius
    public double getRadius() {
        return this.radius;
    }

    // Method to calculate area
    public double getArea() {
        return PI * this.radius * this.radius;
    }

    // toString method
    public String toString() {
        return ("Color = " + this.color + " " + "radius =  " + this.radius);
    }
}
