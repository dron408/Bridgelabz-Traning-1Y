import java.util.Scanner;
class average{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("first num:");
		int a = sc.nextInt();

        System.out.print("second num:");
		int b = sc.nextInt();
		
		System.out.print("third num:");
		int c = sc.nextInt();
		
		int average = a + b + c/3;
		System.out.print("your average is:"+average);
	}
}
		
		
		
		
		
		