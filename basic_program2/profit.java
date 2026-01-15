import java.util.Scanner;
class harryage{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter your sellingprice");
		int sellingprice = sc.nextInt();
		
		System.out.print("enter your cost");
		int cost = sc.nextInt();
		
		int profit = sellingprice*100/cost;
		System.out.print("your profit is");
		System.out.print(profit);
		
	}
}
		
		
		
		
		
		
		
		
		