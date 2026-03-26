package sadds;

import java.util.Scanner;

public class Ornek11 {

	public static void main(String[] args) {
		
  Scanner giris=new Scanner(System.in);
  System.out.println("kaçın faktöriyeli alınacak?");		
  int faktoriyel=1;
  int sayi=giris.nextInt();
  for (int i = 2; i <=sayi; i++) {
	faktoriyel*=i;
}
  System.out.println(sayi+". faktöriyeli"+faktoriyel);
		
		
		
		
		
		
	}

}
