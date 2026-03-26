import java.util.Scanner;

public class NotOrtalama {

	public static void main(String[] args) {

		Scanner giris = new Scanner(System.in);
		byte vn, fn, bn, ks = 0;
		short vnTop = 0, fnTop = 0, bnTop = 0;
		byte devam;

		do {

			System.out.println("Vize notunuzu giriniz: ");
			vn = giris.nextByte();
			System.out.println("Final notunuzu giriniz: ");
			fn = giris.nextByte();

			bn = (byte) ((vn + fn) / 2);

			System.out.println("Başarı notun: " + bn);
			System.out.println("Devam edecek misiniz? (1/0)");
			devam = giris.nextByte();

			vnTop = (short) (vnTop + vn);
			fnTop += fn;
			bnTop += bn;
			ks++;

		} while (devam == 1);

		System.out.println("Vize not toplamı: " + vnTop);
		System.out.println("Vize not ortalaması: " + vnTop / ks);
		System.out.println("Final not toplamı: " + fnTop);
		System.out.println("Final not ortalaması: " + fnTop / ks);
		System.out.println("Başarı not toplamı: " + bnTop);
		System.out.println("Başarı not ortalaması: " + bnTop / ks);

	}

}
