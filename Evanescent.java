import java.util.Scanner;
//contest 2254B
public class Evanescent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            sc.nextLine();
            String input=sc.nextLine();
            int org_grps=1;
            for(int j=1;j<n;j++){
                if(input.charAt(j)!=input.charAt(j-1)){
                    org_grps++;
                }
            }
            int ans=org_grps;
            for(int k=1;k<n-1;k++){
                int newgrp=org_grps;
                if(input.charAt(k)!=input.charAt(k-1)){
                    newgrp--;
                }
                if(input.charAt(k)!=input.charAt(k+1)){
                    newgrp--;
                }
                if(input.charAt(k-1)!=input.charAt(k+1)){
                    newgrp++;
                }
                ans=Math.min(ans, newgrp);
            }
            System.out.println(ans);
            
        }


        sc.close();
    }
}
