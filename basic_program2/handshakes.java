import java.util.Scanner;
class yards{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("num of student ");
		int n = sc.nextInt();
		
		int handshakes = n*(n-1)/2;
		
		System.out.println("number of max handshakes is:"+handshakes);
	}
}

		
		