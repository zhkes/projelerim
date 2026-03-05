
public class Ortalama {

	Scanner klavye = new Scanner(System.in);

		System.out.println("Kütüphaneye kaç kitap kaydedeceksiniz?");
		
		byte ks = klavye.nextByte();
		String ad[] = new String[ks];
		String konu[] = new String[ks];
		int says[] = new int[ks];
		System.out.println("\n");
		
		byte menu;
		for (int i = 0; i < ks; i++) {
			System.out.println((i + 1) + ". kitabın adını giriniz: ");
			ad[i] = klavye.next();
			System.out.println("Kitabın konusu: ");
			konu[i] = klavye.next();
			System.out.println("Sayfa Sayısı: ");
			says[i] = klavye.nextInt();
			System.out.println("\n");
		}
		
		//adı girerken neden boşluk kullanılamıyor?

		for (;;) {

			System.out.println(
					"1-Kitap adlarını listeleme\n2-Kitapların konularını listeleme\n3-Sayfa sayılarını listeleme\n4-Tüm kitapları listele");
			System.out.println("\n");
			menu = klavye.nextByte();

			switch (menu) {

			case 1:
				for (int i = 0; i < ks; i++) {
					System.out.println((i + 1)+". Kitap adı: " +ad[i]);
					System.out.println("\n");
				}
				break;

			case 2:
				for (int i = 0; i < ks; i++) {
					System.out.println((i + 1)+". Kitap konusu: " + konu[i]);
					System.out.println("\n");

				}
				break;

			case 3:
				for (int i = 0; i < ks; i++) {
					System.out.println((i + 1)+". Kitap sayfa sayısı: "+says[i]);
					System.out.println("\n");

				}
				break;

			case 4:
				for (int i = 0; i < ks; i++) {
					System.out.println((i + 1)+". Kitap adı: " + ad[i]);
					System.out.println((i + 1)+". Kitap konusu: " + konu[i] );
					System.out.println((i + 1)+". Kitap sayfa sayısı: "+says[i]);
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
