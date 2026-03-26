package Projeler;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Hafta7Ornek {

	static Scanner giris = new Scanner(System.in);
	static ArrayList<String> ad = new ArrayList<String>();
	static ArrayList<Boolean> medeniDurum = new ArrayList<Boolean>();
	static ArrayList<Byte> cocukSayisi = new ArrayList<Byte>();
	static ArrayList<Integer> brutMaas = new ArrayList<Integer>();
	static ArrayList<Integer> netMaas = new ArrayList<Integer>();

	public static byte Menu() {
		System.out.println(
				"1-Veri Giriş\n2-Listeleme\n3-İsim Arama\n4-Ortalama\n5-Medeni Durum Bilgisi\n6-Kayıt Düzeltme\n7-Silme\n8-Çıkış");
		return giris.nextByte();
	}

	public static void KayitGiris() {

		System.out.println("İsim Giriniz: ");
		ad.add(giris.next());
		boolean evlimi = MedeniDurumAl();
		medeniDurum.add(evlimi);
		System.out.println("Çocuk Sayısı Giriniz: ");
		byte cSayi = giris.nextByte();
		cocukSayisi.add(cSayi);
		System.out.println("Brüt Maaşınızı Giriniz: ");
		int bmaas = giris.nextInt();
		if (evlimi)
			bmaas += 5000;
		bmaas += cSayi * 2500;
		brutMaas.add(bmaas);
		netMaas.add((int) (bmaas - bmaas * 0.25));

	}

	private static boolean MedeniDurumAl() {

		System.out.println("Medeni Durumunuzu Giriniz(E/B)");
		String veri = giris.next().toUpperCase();
		char karakter = veri.charAt(0);
		if (karakter == 'E')
			return true;
		else if (karakter == 'B')
			return false;
		else
			System.out.println("Hatalı Giriş!!");
		return false;
	}

	public static void Listele() {

		System.out.println("Ad                Medeni Durum   Çocuk Sayısı  Brüt Maaş  Net Maaş");
		System.out.println();
		for (int i = 0; i < ad.size(); i++) {

			String durum = (medeniDurum.get(i)) ? "Evli" : "Bekar";

			/*
			 * if (medeniDurum.get(i)=="Evli"; else durum="Bekar";
			 */
			System.out.printf("%-16s%3s%15d%15d%10d%n", ad.get(i), durum, cocukSayisi.get(i), brutMaas.get(i),
					netMaas.get(i));
		}

	}

	public static void IsimArama() {

		System.out.println("Aranacak İsmi Giriniz: ");
		String arananAd = giris.next();
		for (int i = 0; i < ad.size(); i++) {
			if (arananAd.equalsIgnoreCase(ad.get(i))) {

				System.out.println("İsim: " + ad.get(i));
				System.out.println("Medeni Durum: " + medeniDurum.get(i));
				System.out.println("Çocuk Sayısı: " + cocukSayisi.get(i));
				System.out.println("Brüt Maaş: " + brutMaas.get(i));
				System.out.println("Net Maaş: " + netMaas.get(i));

			}

		}

	}

	public static void Ortalama() {

		int toplam = 0;

		for (int i = 0; i < cocukSayisi.size(); i++) {

			toplam += cocukSayisi.get(i);
		}
		int ort = toplam / cocukSayisi.size();

		System.out.println("Ortalama Çocuk Sayısı: " + ort);
	}

	public static void EvliBilgisi() {
		System.out.println("Aranan ismi giriniz: ");
		String arananAd = giris.next();

		for (int i = 0; i < ad.size(); i++) {

			if (arananAd.equalsIgnoreCase(ad.get(i))) {

				boolean evliMi = true;

				if (evliMi) {
					System.out.println("Evli");
				} else {
					System.out.println("Bekar");
				}
			}
		}
	}

	public static void KayitDuzeltme() {

		System.out.println("Düzeltilecek ismi giriniz: ");
		String duzeltilen = giris.next();
		int indis = ad.indexOf(duzeltilen);
		System.out.println("Yeni İsim Giriniz: ");
		String isim = giris.next();
		ad.set(indis, isim);
		System.out.println("Medeni Durumu Giriniz: ");
		boolean md = giris.nextBoolean();
		medeniDurum.set(indis, md);
		System.out.println("Çocuk Sayısını Giriniz: ");
		Byte cs = giris.nextByte();
		cocukSayisi.set(indis, cs);
		System.out.println("Brüt maaşını giriniz: ");
		int bm = giris.nextInt();
		brutMaas.set(indis, bm);

	}

	public static void KayitSilme() {

		System.out.println("Silinecek ismi gitiniz: ");
		String isim = giris.next();
		int indis = ad.indexOf(isim);
		ad.remove(indis);
		medeniDurum.remove(indis);
		cocukSayisi.remove(indis);
		brutMaas.remove(indis);
		netMaas.remove(indis);

	}

}
