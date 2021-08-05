package Day6;

public class Practice {
	
	public static void main(String[] args) {
		int num3 = 'B';
		System.out.println(num3);
		
		float num = 55000;
		System.out.println(num);
		
		System.out.println("3"+ '3');
		System.out.println(12 + '3');
	}
		
		boolean monkeyTrouble (boolean aSmile, boolean bSmile) {
			  if (aSmile && bSmile) {
			    return true;
			  }
			  if (!aSmile && !bSmile) {
			    return true;
			  }
			  return false;
			  // The above can be shortened to:
			  //   return ((aSmile && bSmile) || (!aSmile && !bSmile));
			  // Or this very short version (think about how this is the same as the above)
			  //   return (aSmile == bSmile);
			
 
		
	}

}
