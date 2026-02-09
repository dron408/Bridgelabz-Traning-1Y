import java.util.Scanner;
public class tenth {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        
        int n = sc.nextInt();
        String arr[] = new String[n];

        for(int i=1;i<=n;i++){
            if(i%3 == 0 && i%5 == 0){
                arr[i-1] = "fizzbuzz";
            }
            else if(i%5 == 0){
                arr[i-1] = "buzz";
            }
            else if(i%3 == 0){
                arr[i-1] = "fizz";
            }
            else{
                arr[i-1] = String.valueOf(i);
            }

        }
        for(int i = 0; i < n; i++){
            System.out.println("Position " + (i+1) + " = " + arr[i]);
        }

    }
}
