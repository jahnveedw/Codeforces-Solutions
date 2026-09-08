//past contest
import java.util.*; 
public class MooLanguageSchool {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i <t; i++) {
            int n=sc.nextInt();
            int k=sc.nextInt();
            String str=sc.next();
            int num=0;
            for (int j = 0; j <n; j+=k) {
                if(str.substring(j, j+k).contains("0")==false){
                    num++;
                }
            }
            System.out.println(num);

        }


        sc.close();
    }
}
