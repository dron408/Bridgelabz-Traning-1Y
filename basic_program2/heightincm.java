import java.util.Scanner;
class volumeofsphere{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter your height in cm");
		double height = sc.nextInt();
		
		double inches = height/2.34;
		double foot = inches/12;
		
		System.out.println("your height in inches is:"+inches);
		System.out.println("your height in foot is:"+foot);
	}
}
		
	
		
		