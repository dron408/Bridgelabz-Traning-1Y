import java.util.Scanner;
public class first {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n%2 == 0){
            System.out.println("your number is even ");
        }

        else if(n%2 != 0){
            System.out.println("your number is odd");
        }
        else{
            System.out.println("your number zero");

        }

    }
    
}
