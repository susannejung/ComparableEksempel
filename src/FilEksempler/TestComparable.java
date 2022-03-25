package FilEksempler;

import java.util.*;

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


        ArrayList<GeometricObject> tabel = new ArrayList<>();
        tabel.add(g1);
        tabel.add(g2);
        tabel.add(g3);


        Collections.sort(tabel);


        for(GeometricObject i:tabel) {
            System.out.print(i);
            System.out.println("  "+i.getArea());
        }


    }
}
