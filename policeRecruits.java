//427A
import java.util.*;
public class policeRecruits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int recruits=0;
        int untreat=0;
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int act=sc.nextInt();
            recruits+=act;
            if(recruits<0){
                untreat++;
                recruits=0;
            }
        }
        System.out.println(untreat);


        sc.close();
    }
}
