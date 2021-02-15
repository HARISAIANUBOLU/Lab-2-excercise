package org;


import java.util.*;

public class SortStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    ArrayList<String> listofar=new ArrayList<String>();
	    for(int i=1;i<=n;i++)
	    {
	    	listofar.add(sc.next());
	    	Collections.sort(listofar);
	    }
	    //System.out.println(listofar);
	    List<String> first = new ArrayList<String>(); 
        List<String> second = new ArrayList<String>(); 
        int size = listofar.size(); 
        for (int i = 0; i < size / 2; i++) 
            first.add(listofar.get(i));  
        for (int i = size / 2; i < size; i++) 
            second.add(listofar.get(i));
        first.replaceAll(String::toUpperCase);
        System.out.println(first);
        System.out.println(second);
        first.addAll(second);
        System.out.println(first);
	    sc.close();
	}

}
