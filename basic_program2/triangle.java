import java.util.Scanner;
class calculator{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter your height in cm");
		double height = sc.nextInt();
		
		System.out.println("enter your base in cm");
		double base = sc.nextInt();
		
		double inchesheight = height/2.54;
		double inchebase = base/2.54;
		
		double feetheight = inchesheight/12;
		double feetbase = inchebase/12;
		
		double areaininches = 0.5*inchebase*inchesheight;
		double areainfeet = 0.5*feetbase*feetheight;
		
		System.out.println("your area in inches is:"+areaininches);
		System.out.println("your area in feet is"+areainfeet);
	}
}
		
		
		
		
		
		