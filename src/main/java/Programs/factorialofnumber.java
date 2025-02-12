package Programs;

import java.util.Scanner;

public class factorialofnumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number whose fractional you want :");
	int in= sc.nextInt();

	int f= 1;
	for(int i=in;i>0;i--) {
		f=f*i;
	}
	System.out.println("factorial of "+ in + " is an tantana : "+ f);
	
}
}
