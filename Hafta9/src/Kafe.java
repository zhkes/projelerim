
public class Kafe {

	public static void main(String[] args) {
		while(true) {
			byte menu=Fonksiyon.Menugoruntule();
			switch (menu) {
			case 0: System.out.println("Program bitti");System.exit(0);break;
			case 1: Fonksiyon.Kayit();break;
			case 2: Fonksiyon.CesitListele();break;
			case 3: Fonksiyon.Duzeltme();break;
			case 4: Fonksiyon.Silme();break;
			case 5: Fonksiyon.UrunSatis();break;
			case 6: Fonksiyon.UrunAlis();break;
			default:
				System.out.println("Yanlış Menü Değeri");
			}
		}

	}

}
