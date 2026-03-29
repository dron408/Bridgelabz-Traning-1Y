package level2;

public class Student {
    String name;
    int rollno;
    int marks;

    void print(){
        System.out.println("your rollno is"+rollno);
        System.out.println("your name is"+name);
        if(marks<50){
            System.out.println("you are under 50" +marks);
        }
        else if(marks >= 100){
            System.out.println("invalid marks" +marks);
        }
        else{
            System.out.println("you are above 50" +marks);
        }
    }
}
class main{
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Dron";
        s1.rollno = 123;
        s1.marks = 95;
        s1.print();
    }
}
