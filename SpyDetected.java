//1512A
import java.util.*;
public class SpyDetected {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int j=0;j<n;j++){
                int num=sc.nextInt();
                arr[j]=num;
            }
            int[] arr2=arr.clone();
            int element;
            Arrays.sort(arr2);
            if(arr2[0]!=arr2[1]){
                element=arr2[0];
            }else{
                element=arr2[n-1];
            }
            for(int k=0;k<n;k++){
                if(arr[k]==element){
                    System.out.println(k+1);
                    break;
                }
            }
        }
        /*
         * import java.util.*;

public class SpyDetected {

```
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();

    for (int j = 0; j < t; j++) {

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int common;

        if (arr[0] == arr[1] || arr[0] == arr[2]) {
            common = arr[0];
        } else {
            common = arr[1];
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] != common) {
                System.out.println(i + 1);
                break;
            }
        }
    }

    sc.close();
}
```

}

         */


        sc.close();
    }
}
