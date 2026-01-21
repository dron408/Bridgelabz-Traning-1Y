import java.util.Scanner;
class interest{
	
public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	
	int principal = input.nextInt();
	int rate = input.nextInt();
	int time = input.nextInt();
	
	int simpleinterest = (principal*rate*time)/100;
	
	System.out.println(simpleinterest);
}
}
	
	
	
	
	
	
		