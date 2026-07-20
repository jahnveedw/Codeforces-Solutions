//617A
import java.util.*;
public class Elephant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        sc.nextLine();
        int steps=0;
        int[] arr={5,4,3,2,1};
        while(x>0){
            for(int j:arr){
                if(x>=j){
                    x-=j;
                    steps++;
                break;
                }
            }
        }
        System.out.println(steps);




        sc.close();
    }
}
