import java.util.Scanner;

public class IfElsePractice {

	public static void main(String[] args) {
	

		Scanner Scanner = new Scanner(System.in);

		System.out.println("Yaşınızı Giriniz: ");

		
		int sayi = Scanner.nextInt();
		

		if (sayi < 18) {
			System.out.println("Bu mekana giremezsiniz!");
		}

		else {
			System.out.println("Bu mekana girebilirsiniz!");
		}

	}

}
