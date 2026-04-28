package kisi;

public class Kisi {
	private String ad, soyad;
	private int yas;
	public Kisi(String ad, String soyad, int yas) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.yas = yas;
	}
	@Override
	public String toString() {
		return "\nad : " + ad + "\nsoyad : " + soyad + "\nyas : " + yas;
	}
	public int dtHesapla() {
		return 2026-this.yas;
	}
	public void bilgiGoster() {
		System.out.print("Adı : "+ad+" Soyadı : "+soyad);
	}
	public int getYas() {
		return yas;
	}
}
