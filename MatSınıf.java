package Projeler;

public class MatSınıf {

	public static void main(String[] args) {

		System.out.println(Math.PI);
		System.out.println(Math.pow(2, 10));
		System.out.println(benimPow(2, 10));
		System.out.println("Math.round(2.45): " + Math.round(2.45));
		System.out.println("Math.round(2.65): " + Math.round(2.65));
		System.out.println("(int) 2.45: " + (int) 2.45);
		System.out.println("(int) 2.99: " + (int) 2.99);
		System.out.println("(int) 2.45: " + (int) (2.45 + 0.5));
		System.out.println(Math.sqrt(81)); // karekökünü alır
		System.out.println(Math.sqrt(345));
		System.out.println("Math.floor(3.99): " + Math.floor(3.99)); // taban değer
		System.out.println("Math.ceil(3.45): " + Math.ceil(3.45));
		System.out.println("Benim.floor(3.99): " + (int) (3.99));
		System.out.println("Benim.ceil(3.45): " + (int) (3.45 + 1));
		System.out.println("Max: " + Math.max(3, 8));
		System.out.println("Min: " + Math.min(3, 8));
		System.out.println("Benim Max: " + BenimMax(3, 8));
		System.out.println("Benim Min: " + BenimMin(3, 8));

	}

	private static int BenimMin(int i, int j) {
		int min = 0;
		if (i < j) {
			min = i;
		} else
			min = j;
		return min;

	}

	private static int BenimMax(int i, int j) {
		int max = (i > j) ? i : j;
		return max;

		/*
		 * int max=0; if(i<j) { max=j; } else max=i; return max;
		 */

	}

	private static int benimPow(int i, int j) {
		int carpim = 1;
		for (int k = 1; k <= j; k++) {
			carpim *= i;
		}
		return carpim;
	}

}
