//1030A
import java.util.*;
public class InSearch_Problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Boolean ans=true;
        for (int i = 0; i < n; i++) {
            int level=sc.nextInt();
            if(level==1){
                ans=false;
                break;
            }
        }
        if(ans==false){
            System.out.println("HARD");
        }
        else{
            System.out.println("EASY");
        }
    }
}
