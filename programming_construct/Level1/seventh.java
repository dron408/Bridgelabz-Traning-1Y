import java.util.Scanner;
class seventh{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your month");
		int month = sc.nextInt();
		System.out.println("enter your day");
		int day = sc.nextInt();
		
		if (
            (month == 3 && day >= 20) ||
            (month == 4) ||
            (month == 5) ||
            (month == 6 && day <= 20)
           )
        {
            System.out.println("It's spring season");
        }
        else{
            System.out.println("It's not spring season");
        }
		
	}
}

				
				
			