public class Test04 {
	public static void main(String[] args) {

		int result = factorial(1000000);
		System.out.println(result);
	}

	private static int factorial(int n) {
		if (n <= 1) {
			return n;
		} else if (n <= 0 || n >= 20) { // Stack Overflow 방지
			return -1;
		} else {
			return factorial(n - 1) * n;
		}
	}

}
