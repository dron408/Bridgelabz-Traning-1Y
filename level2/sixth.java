import java.util.Scanner;

public class sixth {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int age1 = sc.nextInt();
        int age2 = sc.nextInt();
        int age3 = sc.nextInt();

        if(age1 < age2 && age1 < age3){
            System.out.println("person 1 is younger");
        }
        else if(age2 < age3 && age2 < age1){
            System.out.println("person 2 is younger");
        }
        else if(age3 < age1 && age3 < age2){
            System.out.println("person 3 is younger");
        }
    }
}
