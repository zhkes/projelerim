package Projeler;

public class Hafta7Ornek1 {
	public static void main(String[] args) {
		while (true) {
			byte menu = Hafta7Ornek.Menu();

			switch (menu) {

			case 1:
				Hafta7Ornek.KayitGiris();
				break;
			case 2:
				Hafta7Ornek.Listele();
				break;
			case 3:
				Hafta7Ornek.IsimArama();
				break;
			case 4:
				Hafta7Ornek.Ortalama();
			
				break;
			case 5:
				Hafta7Ornek.EvliBilgisi();
				break;
			case 6:
				Hafta7Ornek.KayitDuzeltme();
				break;
			case 7:
				Hafta7Ornek.KayitSilme();
				break;
			case 8:
				System.out.println("PROGRAM BİTTİ!!");
				;
				break;
			default:
				System.out.println("YANLIŞ MENU DEĞERİ!!");
				break;

			}

		}

	}
}
