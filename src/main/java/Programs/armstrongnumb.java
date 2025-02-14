package Programs;

import java.util.Scanner;

public class armstrongnumb {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a number which you want whether it is armstrobg or not : ");
	int n = sc.nextInt();
	int a=n;
	int b=0;
	int c=0;
	
	while(a!=0) {
		b=a%10;
		a=a/10;
		c=c+b*b*b;
	}
	if(c==n) {
		System.out.println("Number : "+n+" is an armstrong number ");
	}else {
		System.out.println("Number : "+n+" is not an armstrong number ");

	}

	}
}
