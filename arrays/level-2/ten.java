import java.util.Scanner;
class ten{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("write the number :");
        int n = sc.nextInt();

        int arr[] = new int[10];
        int count = 0;

        System.out.println("write your array :");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i] == n){
                count++;
            }
        }
        System.out.println("your number count is"+count);
    }
}