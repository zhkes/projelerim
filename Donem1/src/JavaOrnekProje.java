package sadds;

import java.util.Scanner;

public class JavaOrnekProje {

	public static void main(String[] args) {

		Scanner giris = new Scanner(System.in);

		String ad;

		System.out.println("Adınızı giriniz: ");
		ad = giris.next();

		System.out.println("Kaç kişinin harcamalarını gireceksiniz?");
		byte hm = giris.nextByte();

		int harcama[] = new int[hm];

		for (int i = 0; i < hm; i++) {
			System.out.println((i + 1) + ". kişinin harcama miktarını giriniz: ");
			harcama[i] = giris.nextInt();
		}

		System.out.println("Kaç kişi için maaş gireceksiniz?");
		byte ms = giris.nextByte();

		int maaslar[] = new int[ms];

		for (int i = 0; i < ms; i++) {
			System.out.println((i + 1) + ". kişinin maaş miktarını giriniz: ");
			maaslar[i] = giris.nextInt();
		}

		System.out.println("--------------------------------------------");

		int toplamh = 0;
		for (int i = 0; i < harcama.length; i++) {
			toplamh += harcama[i];
		}
		System.out.println("Toplam harcama miktarı: " + toplamh);

		int toplamm = 0;
		for (int i = 0; i < maaslar.length; i++) {
			toplamm += maaslar[i];

		}
		System.out.println("Toplam maaş miktarı: " + toplamm);

		System.out.println("Ortalama harcama miktarı: " + toplamh / hm);
		System.out.println("Ortalama maaş miktarı: " + toplamm / hm);

		int enbh = harcama[0];
		for (int i = 0; i < hm; i++) {
			if (harcama[i] > enbh)
				enbh = harcama[i];
		}
		System.out.println("En yüksek harcama miktarı: " + enbh);

		int enkh = harcama[0];
		for (int i = 0; i < hm; i++) {
			if (harcama[i] < enkh)
				enkh = harcama[i];
		}
		System.out.println("En düşük harcama miktarı: " + enkh);

		int enbm = maaslar[0];
		for (int i = 0; i < ms; i++) {
			if (maaslar[i] > enbm)
				enbm = maaslar[i];
		}
		System.out.println("En yüksek maas miktarı: " + enbm);

		int enkm = maaslar[0];
		for (int i = 0; i < ms; i++) {
			if (maaslar[i] < enkm)
				enkm = maaslar[i];
		}
		System.out.println("En düşük maas miktarı: " + enkm);

	}

}
