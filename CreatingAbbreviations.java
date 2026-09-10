//2257A
import java.util.Scanner;
public class CreatingAbbreviations {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt(); //word
            int m=sc.nextInt(); //abbr
            sc.nextLine();
            String first="";
            boolean ans=true;
            for(int j=0;j<n;j++){
                String input=sc.nextLine();
                first+=Character.toUpperCase(input.charAt(0));
            }
            for(int j=0;j<m;j++){
                String abbr=sc.nextLine();
                for(int k=0;k<abbr.length();k++){
                    if(first.indexOf(abbr.charAt(k))==-1){
                        ans=false;
                    }
                }
            }
            if(ans){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }


        sc.close();
    }
}
