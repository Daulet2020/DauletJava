package Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

/*
 1. Write a method called "wait" that causes the current executing thread to sleep for the specific number of seconds
 		parameters: double seconds
 					return-type: String
 					
 				Thread.sleep();
  
 Note: Exceptions MUST be handled within the methods
 
 
 2. write a method called "getData" that can retrieve the data from properties files
 		parameters: String Key, String FilePath
 		return-type: String
 		
 		Note: Exceptions MUST be handled within the methods
 
 */

public class WarmUp {
	
	public static void main(String[] args) {
		Wait(2.5);
		System.out.println("Batch 12");
		
		Properties property = new Properties();
		
		String path = "\\Users\\daule\\OneDrive\\Desktop\\Data";
		
		try {
		FileInputStream file = new FileInputStream(path);
		property.load(file);
		} catch (Exception e) {
			
		}
		
		String Name = property.getProperty("ID");
		System.out.println(Name);
		
		System.out.println(getData("Name", path));
		
		String Age1 = getData("Age", "TestData.properties");
		System.out.println(Age1);
		
		String URL = getData("URL", "files/TestData2.properties");
		System.out.println(URL);
	
	
	}
	
	public static void Wait (double seconds) {

		
		try {
		Thread.sleep((long)(seconds*1000));
		} catch (InterruptedException e) {
			
		}

	
	
	
	
	}
 
	public static String getData(String Key, String Path) {
		
		String data = "";
		Properties property = new Properties();
		
		 	
		try {
		FileInputStream file = new FileInputStream(Path);
		property.load(file);
		} catch (Exception e) {
			
		}
		data = property.getProperty(Key);
		
		return data;
		
		
		
		
		
		
	}
}
