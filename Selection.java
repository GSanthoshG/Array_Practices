package Arrays;
import java.util.*;
public class Selection {
    public static void main(String ar[]){
        int arr[] = {5,7,6,9,8};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int smallest = arr[j]; 
                    arr[j] = arr[i];
                    arr[i] = smallest;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}