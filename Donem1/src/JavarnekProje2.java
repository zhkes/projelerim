package sadds;

import java.util.Scanner;

public class JavarnekProje2 {

	public static void main(String[] args) {

		Scanner giris = new Scanner(System.in);
		System.out.println("Kişi sayısı: ");
		byte ks = giris.nextByte();
		String ad[] = new String[ks];
		short dakika[] = new short[ks];
		short sms[] = new short[ks];
		short internet[] = new short[ks];
		short fatura[] = new short[ks];
		float dakikaUcret = (float) 0.5, smsUcret = (float) 0.45, internetUcret = 20;
		
		for (int i = 0; i < ks; i++) {
			System.out.println((i+1)+". kişinin adını giriniz: ");
			ad[i]=giris.next();
			System.out.println("Kullanılan dakika: ");
			dakika[i]=giris.nextShort();
			System.out.println("Kullanılan sms: ");
			sms[i]=giris.nextShort();
			System.out.println("Kullanılan internet miktarı: ");
			internet[i]=giris.nextShort();
			fatura[i]=(short) (dakika[i]*dakikaUcret+sms[i]*smsUcret+internet[i]*internetUcret);
			
		}
		
		for (;;) {
			
			switch()
			
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
