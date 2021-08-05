package ForLoop;

public class Nested_Loop {
	
	public static void main(String[] args) {
	
	for (int x=0; x<5; x++) {
		for (int i = 1; i <=5; i++) {
			System.out.print(i);
		}
		System.out.println();
	}
		
	String st="*****";
	for (int u=1; u<=5; u++) {
		System.out.println(st);
	}
	
	
	
	int t = 5;
	while (t>0) {
		int r=1;
		while (r<=3) {
			System.out.print("*");
			r++;
		}
		System.out.println();
		t--;
	}
		System.out.println("\n\n");
		
		
	for (int i = 7; i >= 1; i--) {
		for (int j=1; j<=i; j++) {
			System.out.print("* ");
		} System.out.println();
	}
		
	for (int k = 2; k < 8; k++) {
		for (int j=1; j<=k; j++) {
			System.out.print("* ");
		} System.out.println();
	}
		
		int A = 1;
		do  {
			int B = 1;
			while (B<=A) {
				System.out.print("+ ");
				B++;
			} 
			System.out.println();
			A++;
		} while (A<=7);
				
		
		
		
		
	}

}
