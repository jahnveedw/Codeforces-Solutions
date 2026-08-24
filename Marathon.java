//1692A
import java.util.*;
public class Marathon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        for (int i = 0; i < test; i++) {
           int n1=sc.nextInt();
           int n2=sc.nextInt();
           int n3=sc.nextInt();
           int n4=sc.nextInt();
           int t=0;
           int[] arr={n1,n2,n3,n4};
           for(int j=1;j<4;j++){
                if(arr[j]-n1>0){
                    t++;
                }
            }
            System.out.println(t);
        }

        sc.close();
    }
}
