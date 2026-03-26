package sadds;

public class Diziler1 {

	public static void main(String[] args) {

		int sayilar[] = new int[5];
		sayilar[0] = 25;
		sayilar[3] = 51;
		sayilar[4] = 60;

		System.out.println("sayilar: " + sayilar);
		System.out.println("sayilar[3]: " + sayilar[3]);
		System.out.println("Dizinin uzunluğu: " + sayilar.length);

		for (int i = 0; i < sayilar.length; i++) {
			System.out.println("sayilar[" + i + "]=" + sayilar[i]);
		}

	}

}
