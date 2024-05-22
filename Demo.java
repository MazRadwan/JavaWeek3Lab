public class Demo {
    public static void main(String[] args){
        Circle c1 = new Circle();
        Circle c2 = new Circle(5.0);

         // display the properties of the circle`
    System.out.println(c1);
    c2.display();

    // print the area of the circles
    System.out.println(c1.toString());
    c2.display();
    // print the area of the two circles
    System.out.println("Area of Circle 1: " + c1.getArea());
    System.out.println("Area of Circle 2: " + c2.getArea());

    // attempt to assign PI a new value 
    // Circle.PI = 22.0/7.0 // this wil cause an error

    // creating and displaying additional circles
    Circle c3 = new Circle("yellow");
    c3.display();
    Circle c4 = new Circle(10.0, "pink");
    c4.display();

    System.out.println(c1.getRadius());
    }
   
}
