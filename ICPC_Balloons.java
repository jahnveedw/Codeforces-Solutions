//1703B
import java.util.*;
public class ICPC_Balloons {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            sc.nextLine();
            String str=sc.nextLine();
            char[] arr=str.toCharArray();
            Arrays.sort(arr);
            int balloons=2;
            char prev=arr[0];
            for(int j=1;j<n;j++){
                if(prev==arr[j]){
                    balloons++;
                }else{
                    balloons+=2;
                }
                prev=arr[j];
            }
            System.out.println(balloons);
            
        }

        sc.close();
    }
}
