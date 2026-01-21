import java.util.Scanner;
class calculator{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("enter your a");
		int a = sc.nextInt();
		
		System.out.println("enter your b");
		int b = sc.nextInt();
		
		int minus = a-b;
		int plus = a+b;
		int multiply = a*b;
		int devision = a/b;
		
		System.out.println("minus is:"+minus);
		System.out.println("plus is:"+plus);
		System.out.println("multiply is:"+multiply);
		System.out.println("devision is:"+devision);
	}
}
		
		
		