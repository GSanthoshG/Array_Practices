package Arrays;
import java.util.*;
public class RtoL_Shifting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5,6,7};
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int index = arr[0];
            for(int j=0;j<arr.length-1;j++){
                arr[j] = arr[j+1];
            }
            arr[6] = index;
        }
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}

