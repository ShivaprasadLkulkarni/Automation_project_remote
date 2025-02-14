package Programs;

import java.util.Scanner;

public class FloyfTriangle {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter an number of rows : ");
	int in = sc.nextInt();
	int n=0;
	for(int i=0;i<in;i++) {
		for(int j=0;j<=i;j++) {
			System.out.println(++n+"");
		}
		System.out.println();
	}
	
	
}
}
