import java.util.Scanner;
public class fifth {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // taking input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // array to store result
        int[] multiplicationResult = new int[4];

        // calculating multiplication from 6 to 9
        int index = 0;
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[index] = number * i;
            index++;
        }

        // displaying result
        index = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[index]);
            index++;
        }
    }
}


