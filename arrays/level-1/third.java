import java.util.Scanner;

public class third {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[10];

        for(int i=1;i<=arr.length;i++){
           
            arr[i-1] = n*i;
             System.out.println(arr[i-1]);
        }
      
    }

}
