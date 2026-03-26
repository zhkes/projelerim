import java.util.Scanner;

public class KareDikdortgen {

	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);

		int kenar1, kenar2, cevre, alan;

		System.out.println("kenar 1 değerini giriniz: ");
		kenar1 = klavye.nextInt();
		System.out.println("kenar 2 değerini gitiniz: ");
		kenar2 = klavye.nextInt();

		if (kenar1 == kenar2) {

			System.out.println("Bu bir karedir.");
			cevre = (int) (kenar1 * 4);
			alan = kenar1 * kenar2;

			System.out.println("Karenin Çevresi: " + cevre);
			System.out.println("Karenin Alanı: " + alan);
		}

		else {
			System.out.println("Bu bir dikdörtgendir.");
			cevre = (kenar1 + kenar2) * 2;
			alan= kenar1*kenar2;

			System.out.println("Dikdörtgenin Çevresi: " + cevre);
			System.out.println("Dikdörtgenin Alanı: " + alan);

		}
	}

}
