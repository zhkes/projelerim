package hafta4;

import java.util.LinkedList;
import java.util.Scanner;

public class Fonksiyonlar {
	static LinkedList<String> ad=new LinkedList<String>();//tümü global değişken her yerden çağrılabilir
	static LinkedList<Byte> vizeNot=new LinkedList<Byte>();
	static LinkedList<Byte> finalNot=new LinkedList<Byte>();
	static LinkedList<Double> basariNot=new LinkedList<Double>();
	static Scanner scanner=new Scanner(System.in);

	public static int menu() {
		System.out.println("1-Kayıt giriş\n2-Listeleme\n3-İsim arama\n4-Kayıt Düzeltme\n5-Kayıt Silme\n6-Ortalama\n7-En Büyük\n8-En Küçük\n9-Çıkış");	
		int secim=scanner.nextInt();
		return secim;
	}

	public static void KayitGiris() {
		String isim=IsımKontrol();
		byte vn=SayiKontrol("Vize Notu Giriniz : ");
		byte fn=SayiKontrol("Final notu Giriniz : ");
		ad.add(isim);
		vizeNot.add(vn);
		finalNot.add(fn);
		basariNot.add(vn*.4+fn*.6);
		System.out.println(isim+" Kişisi eklendi");
	}

	private static byte SayiKontrol(String mesaj) {
		byte not=-1;
		while(true) {
			System.out.println(mesaj);
			not=scanner.nextByte();
			if (not>=0 && not<=100)
				return not;
			else System.out.println("0 ile 100 arası not giriniz : ");
		}
		
	}

	private static String IsımKontrol() {
		String ad="";
		while(true) {
			System.out.print("Öğrenci adı : ");
			ad=scanner.next().trim();
			if(ad.isEmpty())System.out.println("İsim boş geçilemez");
			else if(ad.length()<2)System.out.println("İsim en az 2 karakter olmalı");
			else if(!ad.matches("[a-zA-ZğışçöüÜĞŞİÇÖ]+"))System.out.println("sadece harflerden oluşmalı");
			else return ad;
		}
	}

	public static void Listeleme() {
		if(ad.isEmpty()) {
			System.out.println("Listeler boş");
			return;
		}
		for (int i = 0; i < ad.size(); i++) {
			System.out.println(ad.get(i)+"\t"+vizeNot.get(i)+"\t"+finalNot.get(i)+"\t"+basariNot.get(i));
		}
		
	}

	public static int IsimArama() {
		String arananAd=IsımKontrol();
		int i=ad.indexOf(arananAd);
		System.out.println("Adı : "+ad.get(i));
		System.out.println("Vize Notu : "+vizeNot.get(i));
		System.out.println("Final Notu : "+vizeNot.get(i));
		System.out.println("Başarı Notu : "+vizeNot.get(i));
		return i;
	}


	public static void Duzeltme() {
		int indis=IsimArama();
		String yeniIsim=IsımKontrol();
		byte yeniVize=SayiKontrol("Vize Notu Giriniz : ");
		byte yeniFinal=SayiKontrol("Final notu Giriniz : ");
		ad.set(indis, yeniIsim);
		vizeNot.set(indis, yeniVize);
		finalNot.set(indis, yeniFinal);
		basariNot.set(indis, yeniVize*.4+yeniFinal*0.6);
		System.out.println(yeniIsim+"Kaydı güncellendi");
	}

	public static void Silme() {
		// TODO Auto-generated method stub
		
	}

	public static void Ortalama() {
		// TODO Auto-generated method stub
		
	}

	public static void EnBuyuk() {
		// TODO Auto-generated method stub
		
	}

	public static void EnKucuk() {
		// TODO Auto-generated method stub
		
	}

}
