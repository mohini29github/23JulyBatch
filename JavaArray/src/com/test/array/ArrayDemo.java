package com.test.array;
//Declare and instantiate array in single line
// Data_type[] arrName = new Data_type[size]

public class ArrayDemo {
	
	public static void main(String[] args) {
		
		//Declaring and instantiating array
		int [] i=new int[5];
		
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		i[4]=50;
		
		System.out.println("The length of array= "+i.length);
		
		//Retriving the value
		for(int j=0;j<i.length;j++) {
			System.out.println(i[j]);
		}
		
		
	} 
	
	
	
	
	
	
	
	
	

}
