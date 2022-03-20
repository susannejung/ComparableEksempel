package FilEksempler;

import java.util.Comparator;

public class TestComparable {

    public static void main(String[] args) {
        GeometricObject g1 = new Rectangle(10, 5);
        GeometricObject g2 = new Circle(5);
        GeometricObject g3 = new Rectangle(5, 5);

        if(g1.compareTo(g2)>0)
            System.out.println("The area of the larger object is " + g1.getArea());
        else if(g1.compareTo(g2)<0)
            System.out.println("The area of the larger object is " + g2.getArea());
        else
            System.out.println("Same area  " + g1.getArea());
    }
}
