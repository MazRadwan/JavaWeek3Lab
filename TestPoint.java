public class TestPoint {
    public static void main(String[] args) {
        //test constructor and toString()
        MyPoint p1 = new MyPoint(2,4);
        System.out.println(p1);

     
        MyPoint p2 = new MyPoint(3,4);   // overloaded constructor
        System.out.println(p2);

        //test Setters and Getters
        p1.setX(8);
        p1.setY(6);
        System.out.println("x is : " + p1.getX());
        System.out.println("y is : " + p1.getY()); 

        p1.setXY(3, 0);
        System.out.println(p1);

        // test overloaded instance
        System.out.println(p1.distance(5,6));
        System.out.println(p1.distance(p2));
        System.out.println(p1.distance());

    }

  
    
}
