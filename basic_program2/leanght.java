import java.util.Scanner;
class leanght{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter your perimeter");
		double perimeter = sc.nextInt();
		
		double leanght = perimeter/4;
		
		System.out.println("your leanght is:"+leanght);
	}
}