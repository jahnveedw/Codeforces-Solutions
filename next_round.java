//158A
import java.util.*;
public class next_round {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] list=new int[n];
        int p=0;
        for(int i=0;i<n;i++){
            list[i]=sc.nextInt();
        }
        int cutoff=list[k-1];
        for (int j=0;j<n;j++){
            if(list[j]>=cutoff && list[j]>0){
                p++;
            }
        }
        System.out.println(p);
        sc.close();
    }
}
