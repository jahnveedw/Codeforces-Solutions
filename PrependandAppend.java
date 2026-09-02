//1791C
import java.util.*;
public class PrependandAppend {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            sc.nextLine();
            String num=sc.nextLine();
            int j=0;
            int k=n-1;
            while(k>j && num.charAt(j)!=num.charAt(k) ){
                j++;
                k--;
            }
            System.out.println(k-j+1);
        }


        sc.close();
    }
}
