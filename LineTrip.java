//1901A
import java.util.*;
public class LineTrip {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i <t; i++) {
            int start=0;
            int diff=0;
            int maxdiff=0;
            int n=sc.nextInt();
            int end=sc.nextInt();
            for(int j=0;j<n;j++){
                int element=sc.nextInt();
                diff=element-start;
                start=element;
                if(diff>maxdiff){
                    maxdiff=diff;
                }
                if(j==n-1 && (end-element)*2>maxdiff){
                    maxdiff=(end-element)*2;
                }
            }
            System.out.println(maxdiff);
        }


        sc.close();
    }
}
