package googoodan;

import java.util.Scanner;

public class use_for_while {

	public static void main(String[] args) {
		
		// for문을 이용한 구구단
//		System.out.println("입력할 구구단은? : ");
//		Scanner sc = new Scanner(System.in);
//		int number = sc.nextInt();
//		System.out.println("num : "+ number);
//		
//		for(int i=1;i<10;i++) {
//			System.out.println(number*i);
//		}

		//while을 이용한 구구단
		System.out.println("입력할 구구단은? : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println("num : "+ number);		
		
		int i = 1;
		while(i<10) {
			System.out.println(number*i);
			i++;
		}
		
	}

}
