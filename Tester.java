/**
 * This class defines a Circle object.
 *
 * @author Madeline Vande Hey
 * @version 04/12/22
 */

import java.util.ArrayList;

public class Tester {
    public static void main(String args[]){
        ArrayList<Circle2> circles = new ArrayList<Circle2>();
        circles.add(new Circle2(10,15,12));
        circles.add(new Cylinder2(9,7,10,11));
        circles.add(new Oval2(14,7,6,3));
        circles.add(new OvalCylinder2(5,1,10,15,11));

        for(Circle2 c : circles){
            System.out.println("For this " + c.getName() + showCenter(c));
        }
    }

    public static String showCenter(Circle2 c){
        return c.getCenter();
    }
}
