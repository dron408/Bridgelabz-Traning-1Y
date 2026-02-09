import java.util.Scanner;
public class fourth {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number for array");
        int n = sc.nextInt();

        int arr[] = new int[n];
        int sum = 0;

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
            if(arr[i] < 0 || arr[i] == 0){
                break;
            }
        }
        System.out.println("your sum is:"+sum);
    }
}
