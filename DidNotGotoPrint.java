//2275B
import java.util.*;
public class DidNotGotoPrint {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            sc.nextLine();
            String input=sc.nextLine();
            boolean[] value=new boolean[n];
            Stack<Integer> stack=new Stack<>();
            for(int k=0;k<n;k++){
                char ch=input.charAt(k);
                if(ch=='1'){
                    stack.push(k+1);
                }else if(ch=='2'){
                    if(stack.isEmpty()){
                        value[k]=true;
                    }else{
                        int ele=stack.pop();
                        value[ele-1]=true;
                    }
                }else if(ch=='3'){
                    value[k]=true;
                }
            }
            int c=0;
            for(boolean k:value){
                if(!k){c++;}
            }
            System.out.println(c);
            for(int j=0;j<n;j++){
                if(!value[j]){
                    System.out.print((j+1)+" ");
                }
            }
            System.out.println();
        }


        sc.close();
    }
}
