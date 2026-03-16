package assinment1;

public class carrental {
    String costumername;
    String carmodel;
    int rentaldays;
    int costperday;

    carrental(){
        costumername = "unknown";
        carmodel = "unknown";
        rentaldays = 1;
    }
    carrental(String c,String m,int d){
        costumername = c;
        carmodel = m;
        rentaldays = d;
    }
    carrental(carrental r) {
        costumername = r.costumername;
        carmodel = r.carmodel;
        rentaldays = r.rentaldays;
}
int totalcost(){
    return rentaldays*costperday;
    }
    void printinfo(){
        System.out.println(costumername);
        System.out.println(carmodel);
        System.out.println(rentaldays);
        System.out.println(costperday);
        System.out.println();
    }
    public static void main(String[] args){
        carrental r1 = new carrental();
        carrental r2 = new carrental("dron","BMW",3);
        carrental r3 = new carrental(r2);

        r1.printinfo();
        r2.printinfo();
        r3.printinfo();
    }
}





