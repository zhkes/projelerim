import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Kutuphane {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.println("Kaç kitap gireceksiniz?");
		byte ks = giris.nextByte();
		String kitapAd[] = new String[ks];
		String yazarAd[] = new String[ks];
		String yevAd[] = new String[ks];
		short sayfaSayisi[] = new short[ks];
		short fiyat[] = new short[ks];
		for (int i = 0; i < fiyat.length; i++) {
			System.out.print((i + 1) + ".kitap adı girin : ");
			kitapAd[i] = giris.nextLine();

			System.out.print((i + 1) + ".Yazar adı girin : ");
			yazarAd[i] = giris.next();
			System.out.println((i + 1) + ".yayın evi adı girin : ");
			yevAd[i] = giris.next();
			System.out.println((i + 1) + ".Sayfa sayısı : ");
			sayfaSayisi[i] = giris.nextShort();
			System.out.println((i + 1) + ".fiyatı : ");
			fiyat[i] = giris.nextShort();
		}
		while (true) {
			byte menu = MenuGoruntule(giris);
			switch (menu) {
			case 1:
				Listele(kitapAd, yazarAd, yevAd, sayfaSayisi, fiyat);
				break;
			case 2:
				System.out.println("Aranacak kitap adı gir:");
				String arananAd = giris.next();
				KitapArama(arananAd, kitapAd, yazarAd, yevAd, sayfaSayisi, fiyat);
				break;
			case 3:
				System.out.println("Sayfa sayısı ortalaması : " + Ortalama(sayfaSayisi));
				System.out.println("Fiyat ortalaması : " + Ortalama(fiyat));
				break;
			case 4:
				System.out.println("Sayfa sayısı En büyüğü : " + EnBuyuk(sayfaSayisi));
				System.out.println("Fiyat En Büyüğü : " + EnBuyuk(fiyat));
				break;
			case 5:
				System.out.println("Sayfa sayısı En küçüğü : " + EnKucuk(sayfaSayisi));
				System.out.println("Fiyat En Küçüğü : " + EnKucuk(fiyat));
				break;
			case 6:EnBuyukFiyat(kitapAd, yazarAd, yevAd, sayfaSayisi, fiyat);break;
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

	private static void EnBuyukFiyat(String[] kitapAd, String[] yazarAd, String[] yevAd, short[] sayfaSayisi,
			short[] fiyat) {
		short enBuyukFiyat=EnBuyuk(fiyat);
		for (int i = 0; i < fiyat.length; i++) {
			if(fiyat[i]==enBuyukFiyat) {
				System.out.println("Kitap adı : " + kitapAd[i]);
				System.out.println("yazar adı : " + yazarAd[i]);
				System.out.println("Yayın Evi adı : " + yevAd[i]);
				System.out.println("Sayfa sayısı : " + sayfaSayisi[i]);
				System.out.println("Kitap fiyatı : " + fiyat[i]);
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
		int toplam=0;
		for (int i = 0; i < sayilar.length; i++) {
			toplam+=sayilar[i];
		}
		return (short) (toplam/sayilar.length);
	}

	private static void KitapArama(String arananAd, String[] kitapAd, String[] yazarAd, String[] yevAd,
			short[] sayfaSayisi, short[] fiyat) {
		for (int i = 0; i < fiyat.length; i++) {
			if (arananAd.equalsIgnoreCase(kitapAd[i])) {
				System.out.println("Kitap adı : " + kitapAd[i]);
				System.out.println("yazar adı : " + yazarAd[i]);
				System.out.println("Yayın Evi adı : " + yevAd[i]);
				System.out.println("Sayfa sayısı : " + sayfaSayisi[i]);
				System.out.println("Kitap fiyatı : " + fiyat[i]);
			}
		}
	}

	private static void Listele(String[] kitapAd, String[] yazarAd, String[] yevAd, short[] sayfaSayisi,
			short[] fiyat) {
		for (int i = 0; i < fiyat.length; i++) {
			System.out.println("Kitap adı : " + kitapAd[i]);
			System.out.println("yazar adı : " + yazarAd[i]);
			System.out.println("Yayın Evi adı : " + yevAd[i]);
			System.out.println("Sayfa sayısı : " + sayfaSayisi[i]);
			System.out.println("Kitap fiyatı : " + fiyat[i]);
		}
	}

	private static byte MenuGoruntule(Scanner giris) {
		System.out.println("1-Listeleme\n2-İsim Arama\n3-Ortalama\n4-en Büyük\5-En Küçük\n6-Çıkış");
		byte menu = giris.nextByte();
		return menu;
	}
}
