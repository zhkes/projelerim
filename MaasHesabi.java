
public class MaasHesabi {

	public static void main(String[] args) {
		while(true) {
			byte menu=Fonksiyon.Menu();
			switch (menu) {
			case 1:Fonksiyon.KayitGiris(); break;
			case 2:Fonksiyon.Listele(); break;
			case 3:Fonksiyon.IsimArama(); break;
			case 4:Fonksiyon.Ortalama(); break;
			case 5:Fonksiyon.EvliBilgisi(); break;
			case 6:Fonksiyon.KayitDuzeltme(); break;
			case 7:Fonksiyon.KayitSilme(); break;
			case 8:System.out.println("Program Bitti"); break;
			default:System.out.println("Yanlış Menü Değeri");
				break;
			}
		}
	}
}
