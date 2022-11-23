import java.util.*;
public class Binary
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter array size: ");
	    int a = sc.nextInt();
	    int arr[] = new int[a];
	    for(int i=0;i<a;i++){
	        System.out.print("Enter array element "+i+" : ");
	        arr[i]=sc.nextInt();
	    }
	    System.out.print("Enter value to be searched: ");
	    int search = sc.nextInt();
	   System.out.println(binsearch(arr,search));
	}
	
	public static int binsearch(int arr[], int search){
	    int start = 0;
	    int end = arr.length-1;
	    while(start<arr.length && end>=start){
	        int mid = (start+((end-start)/2));
	        if(arr[mid]==search){
	            return mid;
	        }
	        else if(arr[mid]<search){
	            start = mid+1;
	        }
	        else if(arr[mid]>search){
	            start = mid-1;
	        }
	    }
	    return -1;
	}
}