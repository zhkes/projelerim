import java.util.Scanner;

public class VucutKutleEndeksi {
	public static void main(String[] args) {

		Scanner giris = new Scanner(System.in);

		double boy, kilo, vki;

		System.out.println("Boyunuzu metre cinsinden giriniz: ");
		boy = giris.nextDouble();
		System.out.println("Kilonuzu kg cinsinden giriniz: ");
		kilo = giris.nextDouble();

		vki = (double) (kilo / (boy * boy));

		System.out.println("VKİ değeriniz: " + vki);

		if (vki < 18.5)
			System.out.println("Zayıfsınız.");

		else if (vki >= 18.5 && vki <= 24.9)
			System.out.println("Sağlıklısınız.");

		else if (vki >= 25 && vki <= 29.9)
			System.out.println("Şişmansınız");

		else if (vki >= 30 && vki <= 39.9)
			System.out.println("Obezsiniz");

		else
			System.out.println("Aşırı Obezsiniz.(Morbid Obez)");
		
		
	System.out.println("\nProgram Bitmiştir.");
		
		
		
		
		
		
		

		// kendim yaptım "(vki >= 18.5 && vki <= 24.9)" kısmında takıldım

	}
}
