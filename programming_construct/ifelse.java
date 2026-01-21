import java.util.Scanner;
class ifelse {
	public static void main(String ... args){
		Scanner sc = new Scanner(System.in);
				int marks = sc.nextInt();
				
				for(int i=1;i<=10;i++){
				    marks = sc.nextInt();
					if(marks < 50){
		           System.out.println("grade D");
				}
				else if(marks > 50 && marks <70){
		               System.out.println("grade B");
			    }
				else if(marks > 70 && marks <90){
					System.out.println("grade A");
				}
				
				else if(marks > 90){
					System.out.println("grade A");
				}
				else{
					Syste.out.println("invalid marks");
				}
				}
	}
}

					

				
				
	

					
				
				
	
		
					
					
				