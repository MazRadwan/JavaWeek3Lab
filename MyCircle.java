public class MyCircle {
    private MyPoint center;
    private int radius;

    // Constructor
    public MyCircle(int x, int y, int radius) 
    {
        this.center = new MyPoint(x,y);
        this.radius = radius;
    }
    // constructor that takes a MyPoint instance and radius
    public MyCircle(MyPoint center, int radius) 
    {
        this.center = center;
        this.radius = radius;     
    }
    //default constructor
    public MyCircle()
    {
        this.center = new MyPoint(0,0);
        this.radius = 1;
    }
    //getter for radius
    public int getRadius()
    {
        return this.radius;
    }
    //setter for radius
    public void setRadius(int radius)
    {
        this.radius = radius;
    }
    // getter for center
    public MyPoint getCenter()
    {
        return center;
    }
    // setter for using MyPoint instance
    public void setCenter(MyPoint center)
    {
        this.center = center;
    }
    // getter for center x coordinate
    public int getCenterX()
    {
        return this.center.getX();
    }
    //setter for the center x coordinate
    public void setCenterX(int x)
    {
        this.center.setX(x);
    }
    //getter for the center y coordinate
    public int getCenterY()
    {
        return this.center.getY();
    }
    // setter for the center y coordinate
    public void setCenterY(int y) 
    {
        center.setY(y);
    }
    // method to set x,y coordinates of the center
    public void setCenterXY(int x, int y)
    {
        center.setXY(x, y);
    }
    // toString
    public String toString()
    {
        return "MyCircle[radius=" + radius + ",center=" + center.toString() + "]";
    }

    // calculate area
    public double getArea()
    {
        return Math.PI * radius * radius;
    }
    // calculate circumference
    public double getCircumference()
    {
        return 2 * Math.PI * radius;
    }
    //calculate distance between two MyCircle instances
    public double distance(MyCircle c)
    {
        return center.distance(c.getCenter());
    }

    
}
