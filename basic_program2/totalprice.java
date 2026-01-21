import java.util.Scanner;
class yards{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter your price");
		int price = sc.nextInt();
		
		System.out.println("enter your quantity");
		int quantity = sc.nextInt();
		
		int totalprice = price*quantity;
		
		System.out.println("totalprice is"+totalprice);
	}
}
		
		
		
		
		