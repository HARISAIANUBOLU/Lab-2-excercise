package org;
import java.util.*;

public class SecondSmall {
	public static int getSecondSmallest(int a[]) {
		Arrays.sort(a);
		return a[1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n=sc.nextInt();
		System.out.println("Enter values in Array :");
		int[] num=new int[n];
		for(int i=0;i<num.length;i++)
		{
			num[i]=sc.nextInt();
		}
		
	
		System.out.println("second smallest number is: "+ getSecondSmallest(num));
		sc.close();

	}

	}
