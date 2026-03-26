package Projeler;

public class HataTespiti {

	public static void main(String[] args) {

		int sayi = 0;
		int veri[] = { 3, 6, 2 };

		try {
			// sayi = 10 / 0; // Bu satır yorumda, açılırsa ArithmeticException verir.
			sayi = 10 / 2;
			System.out.println(veri[3]); // HATA: Dizi 3 elemanlı, 3. index yok!
		} 
		
		catch (ArithmeticException e) {
			sayi = 10 / 1;
			System.out.println("hata: " + e.getMessage());
			System.out.println("hata: " + e);
		}

		catch (ArrayIndexOutOfBoundsException e) {
			// Hata olduğunda dizinin son elemanını yazdırıyor
			System.out.println(veri[veri.length - 1]);
			System.out.println("Hata: " + e);
		}
		
		catch (Exception e) {
			// Diğer tüm beklenmedik hatalar için
			System.out.println("Tahmin Edilemeyen Hata: " + e);

		} 
		
		finally {
			// Hata olsa da olmasa da çalışan blok
			System.out.println("Her koşulda çalışır.");
		}
		System.out.println(sayi);
		System.out.println("program bitti.");

	}

}
