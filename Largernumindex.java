package Arrays;
// Finds largest number in an array and returns the number and it's index

/* input: 1 2 6 14 5 8
   output: 14
           3
 */

import java.util.*;
public class Largernumindex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = {1,2,6,14,5,8};
        int temp = a[0];
        int ind = 0;
        for (int i = 1; i < a.length; i++) {
            if(temp<a[i]){
                temp = a[i];
                ind = i;
            }
        }
        System.out.println(temp);
        System.out.println(ind);
        sc.close();
    }
}
