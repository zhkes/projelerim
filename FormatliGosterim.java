package Projeler;

public class FormatliGosterim {

	public static void main(String[] args) {

		String ad = "Hilal";
		int sInt = 25;
		byte vNot = 67;

		float sFloat = (float) 2.45;
		double sDouble = 3.4567;

		// %-20s: Sola yasla ve 20 karakterlik alan ayır
		// %d: Tam sayı yazdır, %n: Yeni satıra geç

		System.out.printf("%-20s'in numarası %d %nVize Notu %d%n", ad, sInt, vNot);

		// %-20.2f: Sola yasla, 20 alan ayır, virgülden sonra 2 basamak göster
		// %-15.2f: Sola yasla, 15 alan ayır, virgülden sonra 2 basamak göster

		System.out.printf("Float sayi: %-20.2fDouble sayı: %-15.2f", sFloat, sDouble);

	}

}
