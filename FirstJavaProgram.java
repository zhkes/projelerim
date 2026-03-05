
public class FirstJavaProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("BAŞARI NOTUNUZ");

		System.out.println("");

		String ad = "Hilal";

		byte vizeNot = 55, finalNot = 80;

		System.out.println("Adınız: " + ad);
		System.out.println("Vize Notunuz " + vizeNot);
		System.out.println("Final Notunuz: " + finalNot);

		byte basariNot = (byte) (vizeNot * 0.4 + finalNot * 0.6);
		System.out.println("Başarı Notunuz: " + basariNot);
		System.out.println("Program Bitti!");

	}

}
