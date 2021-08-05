package AccessModifiers;

//import static AccessModifiers.TestData.Name;
//            Package name   ClassName   StaticVariable
// import static AccessModifiers.TestData.ID; 

import static AccessModifiers.TestData.*;

import java.util.Arrays;

public class Test {
	public static String Name = "Daulet";
	
	public static void main(String[] args) { 
		
		defaultAccessModifier obj = new defaultAccessModifier();
		System.out.println(obj.namePublic);
	//	System.out.println(obj.namePrivate); 	// not visible
		System.out.println(obj.nameDefault);    // visible within package
		
		System.out.println(Name);
		System.out.println(TestData.Name);
		System.out.println(ID);
		System.out.println(SchoolName);
		
		printHello();
		
		System.out.println(age);
		
	}
}
