import java.util.Scanner;
class yards{
	public static void main(String args[]){
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("enter your distance coverd in feets");
	   int feetdis = sc.nextInt();
	   
	   int yarddis = feetdis/3;
	   int miles = yarddis/1760;
	   
	   System.out.println("your distance in yards is:"+yarddis);
	   System.out.println("your distance in miles is:"+miles);
	}
}



	   
	   