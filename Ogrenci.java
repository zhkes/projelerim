package hafta4;

import java.util.LinkedList;
import java.util.Scanner;

public class Ogrenci {
	public static void main(String[] args) {
		int secim;
		do {
			secim=Fonksiyonlar.menu();
			switch (secim) {
			case 1:Fonksiyonlar.KayitGiris();break;
			case 2:Fonksiyonlar.Listeleme();break;
			case 3:Fonksiyonlar.IsimArama();break;
			case 4:Fonksiyonlar.Duzeltme();break;
			case 5:Fonksiyonlar.Silme();break;
			case 6:Fonksiyonlar.Ortalama();break;
			case 7:Fonksiyonlar.EnBuyuk();break;
			case 8:Fonksiyonlar.EnKucuk();break;
			case 9:System.out.println("Program Bitti");System.exit(0);
			default:System.out.println("Yanlış Menü Değeri");
				break;
			}
		}while(true);
	}

}


