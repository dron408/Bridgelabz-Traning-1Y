import java.util.Scanner;
class thirteen{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("write the first count");
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i=0;i<=n;i++){
			sum += i;
		}
		System.out.println("your sum is"+sum);
	}
}
			