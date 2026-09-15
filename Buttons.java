//1858A
import java.util.*;
public class Buttons {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int anna=a,katie=b;
            if(c%2==0){
                anna+=c/2;
                katie+=c/2;
            }else{
                anna+=c/2+1;
                katie+=c/2;
            }
            if(anna>katie){
                System.out.println("First");
            }else{
                System.out.println("Second");
            }
        }

        sc.close();
    }
}
