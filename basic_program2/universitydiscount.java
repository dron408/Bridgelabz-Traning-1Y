import java.util.Scanner;
class universitydiscount{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter your fee");
		int fee = sc.nextInt();
		
		System.out.print("enter your discount");
		int discount = sc.nextInt();
		
		int realfee = fee - discount;
		System.out.print("realfee is"+realfee);
	}
}
		
		
		