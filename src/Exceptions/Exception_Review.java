package Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception_Review {

	public static void main(String[] args) {
		
		//throw new FileNotFoundException();
		
		// throw new ClassCastException();
		
		try {
		// FileInputStream file = new FileInputStream("path of file");
		Thread.sleep(2000);
		System.out.println("try block");
		
		} catch (Exception e) {
			System.out.println("catch block");
			
		}
		System.out.println("___________________________________________________________");
		
		try {
		System.out.println(11/0);
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("catch block");
		} finally {
			System.out.println("finally block ");
		}
		
		System.out.println("Next test step");
		method2();
		
		System.out.println("________________________________________________________");
		
		
		int [] arr = {1,2,3};
		
		try {
		System.out.println(arr[200]);
		} catch (NullPointerException e){
			System.out.println(1);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(2);
		} catch (IndexOutOfBoundsException e) {
			System.out.println(3);
		} catch (Exception e) {
			System.out.println(4);
		}
			
	//	method();
		method2();
		System.out.println("All good");
	}
	
	public static void method() throws InterruptedException{
		Thread.sleep(3000);
		System.out.println("Sergei molodets");
	}
	
	public static void method2() {
		try {
		Thread.sleep(3000);
		System.out.println("Sergei tormoz po lyubomu");
		} catch (Exception e ) {
			
		}
					
		}
	public static void method3() throws Exception {
			Thread.sleep(2000);
			
			System.out.println("step 2");
			System.out.println("step 3");
			
			Thread.sleep(2000);
			
			System.out.println("step 4");
			System.out.println("step 5");
			
			Thread.sleep(2000);
			
			
			
			
	}
	
	
	
	
}