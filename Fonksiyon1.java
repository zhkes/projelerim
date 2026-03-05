
public class Fonksiyon1 {

	public static void main(String[] args) {
		Selamlama();
		Selamlama();
		String ad="Ali";
		Selamla(ad);//fonksiyon çağarma
		Selamla("Ayşe");
		toplama(3,6);
		int x=10,y=20;
		int sonuc=Topla(x,y);
		System.out.println(x+" + "+y+" = "+sonuc);
		System.out.println("Program bitti");

	}
	private static int Topla(int x1, int x2) {
		System.out.println("parametreli ve geri dönüşlü fonksiyon");
		return x1+x2;
	}
	private static void toplama(int s1, int s2) {
		System.out.println("Parametreli fonksiyon");
		System.out.println(s1+" + "+s2+" = "+(s1+s2));
		return;
	}
	private static void Selamla(String isim) {
		System.out.println("Parametreli fonksiyon");
		System.out.println("Merhaba Ne haber? "+isim);
	}
	//fonksiyon tanımı
	public static void Selamlama() {
		System.out.println("Parametresiz fonksiyon");
		System.out.println("Merhaba Ne haber?");
	}

}
