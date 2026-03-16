package assinment1;

public class book {
    String title;
    String author;
    double price = 0.0;

    book() {
        title = "unknown";
        author = "Unknown";
        price = 0.0;
    }

    book(String t,String a,double p){
        title = t;
        author = a;
        price = p;
    }
    void display(){
        System.out.println("title"+title);
        System.out.println("author"+author);
        System.out.println("price"+price);
    }
    public static void main(String[] args) {

        book b1 = new book();
        b1.display();

        book b2 = new book("Java Basics", "James Gosling", 499.99);
        b2.display();
    }

}
