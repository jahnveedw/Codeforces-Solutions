//contest
import java.util.*;
public class Riptide {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int a=sc.nextInt();
            int c=sc.nextInt();
            int b=sc.nextInt();
            if(a!=b && a!=c && b!=c){
                int[] arr={a,b,c};
                Arrays.sort(arr);
                int moves=0;
                while(arr[1]!=arr[0] && arr[1]!=arr[2]){
                    moves++;
                    arr[2]--;
                    arr[0]++;
                }
                System.out.println(moves);
            }else{
                System.out.println(0);
            }
        }



        sc.close();
    }
}
