public class Test03 {
	public static void main(String[] args) {

		int result = factorial(4);
		System.out.println(result);
	}

	private static int factorial(int n) {
		if (n <= 1) {
			return n;
		} else {
			return factorial(n - 1) * n;
		}
	}

}
