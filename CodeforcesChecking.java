//1791A
import java.util.*;
public class CodeforcesChecking{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        String str="codeforces";
        for(int i=0;i<t;i++){
            String ch=sc.nextLine();
            if(str.contains(ch)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }



        sc.close();
    }
}