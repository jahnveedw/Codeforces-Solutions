//136A -- again
import java.util.*;
public class Presents {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            int value=sc.nextInt();
            arr[value-1]=i+1;
        }
        for(int k:arr){
            System.out.print(k+" ");
        }

        sc.close();
    }
}
