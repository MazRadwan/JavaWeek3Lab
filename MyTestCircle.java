public class MyTestCircle {
    public static void main(String[] args) {
        
        // test contructors and toString()
        MyCircle c1 = new MyCircle();
        System.out.println(c1);

        MyCircle c2 = new MyCircle(3,4,5);
        System.out.println(c2);

        MyPoint centerPoint = new MyPoint(6, 8);
        MyCircle c3 = new MyCircle(centerPoint, 10);
        System.out.println(c3);



        // test setters and getters
        c1.setRadius(7);
        System.out.println("Radius is: " + c1.getRadius());
        c1.setCenterXY(2,3 );
        System.out.println("Center is: " + c1.getCenter());

        // test getArea() and getCircumference()
        System.out.println("Area is: " + c1.getArea());
        System.out.println("Circumference is: " + c1.getCircumference());


        // test distance() method
        MyCircle c4 = new MyCircle(10,12,3);
        System.out.println("Distannce between c1 and c4 is: " + c1.distance(c4));

    }
}