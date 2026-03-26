
import java.util.Scanner;

public class Vergi {

	public static void main(String[] args) {

		Scanner giris = new Scanner(System.in);

		int brutMaas, gv, dv, netMaas;

		System.out.println("brüt maaşınızı giriniz: ");
		brutMaas = giris.nextInt();

		dv = (int) (brutMaas * 0.004);

		if (brutMaas <= 3000)
			gv = (int) (brutMaas * 0.15);
		
		else if(brutMaas>=5000)
			gv = (int) (brutMaas * 0.20);
		
		else
			gv = (int) (brutMaas * 0.25);
		
		netMaas=(int) (brutMaas-(gv+dv));
		
		System.out.println("Toplam Vergileriniz: "+ (gv+dv));
		System.out.println("Net mMaaşınız: "+netMaas);
		

	}

}
