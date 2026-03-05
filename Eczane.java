import java.util.Scanner;

public class Eczane {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.println("Kaç ilaç girilecek:");
		byte is = giris.nextByte();
		String ilacAdi[] = new String[is];
		String firmaAdi[] = new String[is];
		String turu[] = new String[is];
		short miktar[] = new short[is];
		short birimFiyat[] = new short[is];
		for (int i = 0; i < is; i++) {
			System.out.println((i + 1) + ". ilacın adı:");
			ilacAdi[i] = giris.next();
			System.out.println((i + 1) + ". ilacın firma adı:");
			firmaAdi[i] = giris.next();
			System.out.println((i + 1) + ". ilacın türü:");
			turu[i] = giris.next();
			System.out.println((i + 1) + ". ilacın Miktarı:");
			miktar[i] = giris.nextShort();
			System.out.println((i + 1) + ". ilacın Birim fiyatı:");
			birimFiyat[i] = giris.nextShort();
		}
		byte menu;
		for (;;) {
			menu = MenuGoruntule(giris);
			switch (menu) {
			case 1:
				Listeleme(ilacAdi, firmaAdi, turu, miktar, birimFiyat);
				break;
			case 2:
				AdArama(giris, ilacAdi, firmaAdi, turu, miktar, birimFiyat);
				break;
			case 3:
				System.out.println("Birim Fiyat ortalaması : " + Ortalama(birimFiyat));
				System.out.println("Miktar ortalaması : " + Ortalama(miktar));
				break;
			case 4:
				System.out.println("Birim Fiyat En Büyük : " + EnBuyuk(birimFiyat));
				System.out.println("Miktar En Büyük : " + EnBuyuk(miktar));
				break;
			case 5:
				System.out.println("Birim Fiyat En Küçük : " + EnKucuk(birimFiyat));
				System.out.println("Miktar En Küçük : " + EnKucuk(miktar));
				break;
			case 6:EnBuyukFiyatliIlac(ilacAdi, firmaAdi, turu, miktar, birimFiyat);break;
			case 7:
				System.out.println("Program bitti");
				System.exit(0);
				break;
			default:
				System.out.println("Yanlış menü değeri");
				break;
			}
		}

	}

	private static void EnBuyukFiyatliIlac(String[] ilacAdi, String[] firmaAdi, String[] turu, short[] miktar,
			short[] birimFiyat) {
		short enbFiyat=EnBuyuk(birimFiyat);
		for (int i = 0; i < birimFiyat.length; i++) {
			if(birimFiyat[i]==enbFiyat) {
				System.out.println("İlaç adı : " + ilacAdi[i]);
				System.out.println("Firma adı : " + firmaAdi[i]);
				System.out.println("İlaç türü : " + turu[i]);
				System.out.println("İlaç Miktarı : " + miktar[i]);
				System.out.println("İlaç Birim Fiyatı : " + birimFiyat[i]);
			}
		}
	}

	private static short EnKucuk(short[] sayilar) {
		short enk=sayilar[0];
		for (int i = 1; i < sayilar.length; i++) {
			if(sayilar[i]<enk) enk=sayilar[i];
		}
		return enk;
	}

	private static short EnBuyuk(short[] sayilar) {
		short enb=sayilar[0];
		for (int i = 1; i < sayilar.length; i++) {
			if(sayilar[i]>enb) enb=sayilar[i];
		}
		return enb;
	}

	private static short Ortalama(short[] sayilar) {
		int toplam = 0;
		for (int i = 0; i < sayilar.length; i++) {
			toplam += sayilar[i];
		}
		return (short) (toplam / sayilar.length);
	}

	private static void AdArama(Scanner giris, String[] ilacAdi, String[] firmaAdi, String[] turu, short[] miktar,
			short[] birimFiyat) {
		System.out.println("Aranacak ilaç adı giriniz : ");
		String arananIlac = giris.next();
		for (int i = 0; i < birimFiyat.length; i++) {
			if (ilacAdi[i].equalsIgnoreCase(arananIlac)) {
				System.out.println("İlaç adı : " + ilacAdi[i]);
				System.out.println("Firma adı : " + firmaAdi[i]);
				System.out.println("İlaç türü : " + turu[i]);
				System.out.println("İlaç Miktarı : " + miktar[i]);
				System.out.println("İlaç Birim Fiyatı : " + birimFiyat[i]);
			}
		}

	}

	private static void Listeleme(String[] ilacAdi, String[] firmaAdi, String[] turu, short[] miktar,
			short[] birimFiyat) {
		for (int i = 0; i < birimFiyat.length; i++) {
			System.out.println("İlaç adı : " + ilacAdi[i]);
			System.out.println("Firma adı : " + firmaAdi[i]);
			System.out.println("İlaç türü : " + turu[i]);
			System.out.println("İlaç Miktarı : " + miktar[i]);
			System.out.println("İlaç Birim Fiyatı : " + birimFiyat[i]);
		}
	}

	private static byte MenuGoruntule(Scanner giris) {
		System.out.println(
				"1-Listeleme\n2-Ad arama\n3-Ortalama\n4-En büyükler\n5-en küçükler\n6-En büyük fiyatlı ilaç\n7-Çıkış");
		/*
		 * byte menu=giris.nextByte(); return menu;
		 */
		return giris.nextByte();
	}
}
