import java.util.ArrayList;
import java.util.Scanner;

public class Fonksiyon {
	static Scanner giris=new Scanner(System.in);
	static ArrayList<String> ad=new ArrayList<String>();
	static ArrayList<Boolean> medeniDurum=new ArrayList<Boolean>();
	static ArrayList<Byte> cocukSayisi=new ArrayList<Byte>();
	static ArrayList<Integer> brutMaas=new ArrayList<Integer>();
	static ArrayList<Integer> netMaas=new ArrayList<Integer>();
	public static byte Menu() {
		System.out.println("1-Veri giriş\n2-Listeleme\n3-İsim Arama\n4-ORtalama\n5-Evli bilgisi\n6-Kayıt Düzeltme\n7-Silme\n8-Çıkış");
		return giris.nextByte();
	}
	public static void KayitGiris() {
		System.out.println("İsim gir : ");
		ad.add(giris.next());
		boolean evlimi=MedeniDurumAl();
		medeniDurum.add(evlimi);
		System.out.println("Çocuk sayısı giriniz : ");
		byte cSayi=giris.nextByte();
		cocukSayisi.add(cSayi);
		System.out.println("Bürüt maaşı giriniz: ");
		int bmaas=giris.nextInt();
		if(evlimi) bmaas+=5000;
		bmaas+=cSayi*2500;
		brutMaas.add(bmaas);
		netMaas.add((int) (bmaas-bmaas*0.25));
	}
	private static boolean MedeniDurumAl() {
		System.out.println("Medeni durum Giriniz(E/B)");
		String veri=giris.next().toUpperCase();
		char karakter=veri.charAt(0);
		if(karakter=='E') return true;
		else if(karakter=='B')return false;
		else System.out.println("Hatalı giriş");
		return false;
	}
	public static void Listele() {
		System.out.println("Ad                  Medeni Durum Cocuk Sayısı Brüt Maaş Net Maaş");
		for (int i = 0; i < ad.size(); i++) {
			String durum=(medeniDurum.get(i))?"Evli":"Bekar";
			/*
			 * if (medeniDurum.get(i)==true)durum="Evli"; else durum="Bekar";
			 */
			System.out.printf("%-20s%1s%15d%15d%10d%n",ad.get(i),durum,cocukSayisi.get(i),brutMaas.get(i),netMaas.get(i));
		}
		
	}
	public static void IsimArama() {
		// TODO Auto-generated method stub
		
	}
	public static void Ortalama() {
		// TODO Auto-generated method stub
		
	}
	public static void EvliBilgisi() {
		// TODO Auto-generated method stub
		
	}
	public static void KayitDuzeltme() {
		// TODO Auto-generated method stub
		
	}
	public static void KayitSilme() {
		// TODO Auto-generated method stub
		
	}

}
