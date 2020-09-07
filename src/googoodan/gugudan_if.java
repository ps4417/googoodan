package googoodan;

import java.util.Scanner;

public class gugudan_if {

	public static void main(String[] args) {
		System.out.println("구구단 중 출력할 단은?");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println("입력한 값 : "+number);
		if(number <2) {
			System.out.println("2단~9단 사이의 값을 입력해 주세요");
		}else if(number>9){
			System.out.println("2단~9단 사이의 값을 입력해 주세요");
		}else {
			for(int i=1;i<10;i++) {
				System.out.println(number*i);
			}
		}
		
		
		
		

	}

}
