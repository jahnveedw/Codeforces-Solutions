//1829B
import java.util.*;
public class BlankSpace {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int maxsum=0;
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int sum=0;
            maxsum=0;
            for(int j=0;j<n;j++){
                int element=sc.nextInt();
                if(element==0){
                    sum++;
                    if(sum>maxsum){
                        maxsum=sum;
                    }
                }else{
                    sum=0;
                }
            }
            System.out.println(maxsum);
        }


        sc.close();
    }
}
