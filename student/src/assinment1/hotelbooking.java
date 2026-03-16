package assinment1;

public class hotelbooking {
    String guestname = "unkown";
    String roomtype = "unkown";
    int night = 0;

    hotelbooking(){

    }
hotelbooking(String g,String r,int n){
    guestname = g;
    roomtype = r;
    night = n;
}
hotelbooking(hotelbooking h){
    guestname = h.guestname;
    roomtype = h.roomtype;
    night = h.night;
}
void display() {

    System.out.println(guestname);
    System.out.println(roomtype);
    System.out.println(night);
    System.out.println();
}

public static void main(String[] args){
    hotelbooking b1 = new hotelbooking();
    hotelbooking b2 = new hotelbooking("dron","delux",3);
    hotelbooking b3 = new hotelbooking(b2);

    b1.display();
    b2.display();
    b3.display();
}
}
