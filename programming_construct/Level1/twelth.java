import java.util.Scanner;
class twelth{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("write the first count");
		int n = sc.nextInt();
		
		int sum = 0;
		int i=0;
		while(i<=n){
			sum += i;
			i++;
		}
		System.out.println("your sum is"+sum);
		
	}
}
