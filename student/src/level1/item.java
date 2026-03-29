package level1;

public class item {
    int itemcode;
    String itemname;
    int price;
    int quantiti;

    void print(){
        int cost = quantiti*price;
        System.out.println("itemcode is"+itemcode);
        System.out.println("item name is"+itemname);
        System.out.println("price"+price);
        System.out.println("quantiti"+quantiti);
        System.out.println("cost is"+cost);
    }
}
class main2{
    public static void main(String[] args){
        item i1 = new item();
        i1.itemname = "book";
        i1.itemcode =23;
        i1.quantiti = 1;
        i1.price = 200;
        i1.print();
    }


}
