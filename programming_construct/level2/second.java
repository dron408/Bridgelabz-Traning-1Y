import java.util.Scanner;
public class second {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("write your years");
        int years = sc.nextInt();

        if(years < 5){
            System.out.println("you are not eligible for bonus");
        }

        System.out.println("write your salry");
        int salry = sc.nextInt();

        if(years >= 5){
            int bonus = salry/5;
            System.out.println("your bouns is gonna be"+bonus);

        }

        

    }
}
