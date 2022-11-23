
import java.util.Scanner;
import java.util.Arrays;
public class ArrayFrequency {
    public static void main(String[] args) {
        int a[] = {1,2,1,2,3,1,2,3,4,3,1,5,6,1,3};
        int b[] = new int[a.length];
        int c[] = new int[10];
        for(int i=0;i<a.length;i++){
            c[a[i]]++;
        }
        for(int i=0;i<b.length;i++){
            b[i] = c[a[i]];
        }
        System.out.println("given array -> "+Arrays.toString(a));
        System.out.print("\n");
        System.out.println("array frequency -> "+Arrays.toString(b));
    }
}
