import java.util.Scanner;

public class SquareArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//14th of October//
		
		
		
		Scanner klavye = new Scanner(System.in);

		String ad;

		byte kk, uk;
		int alan;

		System.out.println("Kısa Kenar Uzunluğunu Giriniz: ");
		kk = klavye.nextByte();
		System.out.println("Uzun Kenar Uzunluğunu Giriniz: ");
		uk = klavye.nextByte();
		alan = (kk * uk);

		System.out.println("Karenin Alanı: " + alan);

		/*
		 * System.out.println("Karenin Alanını Hesaplama"); System.out.println("");
		 * 
		 * byte kısaKenar = 13, uzunKenar = 5;
		 * 
		 * System.out.println("Kısa kenar * Uzun Kenar");
		 * System.out.println("    13     *      5    ");
		 * 
		 * byte kareninAlanı = (byte) (kısaKenar * uzunKenar);
		 * 
		 * System.out.println("");
		 * 
		 * System.out.println("Karenin Alanı=" + kareninAlanı);
		 */

	}

}
