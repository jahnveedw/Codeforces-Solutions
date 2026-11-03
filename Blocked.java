//2220A
import java.util.*;
public class Blocked {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            ArrayList<Integer> arr=new ArrayList<>();
            for(int j=0;j<n;j++){
                int value=sc.nextInt();
                arr.add(value);
            }
            boolean ans=true;
            Collections.sort(arr,Collections.reverseOrder());
            int prev=arr.get(0);
            for(int j=1;j<n;j++){
                if(prev==arr.get(j)){
                    ans=false;
                    break;
                }
                prev=arr.get(j);
            }
            if(ans){
                for(int k:arr){
                    System.out.print(k+" ");
                }
                System.out.println();
            }else{
                System.out.println(-1);
            }
        }


        sc.close();
    }
}
