package hafta10;

public class Ogrenci {
	private String ad;
	private String soyad;
	private int dogumTarihi;
	private byte vn, fn, bn;

	// kurucu fonksiyonlar
	public Ogrenci() {
		super();
		System.out.println("Boş kurucu fonksiyon");
	}
	public Ogrenci(String ad, String soyad, int dogumTarihi, int i, int j) {
		super();
		System.out.println("Verili kurucu fonksiyon");
		this.ad = ad;
		this.soyad = soyad;
		this.dogumTarihi = dogumTarihi;
		this.vn = (byte) i;
		this.fn = (byte) j;
	}
	
	

	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public int getDogumTarihi() {
		return dogumTarihi;
	}
	public void setDogumTarihi(int dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}
	public byte getVn() {
		return vn;
	}
	public void setVn(byte vn) {
		this.vn = vn;
	}
	public byte getFn() {
		return fn;
	}
	public void setFn(byte fn) {
		this.fn = fn;
	}
	@Override
	public String toString() {
		return "ad=" + ad + ", soyad=" + soyad + ", dogumTarihi=" + dogumTarihi + ", vn=" + vn + ", fn=" + fn + ", bn="
				+ basariNot();
	}

	public void bilgileriGoster() {
		System.out.println("Ad : " + ad);
		System.out.println("Soyad : " + soyad);
		System.out.println("Yaş : " + yasHesap());
		System.out.println("Başarı Notu : " + basariNot());
	}

	public byte basariNot() {
		return (byte) (vn * 0.4 + fn * 0.6);
	}

	public int yasHesap() {
		return 2026 - dogumTarihi;
	}
}