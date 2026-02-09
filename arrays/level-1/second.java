import java.util.Scanner;
public class second{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);

        int arr[] = new int[5]; 
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
            
            if(arr[i] > 0){
                System.out.println("it is positive number");
                if(arr[i]%2 == 0){
                    System.out.println("it is even number");
                }
                else{
                      System.out.println("it is odd number");
                }
            }
            else{
                System.out.println("it is negative number");
            }
    }
    if(arr[0] > arr[arr.length-1]){
        System.out.println("first number is greater than last number");
    }
    else{
         System.out.println("last number is greater than first number");
    }
    
}
}
