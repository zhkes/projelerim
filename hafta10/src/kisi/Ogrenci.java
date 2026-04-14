package kisi;

public class Ogrenci {
	String ad;
	private byte vn, fn, bn;

	public Ogrenci(String ad, byte vn, byte fn) {
		super();
		this.ad = ad;
		this.vn = vn;
		this.fn = fn;
		this.bn = this.basariHesap();
	}
	
	public byte getVn() {
		return vn;
	}

	public byte getFn() {
		return fn;
	}

	public byte getBn() {
		return bn;
	}

	public String harfKarsiligi() {
		String harf="";
		if(bn<=30) harf="FF";
		else if (bn<=40) harf="DD";
		else if (bn<=50) harf="DC";
		else if (bn<=60) harf="CC";
		else if (bn<=70) harf="CB";
		else if (bn<=80) harf="BB";
		else if (bn<=90) harf="BA";
		else harf="AA";
		return harf;
	}
	public byte basariHesap() {
		return (byte) (vn * .4 + fn * .6);
	}

	@Override
	public String toString() {
		return "\nadı :" + ad + "\nVize Notu :" + vn + "\nFinal Notu :" + fn + "\nbaşarı notu :" + bn+"\nharf karşılığı : "+harfKarsiligi() ;
	}	
}
