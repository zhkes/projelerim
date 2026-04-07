import java.util.ArrayList;
import java.util.Scanner;

public class Fonksiyon {

	public static Scanner giris = new Scanner(System.in);
	private static ArrayList<String> adi = new ArrayList<String>();
	private static ArrayList<String> cesit = new ArrayList<String>();
	private static ArrayList<Integer> fiyat = new ArrayList<Integer>();
	private static ArrayList<Integer> miktar = new ArrayList<Integer>();

	public static byte Menugoruntule() {
		System.out.println("0-Çıkış\n1-Kayıt\n2-Çeşit Listele\n3-Düzeltme\n4-silme\n5-Ürün satış\n6Ürün Alış");
		return giris.nextByte();
	}

	public static void Kayit() {
		System.out.println("Ürün adı giriniz");
		adi.add(giris.next());
		System.out.println("çeşidi giriniz");
		cesit.add(giris.next());
		System.out.println("Ürün miktarı giriniz");
		miktar.add(giris.nextInt());
		System.out.println("Ürün Birim fiyatı giriniz");
		fiyat.add(giris.nextInt());
	}

	public static void CesitListele() {
		System.out.println("Listelenecek çeşidi giriniz");
		String listeCesit = giris.next();
		for (int i = 0; i < adi.size(); i++) {
			if (cesit.get(i).equalsIgnoreCase(listeCesit)) {
				System.out.println("Ürün adı : " + adi.get(i));
				System.out.println("Ürün miktarı : " + miktar.get(i));
				System.out.println("Ürün fiyatı : " + fiyat.get(i));
			}
		}
	}

	public static void Duzeltme() {
		System.out.println("Düzeltilecek ürün adını giriniz");
		String duzeltAd = giris.next();
		System.out.println("İndis     Ürün adı");
		for (int i = 0; i < adi.size(); i++) {
			if (adi.get(i).equalsIgnoreCase(duzeltAd)) {
				System.out.printf("%d%10s\n", i, adi.get(i));
			}
		}
		System.out.println("Düzeltilecek indis değeri : ");
		int indis = giris.nextInt();
		System.out.println("Yeni adı gir : ");
		adi.set(indis, duzeltAd);
		System.out.println("Yeni çeşidi giriniz");
		cesit.set(indis, giris.next());
		System.out.println("Yeni Ürün miktarı giriniz");
		miktar.set(indis, giris.nextInt());
		System.out.println("Yeni Ürün Birim fiyatı giriniz");
		fiyat.set(indis, giris.nextInt());
	}

	public static void Silme() {
		System.out.println("Silinecek ürün adını giriniz");
		String silAd = giris.next();
		System.out.println("İndis     Ürün adı");
		for (int i = 0; i < adi.size(); i++) {
			if (adi.get(i).equalsIgnoreCase(silAd)) {
				System.out.printf("%d%10s\n", i, adi.get(i));
			}
		}
		System.out.println("Silinecek indis değeri : ");
		int indis = giris.nextInt();
		adi.remove(indis);
		cesit.remove(indis);
		miktar.remove(indis);
		fiyat.remove(indis);
	}

	public static void UrunSatis() {
		// TODO Auto-generated method stub

	}

	public static void UrunAlis() {
		// TODO Auto-generated method stub

	}
}
