package assinment1;

public class book2 {
    String title;
    String author;
    int price;
    boolean avaibility;


    book2(String t,String a,int p){
        title = t;
        author = a;
        price = p;
        avaibility = true;
    }
    void borrowbook(){
        if (avaibility) {
            avaibility = false;
            System.out.println("book borrowed successfully.");
        }
        else{
            System.out.println("book is not available.");
        }
    }
    void printinfo(){
        System.out.println("title "+title);
        System.out.println("author "+author);
        System.out.println("price "+price);
        System.out.println("avaibility"+avaibility);
    }
    public static void main(String[] args){
        book2 b1 = new book2("ikigai","japnese",300);
        b1.printinfo();
        b1.borrowbook();
        b1.printinfo();
    }

}
