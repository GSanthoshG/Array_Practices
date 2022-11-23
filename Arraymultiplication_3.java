package Arrays;
//3*3 array multiplication 
/* input : 1 2 3   1 2 3
           4 5 6   4 5 6
           7 8 9   7 8 9

   output : [[1, 4, 9], [16, 25, 36], [49, 64, 81]]
 * 
 */


import java.util.*;
public class Arraymultiplication_3 {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                 a[i][j] = a[i][j]*sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(a));
        sc.close();
    }
}
