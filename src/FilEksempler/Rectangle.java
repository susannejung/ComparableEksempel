package FilEksempler;

public class Rectangle extends GeometricObject implements Comparable<GeometricObject> {
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /** Return width */
    public double getWidth() {
        return width;
    }

    /** Set a new width */
    public void setWidth(double width) {
        this.width = width;
    }

    /** Return height */
    public double getHeight() {
        return height;
    }

    /** Set a new height */
    public void setHeight(double height) {
        this.height = height;
    }

    @Override /** Return area */
    public double getArea() {
        return width * height;
    }

    @Override /** Return perimeter */
    public double getPerimeter() {
        return 2 * (width + height);
    }


    @Override
    public int compareTo(GeometricObject o) {
        System.out.print("Hejsa  ");
        System.out.println(this.getArea()+ "  " +o.getArea());
        if(this.getArea()==o.getArea())
            return 0;
        else if(this.getArea()>o.getArea())
            return 1;
        else
            return -1;
    }
}

