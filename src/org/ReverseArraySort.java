package org;
import java.util.*;
import java.util.Arrays;
 
public class ReverseArraySort {
	 static String getsorted(int A[]) {

		    int[] arr1=new int[A.length];
		    for(int i=0;i<A.length;i++)
		    {
		    int rev=0;
		    while(A[i]!=0)
		    {
		    rev=A[i]%10;
		    arr1[i]=arr1[i]*10+rev;
		    
		    A[i]=A[i]/10;
		    }
		    }
		    Arrays.sort(arr1);
		    return (Arrays.toString(arr1));

		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array :");
	    int size=sc.nextInt();
	    System.out.println("Enter values in array :");
	    int[] arr=new int[size];
	    for(int i=0;i<size;i++)
	    {
	    arr[i]=sc.nextInt();
	    }
       System.out.println(getsorted(arr));
       sc.close();
	}

}
