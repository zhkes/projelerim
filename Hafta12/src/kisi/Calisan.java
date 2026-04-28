package kisi;

public class Calisan extends Kisi {
	private int  maas, calistigiYil;

	public int getMaas() {
		return maas;
	}

	public int getCalistigiYil() {
		return calistigiYil;
	}

	public Calisan(String ad, String soyad, int yas, int maas, int calistigiYil) {
		super(ad, soyad, yas);
		this.maas = maas;
		this.calistigiYil = calistigiYil;
	}

	@Override
	public String toString() {
		return super.toString()+"\nmaas : " + maas + "\ncalistigiYil : " + calistigiYil;
	}
	public void bilgiGoster() {
		super.bilgiGoster();
		System.out.println(" Maaş : "+maas);
	}
}
