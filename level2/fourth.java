import java.util.Scanner;

public class fourth {
       public static void main(String args[]){
         Scanner sc = new Scanner(System.in);

        System.out.println("write your number");
        int n = sc.nextInt();

        if(n > 0){
            
                if(n%5 == 0 && n%3 ==0){
                    System.out.println("fizzbuzz");
                }
                else if(n%5 == 0){
                    System.out.println("buzz");
                }
                else if(n%3 == 0){
                    System.out.println("fizz");
                }
                else{
                     System.out.println(n);
                }
            }
        }
    }

