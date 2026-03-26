package Projeler;

public class Hata1 {

	public static void main(String[] args) {

		try {
			int yas = -5;
			if (yas < 0) {
				throw new IllegalAccessException("Yaş negatif olamaz!");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
