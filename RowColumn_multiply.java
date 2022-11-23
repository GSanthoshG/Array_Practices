package Arrays;
// multiplies each column of array 1 values with respective rows of array 2 values

/*  input:1 2 3 1 2 3 1 2 3
          1 2 3 1 2 3 1 2 3
    output: [[6, 12, 18], [6, 12, 18], [6, 12, 18]]*/ 

import java.util.*;
public class RowColumn_multiply{
    public static void main(String ar[]){
        int a[][] = {{1,2,3},{1,2,3},{1,2,3}};
        int b[][] = {{1,2,3},{1,2,3},{1,2,3}};
        int c[][] = new int[3][3];
        for(int i=0;i<a.length;i++){
            for(int k=0;k<a.length;k++){
            for(int j=0;j<a.length;j++){
               c[i][k] += a[i][j] * b[j][k];
            }
        }
    }
    System.out.print(Arrays.deepToString(c));
    }
}
