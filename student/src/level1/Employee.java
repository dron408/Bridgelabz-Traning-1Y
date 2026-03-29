package level1;

public class Employee {
    int id;
    double salary;
    String name;

    void print(){
        System.out.println("your id is"+id);
        System.out.println("your name is"+name);
        System.out.println("your salary is"+salary);
    }

}
class Main{
    public static void main(String[] args){
        Employee E1 = new Employee();
        E1.salary = 100000;
        E1.id = 124;
        E1.name = "dron";
        E1.print();


    }
}





