
public class Calculation {
		
		Scanner klavye = new Scanner(System.in);

		System.out.println("Kaç ilaç ekleyeceksiniz");

		byte is = klavye.nextByte();
		String ad[] = new String[is];
		String tur[] = new String[is];
		String amac[] = new String[is];
		int ucret[]=new int[is];
		System.out.println("\n");

		byte menu;
		for (int i = 0; i < is; i++) {
			System.out.println((i + 1) + ". ilacın adını giriniz: ");
			ad[i] = klavye.next();
			System.out.println("ilacın türü: ");
			tur[i] = klavye.next();
			System.out.println("ilaç ne için kullanılır?: ");
			amac[i] = klavye.next();
			System.out.println("İlaç ücreti: ");
			ucret[i]=klavye.nextInt();
			System.out.println("\n");
		}

		// adı girerken neden boşluk kullanılamıyor?

		for (;;) {

			System.out.println(
					"1-İlaç adlarını listeleme\n2-İlaçların türlerini listeleme\n3-İlaçları ne için kullanıldığını listeleme\n4-İlaçların ücretlerini listeleme\n5-İlaçla ilgili tüm verileri listeleme");
			System.out.println("\n");
			menu = klavye.nextByte();

			switch (menu) {

			case 1:
				for (int i = 0; i <is; i++) {
					System.out.println((i + 1) + ". İlaç adı: " + ad[i]);
					System.out.println("\n");
				}
				break;

			case 2:
				for (int i = 0; i < is; i++) {
					System.out.println((i + 1) + ". İlaç türü: " + tur[i]);
					System.out.println("\n");

				}
				break;

			case 3:
				for (int i = 0; i < is; i++) {
					System.out.println((i + 1) + ". İlaç ne için kullanılır?: " + amac[i]);
					System.out.println("\n");

				}
				break;
				
			case 4:
				for (int i = 0; i < is; i++) {
					System.out.println("İlacın ücreti: "+ucret[i]);
					System.out.println("\n");
					
				}

			case 5:
				for (int i = 0; i < is; i++) {
					System.out.println((i + 1) + ". İlacvın adı: " + ad[i]);
					System.out.println((i + 1) + ". İlacın türü: " + tur[i]);
					System.out.println((i + 1) + ". İlaç ne için kullanılır?: " + amac[i]);
					System.out.println((i+1)+". İlacın ücreti: "+ucret[i]);
					System.out.println("\n");
				}
				break;

			default:
				System.out.println("Yanlış menü değeri!!");
				break;

}

}
