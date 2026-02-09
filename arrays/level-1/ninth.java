import java.util.Scanner;

public class ninth {
    @SuppressWarnings("empty-statement")
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        

        int column = sc.nextInt();
        int row = sc.nextInt();

        int arr[][] = new int[row][column];

        //taking input of 2d array:
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int brr[] = new int[row*column];  
        int index = 0;  

        //copy 2d array into 1d array:
         for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                brr[index] = arr[i][j];
                index++;
            }
        }
        for(int i=0;i<brr.length;i++){
            System.out.println(brr[i] + " ");
        }

    }
}