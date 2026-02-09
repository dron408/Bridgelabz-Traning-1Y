import java.util.Scanner;
public class eight {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int index =0;
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=1;i<=n;i++){
            
                if(n%i == 0){
                    arr[index] = i;
                    System.out.println(arr[index]);
                    index++;
                }
            }
        }
    }
        
        
    

