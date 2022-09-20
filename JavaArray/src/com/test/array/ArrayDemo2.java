package com.test.array;
//How to declare,instantiate and initiate in single line
// Data_type[] arrName={10,20,30,40};

public class ArrayDemo2 {
	
	public static void main(String[] args) {
		
		//Declaration,instantiation,initialization in single line
		int[] a= {10,20,30,40};
		//Printing
		for(int i=0;i<a.length;i++) {    //For loop
			System.out.println(a[i]);
			
		}
		
		//for(Data_type variable:array)
		//printing using for-each loop
		for(int i:a) {
			System.out.println(i);
		}
		
	}
	
	
	

}
