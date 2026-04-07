import java.util.Scanner;

public class Recursivefonksiyon {
	public static void main(String[] args) {
		Scanner giris=new Scanner(System.in);
		System.out.println("KAçın faktöriyeli alınacak : ");
		int sayi=giris.nextInt();
		int sonuc=ForDongu(sayi);
		System.out.println("For Döngü ile sonuç : "+sonuc);
		int rSonuc=RecursiveDongu(sayi);
		System.out.println("Recursive Fonksiyon ile sonuç : "+rSonuc);
	}

	private static int RecursiveDongu(int sayi) {
		if(sayi<=1) return 1;
		else return sayi*RecursiveDongu(sayi-1);
	}

	private static int ForDongu(int sayi) {
		int sonuc=1;
		for (int i = sayi; i > 1; i--) {
			sonuc*=i;
		}
		return sonuc;
	}
}
