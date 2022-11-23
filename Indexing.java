import java.util.*;
public class Indexing {

    public static void fib(int i, int j, int m){
        if(m>0){
        System.out.println(i+j);
            int c = i+j;
            i=j;
            j=c;
            fib(i,j,m-1);
            }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int n = sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        fib(a,b,n-2);
    }
}
