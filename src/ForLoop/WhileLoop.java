package ForLoop;

import java.util.Scanner;

public class WhileLoop {
	
	public static void main(String[] args) {
	
		int a = 10;
		while (a>8) {
			
			
	//		System.out.println("Hello "+a);
			a--;
		}
		
		String Sentence = "I like book, I love book, book, book";
		String Sentence1 = Sentence;
		int count = 0;
			
		while (Sentence.contains("book")) {
		count++;
		Sentence = Sentence.replaceFirst("book", "");
		}
		System.out.println(count);
		System.out.println(Sentence1);
		
		int i = 0;
		while (true) {
			i++;
			System.out.println("Hello: "+i);
			if (i==5) {
			break;
			}
		}
		
		for (int z = 1; z<=100; z++) {
			if (z%2==0) {
				System.out.print(z+" ");
			}
		}
		System.out.println();
		
		int x = 1;
		while(x<=200) {
			if (x%2==0) {
				System.out.print(x+" ");
			}
			x++;
		}
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Starting number ");
		int start = scan.nextInt();
		System.out.println("ending number");
		int end = scan.nextInt();
		
	/*	for (int j = start; j<end; j++) {
			if (j%2==0) {
				System.out.print(j+" ");
			}
		}*/
		
		int j = start;
		while(j<=end) {
			if (j%2==0) {
				System.out.print(j+ " ");
			}
			j++;
		}
		
		
	}

}
