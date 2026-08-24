//1154A
import java.util.*;
public class RestoringThreeNumbers {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int n4=sc.nextInt();
        int[] arr={n1,n2,n3,n4};
        int max=Math.max(Math.max(n1,n2),Math.max(n3,n4));
        for (int i = 0; i < 4; i++) {
            if(arr[i]!=max){
                System.out.print(max-arr[i]+" ");
            }
        }



        sc.close();

    }
}
