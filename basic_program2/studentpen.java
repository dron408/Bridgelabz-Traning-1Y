import java.util.Scanner;
class harryage{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("enter your pen"); 
		int pen = sc.nextInt();
		
		System.out.print("enter student"); 
		int student = sc.nextInt();
		
		int que = pen/student;
		int rem = pen%student;
		
		
		
		System.out.print("your que is"); 
		System.out.println(que); 
		
		System.out.print("your rem is"); 
		System.out.println(rem); 
	}
}
		
		
		
		
		
		