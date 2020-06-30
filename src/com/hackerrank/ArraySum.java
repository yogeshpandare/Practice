package com.hackerrank;

import java.util.Arrays;

public class ArraySum {

	public static void main(String[] args) 
	{
		int ar[]=new int[5];
		int sum = 0;
	
	    for(int i=0; i<ar.length;i++)
	    {
	    	ar[i]=i;
	        sum = sum + ar[i];
	    } 
	    System.out.println(sum);
	    
	    /*for (int value : ar) 
	    {
	        sum += value;
	    }*/
	    
	}
	
}
