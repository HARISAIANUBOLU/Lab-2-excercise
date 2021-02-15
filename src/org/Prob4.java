package org;
import java.util.Scanner;

public class Prob4 {
	public static int modifyArray(int arr[], int n){  
        if (n==0 || n==1){  
            return n;  
        }  
        int[] temp = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[n-1];     
        // Changing original array  
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  
        return j;  
    }  
       
    public static void main (String[] args) { 
    	int temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter values of array :");
        for(int i=0;i<n;i++)
        {
        	arr[i]=sc.nextInt();
        	  
        }
        
        
        int length = arr.length;  
          
        //printing array elements  
        for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] < arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;
               }}}
        length = modifyArray(arr, length);
        for (int i=0; i<length; i++)  
           System.out.print(arr[i]+" ");  
        sc.close();
    }  
}

