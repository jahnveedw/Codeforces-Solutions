//263A
import java.util.*;
public class Beautiful_Matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] array1=new int[5][5];
        int pos_i=0 ,pos_j=0;
        for(int i=1;i<6;i++){
            for (int j=1;j<6;j++){
                int value=sc.nextInt();
                array1[i-1][j-1]=value;
                if(value==1){
                    pos_i=i;
                    pos_j=j;
                }
            }
        }
        int steps = Math.abs(pos_i-3)+Math.abs(pos_j-3);
    
        System.out.println(steps);
        sc.close();
    }  
}
