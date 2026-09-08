//758A
import java.util.*;
public class HolidayOfEquality {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int max=0;
        int sum=0;
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            sum+=num;
            if(num>max){
                max=num;
            }
        }
        System.out.println(n*max-sum);



        sc.close();
    }
}
