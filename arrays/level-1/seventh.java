import java.util.Scanner;

public class seventh {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int even[] = new int[n];
        int odd[] = new int [n];

        System.out.println("even number array :");
        for(int i=0;i<even.length;i++){
            if(i%2 == 0){
                even[i] = i;
            System.out.println(even[i]);
        }
    }
        System.out.println("odd number array :");
        for(int j=0;j<odd.length;j++){
            if(j%2 != 0){
                odd[j] = j;
                 System.out.println(odd[j]);
            }
            
        }
        


}
}

