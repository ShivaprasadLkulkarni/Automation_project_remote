package Programs;

import java.util.Scanner;

public class ispalindrome {
public static void main(String[] args) {
	Scanner sc =new  Scanner(System.in);
    System.out.print("Enter a string: ");
	String input = sc.nextLine();
	sc.close();
	
	if (ispalindromes(input)) {
		System.out.println("its palindrome");
	} else {
		System.out.println("not an palindrome");
	}
	
	
	
}

public static boolean ispalindromes(String s) {
	int left =0;
	int right =s.length()-1;
	while(left<right) {
		if(s.charAt(left)!=s.charAt(right)) {
			return false;
		}
	left++;
	right--;
	}
	return true;
}
}
