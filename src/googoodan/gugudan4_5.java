package googoodan;

import java.util.Scanner;

public class gugudan4_5 {

	public static void main(String[] args) {
		System.out.println("구구단 중 출력할 단은? : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println("number : "+number);
		
		for(int i=1; i<10; i++ ) {
		int result = number*i;
		System.out.println(result);
		}
		
		
		
	}

}
