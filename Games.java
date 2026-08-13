//268A
import java.util.*;
public class Games {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr1=new int[n];
        int[] arr2=new int[n];
        int changes=0;
        for(int i=0;i<n;i++){
            int h=sc.nextInt();
            int a=sc.nextInt();
            arr1[i]=h;
            arr2[i]=a;
        }
        for(int j=0;j<n;j++){
            for(int k=0;k<n;k++){
                if(arr1[j]==arr2[k]){
                    changes++;
                }
            }
        }
        System.out.println(changes);


        sc.close();
    }
}
