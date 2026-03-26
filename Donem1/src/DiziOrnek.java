package sadds;

import java.util.Scanner;

public class DiziOrnek {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		String ad;
		
		System.out.println("İsminizi giriniz: ");
		ad= giris.next();

		System.out.println("Kaç kişi için vize notu gireceksiniz?: ");
		byte vn = giris.nextByte();

		int sayilarv[] = new int[vn];

		for (int i = 0; i < vn; i++) {
			System.out.println((i + 1) + ". kişinin vize notunu giriniz: ");
			sayilarv[i] = giris.nextInt();
		}
		System.out.println("Kaç kişi için final notu gireceksiniz?: ");
		byte fn = giris.nextByte();

		int sayilarf[] = new int[fn];

		for (int i = 0; i < fn; i++) {
			System.out.println((i + 1) + ". kişinin final notunu giriniz: ");
			sayilarf[i] = giris.nextInt();
		}

		int toplamv = 0;
		for (int i = 0; i < sayilarv.length; i++) {
			toplamv += sayilarv[i];
		}

		int toplamf = 0;
		for (int i = 0; i < sayilarv.length; i++) {
			toplamf += sayilarf[i];
		}
		System.out.println("Vize notu ortalaması: " + toplamv / vn);
		System.out.println("Final notu ortalaması: " + toplamf / fn);

		int enbv = sayilarv[0];
		for (int i = 0; i < vn; i++) {
			if (sayilarv[i] > enbv)
				enbv = sayilarv[i];
		}
		System.out.println("En yüksek vize notu: " + enbv);

		int enkv = sayilarv[0];
		for (int i = 0; i < vn; i++) {
			if (sayilarv[i] < enkv)
				enkv = sayilarv[i];
		}
		System.out.println("En düşük vize notu: " + enkv);

		int enbf = sayilarf[0];
		for (int i = 0; i < vn; i++) {
			if (sayilarf[i] > enbf)
				enbv = sayilarf[i];
		}
		System.out.println("En yüksek final notu: " + enbf);

		int enkf = sayilarf[0];
		for (int i = 0; i < vn; i++) {
			if (sayilarf[i] < enkf)
				enkf = sayilarf[i];
		}
		System.out.println("En düşük final notu: " + enkf);

	}

}
