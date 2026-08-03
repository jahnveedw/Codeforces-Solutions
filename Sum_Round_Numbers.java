//1352A
import java.util.*;
public class Sum_Round_Numbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int temp;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            String num=sc.next();
            temp=Integer.valueOf(num);
            for(int j=1;j<num.length()+1;j++){
                int v=(int) (temp%(Math.pow(10,j)));
                if(v!=0){
                    arr.add(v);
                }
                temp-=temp%(Math.pow(10,j));

            }
            System.out.println(arr.size());
            for(int k:arr){
                System.out.print(k+" ");
            }
            arr.clear();
        }
        
        sc.close();
    }
}
