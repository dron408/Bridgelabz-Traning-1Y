import java.util.Scanner;

public class fifteenth {
    	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("write the first count");
		int n = sc.nextInt();


        int factorial = 1;
        int i=1;
        while(i<=n){
            factorial *= i;
            i++;
        }
        System.out.println("your factorial is :"+factorial);
		
    
}
}
