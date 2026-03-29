package level2;

public class Bankacount {
    String Accountholder;
    int Accountnumber;
    double balance;

    void deposit(double amount){
        balance = balance + amount;
        System.out.println("your balance is"+balance);
    }
    void withdrawing(double amount){
        if(amount<=balance){
            balance = balance - amount;
            System.out.println("your balance is"+balance);
        }
        else{
            System.out.println("not suffisient balence");
        }
    }
    void displayBalance(){
        System.out.println("your current balance is"+balance);
    }
}
class main3{
    public static void main(String[] args){
        Bankacount b1 = new Bankacount();
        b1.balance = 70000;
        b1.Accountholder = "Dron";
        b1.Accountnumber = 123123;
        b1.deposit(5000);
        b1.withdrawing(5000);
        b1.displayBalance();
    }
}
