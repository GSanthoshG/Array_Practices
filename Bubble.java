package Arrays;
// Bubble sorting algorithm

import java.util.*;
public class Bubble {
    public static void main(String ar[]){
            int arr[] = {9,6,5,8,4};
            int n = arr.length;
            for(int j=0;j<n;j++){
            for(int i=0;i<n-1;i++){
                if(arr[i]>arr[i+1]){ 
                    int temp = arr[i]; 
                    arr[i] = arr[i+1]; 
                    arr[i+1] = temp;
                }
            }
            
        }
            System.out.println(Arrays.toString(arr));
    }  
}