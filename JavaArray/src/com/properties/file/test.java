package com.properties.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class test {
	
	
	public static void main(String[] args) throws IOException {
		
		try {
			//Reading the file
			FileInputStream fis=new FileInputStream("C:\\Users\\GANESHA\\Desktop\\test.properties");
			//Locate the properties
			Properties properties=new Properties();
			properties.load(fis);
			
			String username=properties.getProperty("username");
			String password=properties.getProperty("password");
			
			System.out.println("Username= "+username);
			System.out.println("Password= "+password);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
