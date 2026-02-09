import java.util.Scanner;

public class sixth {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your weight");
        int w = sc.nextInt();
        System.out.println("enter your height");
        int h = sc.nextInt();

        int bmi = w/h*h;

        int arr[] = new int[3];

        arr[0] = h;
        arr[1] = w;
        arr[2] = bmi;

        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        if(bmi <= 18){
            System.out.println("you are underweight");
        }
        else if(bmi > 18 && bmi <= 24){
            System.out.println("you are normal");
        }
        else if(bmi > 24 && bmi < 39){
            System.out.println("you are overweight");
        }
        else{
            System.out.println("you are obesee");
        }
    
    }
}
