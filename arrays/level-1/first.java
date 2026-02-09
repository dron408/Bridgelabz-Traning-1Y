import java.util.Scanner;
class first{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age[] = new int[10];

        System.out.println("enter your ages");
        for(int i = 0; i < age.length; i++){
            age[i] = sc.nextInt();

            if(age[i] >= 18){
                System.out.println("you can vote");

            }
            else{
                System.out.println("you can not vote");
            }
        }
    }
}