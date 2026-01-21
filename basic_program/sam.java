import java.util.Scanner;
class harryage{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter your math marks");
		int math = sc.nextInt();
		
		System.out.print("enter your physics marks");
		int physics = sc.nextInt();
		
	    System.out.print("enter your chemistry marks");
		int chemistry = sc.nextInt();
		
		int average = math + physics + chemistry/3;
		System.out.print(average);
	}
}
		
		
		
		
		
		