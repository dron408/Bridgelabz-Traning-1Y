import java.util.Scanner;

public class third {
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);

        System.out.println("write your number");
        int number = sc.nextInt();

        for(int i=1;i<=10;i++){
           int table = number*i;
           System.out.println(table);
        }
    }
}
