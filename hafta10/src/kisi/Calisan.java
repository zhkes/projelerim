package kisi;

import java.util.ArrayList;
import java.util.Scanner;

public class Calisan {
	public static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		
		ArrayList<Ogrenci> kisi=new ArrayList<Ogrenci>();
		while(true) {
			System.out.println("1-Kayıt giriş\n2-Listele\n3-Ortalama");
			byte menu=scanner.nextByte();
			switch (menu) {
			case 1:KayitGiris(kisi);				
				break;
			case 2:KayitListele(kisi);	break;
			case 3:Ortalama(kisi);	
			break;
			default:
				break;
			}
		}
	}
	private static void Ortalama(ArrayList<Ogrenci> kisi) {
		int toplam=0;
		
		for (Ogrenci ogrenci : kisi) {
			toplam+=ogrenci.getVn();
		}
		System.out.println("Vize Ortalaması :"+toplam/kisi.size());
	}
	private static void KayitListele(ArrayList<Ogrenci> kisi) {
		for (Ogrenci ogrenci : kisi) {
			System.out.println(ogrenci);
		}
		
	}
	private static void KayitGiris(ArrayList<Ogrenci> kisi) {
		System.out.println("İsim giriniz");
		String ad=scanner.next();
		System.out.println("Vize notu giriniz : ");
		byte vn=scanner.nextByte();
		System.out.println("Final notu giriniz : ");
		byte fn=scanner.nextByte();
		Ogrenci ogr=new Ogrenci(ad, vn, fn);
		kisi.add(ogr);
		System.out.println("Kayıt yapıldı");
	}

}
