//1399A
import java.util.*;
public class RemoveSmallest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            ArrayList<Integer> arr=new ArrayList<>();
            for(int j=0;j<n;j++){
                int num=sc.nextInt();
                arr.add(num);
            }
            Collections.sort(arr);
            int prev=arr.get(0);
            boolean ans=true;
            for(int k=1;k<n;k++){
                int sub=arr.get(k)-prev;
                if(sub>1){
                    ans=false;
                }
                prev=arr.get(k);
            }
            if(ans){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }



        sc.close();
    }
}
