import java.util.Scanner;
class sixth{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		
		if(n>0){
			System.out.println("your num is positive");
		}
		
		else if(n<0){
			System.out.println("your num is negative");
		}
		else{
			System.out.println("your num is zero");
		}
	}
}
			
			
			