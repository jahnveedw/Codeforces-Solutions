//1328A
import java.util.*;
public class Divisibility_Problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        int[] move=new int[t];
        for(int i=0;i<t;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int moves=0;
            if(a%b!=0){
                moves=b-(a%b);
            }
            move[i]=moves;
        }
        for(int j=0;j<t;j++){
            System.out.println(move[j]);
        }



        sc.close();

    }
}
