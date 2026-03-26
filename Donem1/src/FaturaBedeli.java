import java.util.Scanner;

public class FaturaBedeli {

		Scanner klavye = new Scanner(System.in);

		System.out.println("Kaç kişi için fatura bedeli hesaplayacaksınız?");
		byte ks = klavye.nextByte();
		String ad[] = new String[ks];
		int sms[] = new int[ks];
		int internet[] = new int[ks];
		int dakika[] = new int[ks];
		System.out.println("\n");
		
		byte menu;
		if (ks == 1) {
			System.out.println("Kişinin adını giriniz: ");
			int i = 0;
			ad[i] = klavye.next();
			System.out.println("Kullandığı sms sayısı: ");
			sms[i] = klavye.nextInt();
			System.out.println("Kullandığı internet sayısı: ");
			internet[i] = klavye.nextInt();
			System.out.println("Kullandığı dakika sayısı: ");
			dakika[i] = klavye.nextInt();
			System.out.println("\n");
		} else {
			for (int i = 0; i < ks; i++) {
				System.out.println((i + 1) + ". kişinin adını giriniz: ");
				ad[i] = klavye.next();
				System.out.println("Kullandığı sms sayısı: ");
				sms[i] = klavye.nextInt();
				System.out.println("Kullandığı internet sayısı(GB): ");
				internet[i] = klavye.nextInt();
				System.out.println("Kullandığı dakika sayısı:  ");
				dakika[i] = klavye.nextInt();
				System.out.println("\n");
			}
		}
		
		for (;;) {
			System.out.println("1-Kişiler\n2-Sms ücretleri\n3-İnternet ücretleri\n4-Dakika ücretleri\n5-Toplam fatura bedeli");
			System.out.println("\n");
			menu = klavye.nextByte();
			
			switch (menu) {
			case 1:
				for (int i = 0; i < ks; i++) {
					System.out.println((i + 1) + ". Kişi: " + ad[i]);
					System.out.println("\n");
				}
				break;
				
			case 2:
				for (int i = 0; i < ks; i++) {
					System.out.println((i + 1) + ". sms ücreti: " + (sms[i] * 0.6));
					System.out.println("\n");
				}
				break;
				
			case 3:
				for (int i = 0; i < ks; i++) {
					System.out.println((i + 1) + ". internet üceti: " + (internet[i] * 20));
					System.out.println("\n");
				}
				break;
				
			case 4:
				for (int i = 0; i < ks; i++) {
					System.out.println((i + 1) + ". dakika ücreti: " + (dakika[i] * 0.2));
					System.out.println("\n");
				}
				break;
				
			case 5:
				for (int i = 0; i < ks; i++) {
					System.out.println((i + 1) + ". sms ücreti: " + (sms[i] * 0.6));
					System.out.println((i + 1) + ". internet üceti: " + (internet[i] * 20));
					System.out.println((i + 1) + ". dakika ücreti: " + (dakika[i] * 0.2));
					System.out.println("\n");
				}
				break;
				
			default:
				System.out.println("Yanlış menü değeri!!");
				break;
			}

		}
	}

}
