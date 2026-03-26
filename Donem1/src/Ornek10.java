package sadds;

import java.util.Scanner;

public class Ornek10 {

	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);
		System.out.println("Kaç sayı gireceksiniz?: ");
		byte ks = klavye.nextByte();
		int sayi, cs = 0, ct = 0, ts = 0, tt = 0;
		for (int i = 1; i <= ks; i++) {
			System.out.println(i + "Sayı giriniz");
			sayi = klavye.nextInt();
			if (sayi % 2 == 0) {
				cs++;
				ct += sayi;

			} else {
				ts++;
				tt += sayi;
			}

			System.out.println("teklerin sayısı " + ts);
			System.out.println("teklerin toplamı " + tt);
			System.out.println("teklerin ortalaması " + (tt / ts));
			System.out.println("çiftlerin sayısı " + cs);
			System.out.println("çiftlerin toplamı " + ct);
			System.out.println("çiftlerin ortalaması " + (ct / cs));
			System.out.println("tüm sayıların toplamı " + (tt + ct));
			System.out.println("tüm sayıların ortalaması " + (tt + ct) / ks);

		}

	}

}
