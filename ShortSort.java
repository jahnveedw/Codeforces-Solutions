//1873A
import java.util.*;
public class ShortSort {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            String input=sc.next();
            if(input.charAt(0)=='a' || input.charAt(1)=='b' || input.charAt(2)=='c'){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }



        sc.close();
    }
}
