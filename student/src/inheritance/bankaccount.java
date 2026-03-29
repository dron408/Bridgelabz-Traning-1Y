package inheritance;

public class bankaccount {
    String acountholdername;
    double balance;

    bankaccount(String name,double balance){
        this.acountholdername = name;
        this.balance = balance;
    }
    void deposite(double amount){
        balance += amount;
    }
    void displaybalance(){
        System.out.println("your balance is "+balance);
    }
     class SvingAccount extends bankaccount{
        double interestRate;

         SvingAccount(String name, double balance,double rate) {
             super(name, balance);
             this.interestRate = rate;
         }
         void addInterest(){
             double Interest = interestRate*balance;
             balance += Interest;
             System.out.println("your interest is "+Interest);
         }
     }
     public static void main(String[] args){

     }
}


