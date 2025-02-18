package Programs;

import java.util.Scanner;

public class leapyearcheck {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year to check : ");
		int input = sc.nextInt();
		
		if(((input % 4==0)&&(input%100!=0))||(input%400==0)) {
			System.out.println(input + "is an leap year woahhhhh");
		}else {
			System.out.println(input + "is not year of leap");
		}
		sc.close();
	}

}
