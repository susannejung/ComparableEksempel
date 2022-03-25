package FilEksempler;

public class Circle extends GeometricObject{
    private double radius;

    public Circle() {
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    /** Return radius */
    public double getRadius() {
        return radius;
    }

    /** Set a new radius */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override /** Return area */
    public double getArea() {
        return radius * radius * Math.PI;
    }


    /** Return diameter */
    public double getDiameter() {
        return 2 * radius;
    }

    @Override /** Return perimeter */
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }



    /* Print the circle info */
    public void printCircle() {
        System.out.println("The circle is created " + getDateCreated() +
                " and the radius is " + radius);
    }


    @Override
    public int compareTo(GeometricObject o) {
        System.out.println("Hej  ");
        if(this.getArea()==o.getArea())
            return 0;
        else if(this.getArea()>o.getArea())
            return 1;
        else
            return -1;
    }
}

