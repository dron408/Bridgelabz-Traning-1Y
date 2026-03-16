package assinment1;

import static java.awt.PageAttributes.MediaType.C1;
import static java.awt.PageAttributes.MediaType.C2;

public class circle {
    double radius;

    circle(){
        this(1.0);
    }

    circle(double r){
        radius = r;
    }

    double area(){
        return 3.14*radius*radius;
    }
    public static void main(String[] args) {
        circle c1 = new circle();
        circle c2 = new circle();

        System.out.println(c1.radius);
        System.out.println(c1.area());

        System.out.println(c2.radius);
        System.out.println(c2.area());
    }


}
