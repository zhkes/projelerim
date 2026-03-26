package sadds;

import java.util.Iterator;
import java.util.Scanner;

public class Sayilar {

	public static void main(String[] args) {

		Scanner giris = new Scanner(System.in);

		System.out.println("Kaç sayı gireceksiniz?: ");
		byte ks = giris.nextByte();

		// dizi tanımı

		int[] sayilar = new int[ks];
		// diziye deger aktarma

		for (int i = 0; i < ks; i++) {
			System.out.println((i + 1) + ". sayıyı gir: ");
			sayilar[i] = giris.nextInt();
		}
		// listeleme

		for (int i = 0; i < ks; i++) {
			System.out.println("sayilar[" + i + "]=" + sayilar[i]);

		}

		int toplam = 0;
		for (int i = 0; i < sayilar.length; i++) {
			toplam += sayilar[i];
		}

		System.out.println(ks + "sayının toplamı: " + toplam);
		int ortalama = toplam / ks;
		System.out.println(ks + "sayının ortalaması: " + ortalama);

		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i] > ortalama)
				System.out.println("sayilar[" + i + "]=" + sayilar[i]);
		}

		// en küçük
		int enk = sayilar[0];
		for (int i = 0; i < ks; i++) {
			if (sayilar[i] < enk)
				enk = sayilar[i];
		}

		System.out.println("Dizinin en küçük elemanı: " + enk);

		// en büyük
		int enb = sayilar[0];
		for (int i = 0; i < ks; i++) {
			if (sayilar[i] > enb)
				enb = sayilar[i];
		}
		System.out.println("Dizinin en büyük elemanı: " + enb);
		

	}

}
