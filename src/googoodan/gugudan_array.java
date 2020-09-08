package googoodan;

public class gugudan_array {

	public static void main(String[] args) {
		System.out.println("2단~9단 전체 입력");

		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
			}
		}

	}
}
