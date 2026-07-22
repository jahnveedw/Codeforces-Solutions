//677A
import java.util.*;
public class Vanya_andFence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int h=sc.nextInt();
        sc.nextLine();
        int width=0;
        for (int i = 0; i < n; i++) {
            int a=sc.nextInt();
            if(a>h){
                width+=2;
            }
            else{
                width++;
            }    
        }
        System.out.println(width);



        sc.close();
    }
}
