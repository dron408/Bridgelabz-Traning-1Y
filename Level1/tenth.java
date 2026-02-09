import java.util.Scanner;

public class tenth {
    public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
        
        int sum = 0;
        for(int i=0;i>=0;i++){
            int s = sc.nextInt();
            sum = sum + s;
            System.out.println("your sum is"+sum);

            if(s == 0){
                break;
            }
        }
}
}
