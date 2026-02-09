import java.util.Scanner;

public class sixth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[11];
        int sum = 0;
        System.out.println("enter your heights");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
            sum = arr[i] + sum;
        }
        int mean = sum/arr.length;
        System.out.println("your sum is :"+ sum);
        System.out.println("your mean is :"+ mean);
        
    }
}
