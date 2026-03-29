package level1;

public class Circle {
    int radius;

    void print(){
        double area = 2*3.14*radius*radius;
        double circumfrence = 2*3.14*radius;

        System.out.println("area is"+ area);
        System.out.println("circumference is"+circumfrence);
    }
}
class main{
    public static void main(String[] args){
        Circle c1 = new Circle();
        c1.radius = 9;
        c1.print();
    }
}

