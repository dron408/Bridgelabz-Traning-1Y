import java.util.Scanner;
public class fourteen {
     public static void main(String args[]){

        System.out.println("enter your number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("enter your power");
        int power = sc.nextInt();

        int result = 1;
        if(n>0){
            int i = 0;
            while(i<=n){
                result *= n;
                System.out.println(result);
                i++;
            }

        }
}
}
