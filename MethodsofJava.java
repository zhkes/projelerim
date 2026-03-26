package Projeler;

public class MethodsofJava {

	public static void main(String[] args) {

		String cumle = "Okan Universitesi";
		String ad = "                ali                ";
		System.out.println("|" + ad + "|");
		System.out.println("|" + ad.trim() + "|");
		System.out.println("cumle.toUpperCase(): " + cumle.toUpperCase());
		System.out.println("cumle.toLowerCase(): " + cumle.toLowerCase());
		System.out.println("cumle.charAt(0): " + cumle.charAt(0));
		System.out.println("cumle.charAt(5): " + cumle.charAt(5));
		System.out.println("cumle.contains(\"üni\"): " + cumle.contains("üni"));
		System.out.println("cumle.contains(\"Üni\"): " + cumle.contains("Üni"));
		System.out.println("cumle.endsWith(\"si\"): " + cumle.endsWith("si"));
		System.out.println("cumle.indexOf(\"v\"): " + cumle.indexOf("v"));
		System.out.println("cumle.isEmpty(): " + cumle.isEmpty());
		System.out.println("cumle.length(): " + cumle.length());
		System.out.println("cumle.repeat(3): " + cumle.repeat(3));
		
		System.out.println("************");

		String kelime[] = cumle.split("i");

		for (int i = 0; i < kelime.length; i++) {
			System.out.println(kelime[i]);

		}
		
		System.out.println("************");

		String yeniCumle = cumle.replaceAll("i", "ı");
		System.out.println(yeniCumle);
		
		System.out.println("************");
		
		System.out.println(cumle.startsWith("Ok"));
		
		System.out.println("************");
		
		System.out.println(cumle.startsWith("ka"));
		
		System.out.println("************"); 
		
		String ad1 = "ali";
		String ad2 = "Ali";
		String ad11 = "ahmet";

	}

}
