//1899A
import java.util.*;
public class gameWithIntegers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            if(num%3==0){
                System.out.println("Second");
            }else{
                System.out.println("First");
            }
        }


        sc.close();
    }
}
