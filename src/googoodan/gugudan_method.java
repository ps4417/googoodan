package googoodan;

public class gugudan_method {

	// 단을 의미하는 calculate 함수
	public static int[] calculate(int times) {
		int[] result = new int[9];
		for (int i = 0; i < result.length; i++) {
			result[i] = times * (i + 1);
		}
		return result;
	}

	// 단에 곱해지는 수들을 출력하는 print 함수
	public static void print(int[] result) {
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

	public static void main(String[] args) {
		for (int i = 2; i < 10; i++) {
			int[] result = calculate(i);
			print(result);
		}

	}

}
