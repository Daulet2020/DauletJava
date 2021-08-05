package JavaReview;

import java.text.DecimalFormat;

public class FormatingDecimals {
	
	public static void main(String[] args) {
		
		DecimalFormat format = new DecimalFormat("0.00");
		
		double a = 2.3654198;
		
		// format (double): formats decimals and returns String value
		String num1 = format.format(a);						
		System.out.println(num1);							//String
		
		double b = 6.35216987;
		System.out.println(format.format(b)+" "+ 1);      	// String
		
		b = Double.parseDouble(format.format(b));			//Double
		System.out.println(b+1);							//Double 
		
	}

}
