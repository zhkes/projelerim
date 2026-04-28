package kisi;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner giris=new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<Ogrenci> ogrenciler=new ArrayList<Ogrenci>();
		ArrayList<Calisan> calisanlar=new ArrayList<Calisan>();
		while(true) {
			byte menu=Menuler();
			switch (menu) {
			case 0:System.out.println("Program bitti");
				System.exit(0);
				break;
			case 1:kayitOgrenci(ogrenciler);break;
			case 2:kayitCalisan(calisanlar);break;
			case 3:listeleOgrenci(ogrenciler);break;
			case 4:listeleCalisan(calisanlar);break;
			case 5:Ortalamalar(calisanlar);
			case 6:OgrenciSilme(ogrenciler);
			default:
				break;
			}
		}
	}
	private static void OgrenciSilme(ArrayList<Ogrenci> ogrenciler) {
		System.out.println("Silinecek numara");
		String silnumara=giris.next();
		for (Ogrenci ogrenci : ogrenciler) {
			if(ogrenci.getNumara().equalsIgnoreCase(silnumara)) {
				ogrenciler.remove(ogrenci); break;
			}
		}
		
	}
	private static void Ortalamalar(ArrayList<Calisan> calisanlar) {
		int toplamYas=0,toplamMaas=0,toplamCalistigiYil=0;
		for (Calisan calisan : calisanlar) {
			toplamYas+=calisan.getYas();
			toplamMaas+=calisan.getMaas();
			toplamCalistigiYil+=calisan.getCalistigiYil();
		}
		System.out.println("Maaş Ortalaması : "+toplamMaas/calisanlar.size());
		System.out.println("Yaş Ortalaması : "+toplamYas/calisanlar.size());
		System.out.println("Çalıştığı yıl Ortalaması : "+toplamCalistigiYil/calisanlar.size());
	}
	private static void listeleCalisan(ArrayList<Calisan> calisanlar) {
		for (Calisan calisan : calisanlar) {
			//System.out.println(calisan);
			calisan.bilgiGoster();
		}
		
	}
	private static void listeleOgrenci(ArrayList<Ogrenci> ogrenciler) {
		for (Ogrenci ogrenci : ogrenciler) {
			//System.out.println(ogrenci);
			ogrenci.bilgiGoster();
		}
		
	}
	private static void kayitCalisan(ArrayList<Calisan> calisanlar) {
		System.out.println("İsim giriniz : ");
		String ad=giris.next();
		System.out.println("Soyad giriniz : ");
		String soyad=giris.next();
		System.out.println("yaş giriniz : ");
		int yas=giris.nextInt();
		System.out.println("Maaş giriniz : ");
		int maas=giris.nextInt();
		System.out.println("Çalıştığı yıl giriniz : ");
		int calistigiYil=giris.nextInt();
		//Calisan cls=new Calisan(ad, soyad, yas, maas, calistigiYil);
		//calisanlar.add(cls);
		calisanlar.add(new Calisan(ad, soyad, yas, maas, calistigiYil));
	}
	private static void kayitOgrenci(ArrayList<Ogrenci> ogrenciler) {
		System.out.println("İsim giriniz : ");
		String ad=giris.next();
		System.out.println("Soyad giriniz : ");
		String soyad=giris.next();
		System.out.println("yaş giriniz : ");
		int yas=giris.nextInt();
		System.out.println("Numara giriniz : ");
		String numara=giris.next();
		System.out.println("Bölüm giriniz : ");
		String bolum=giris.next();
		ogrenciler.add(new Ogrenci(ad, soyad, yas, numara,bolum));
		
	}
	private static byte Menuler() {
		System.out.println("0-Çıkış\n1-Öğrenci giriş\n2-Çalışan giriş\n3-Öğrenci Listele\n4-Çalışan Listele\n5-Ortalama\n6-Öğrenci Silme\n7-Öğrenci düzeltme");
		return giris.nextByte();
	}

}
