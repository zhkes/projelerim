package kisi;

public class Ogrenci extends Kisi{
	private String numara, bolum;

	public Ogrenci(String ad, String soyad, int yas, String numara, String bolum) {
		super(ad, soyad, yas);
		this.numara = numara;
		this.bolum = bolum;
	}

	public String getNumara() {
		return numara;
	}

	@Override
	public String toString() {
		return super.toString()+"\nnumara : " + numara + "\nbolum :" + bolum;
	}
	public void bilgiGoster() {
		super.bilgiGoster();
		System.out.println(" Bölümü : "+bolum);
	}
}
