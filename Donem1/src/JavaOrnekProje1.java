package sadds;

import java.util.Scanner;

public class JavaOrnekProje1 {

	public static void main(String[] args) {

		Scanner giris = new Scanner(System.in);
		System.out.println("Kişi sayısı: ");
		byte ks = giris.nextByte();
		String ad[] = new String[ks];
		int maas[] = new int[ks];
		int harcama[] = new int[ks];

		byte menu;
		for (int i = 0; i < ks; i++) {
			System.out.println((i + 1) + ". kişinin adını giriniz: ");
			ad[i] = giris.next();
			System.out.println("Maaşı gir: ");
			maas[i] = giris.nextInt();
			System.out.println("Harcamayı gir: ");
			harcama[i] = giris.nextInt();

		}

		// menu oluşturma

		for (;;) {
			System.out.println("1-Listeleme\n2-Borçluların listesi\n3-Ortalamalar\n4-En Büyük\n5-En küçük\n6-Çıkış");
			menu = giris.nextByte();
			
			switch (menu) {
			case 1:
				for (int i = 0; i < ks; i++) {
					System.out.println("ad");
					System.out.println("maas");
					System.out.println("harcama");
				}
				break;
				
			case 2:
				for (int i = 0; i < harcama.length; i++) {
					System.out.println("ad");
					System.out.println("maas");
					System.out.println("harcama");
				}

			case 3:
				int maasToplam = 0;
				for (int i = 0; i < ks; i++) {
					maasToplam += maas[i];
				}
				System.out.println("Maaş Ortalaması: " + maasToplam / ks);

				int harcamaToplam = 0;
				for (int i = 0; i < ks; i++) {
					harcamaToplam += harcama[i];
				}
				System.out.println("Harcama Ortalaması: " + harcamaToplam / ks);
				break;

			case 4:
				int enbMaas = maas[0];
				for (int i = 0; i < ks; i++) {
					if (maas[i] > enbMaas)
						enbMaas = maas[i];
				}
				System.out.println("En büyük maaş değeri: " + enbMaas);

				int enbHarcama = harcama[0];
				for (int i = 0; i < ks; i++) {
					if (harcama[i] > enbHarcama)
						enbHarcama = harcama[i];

				}
				System.out.println("En büyük harcama değeri: " + enbHarcama);

			default:
				System.out.println("Yanlış menü değeri.");
				break;

			}

		}

	}
}
