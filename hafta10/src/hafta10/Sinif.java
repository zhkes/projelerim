package hafta10;

public class Sinif {

	public static void main(String[] args) {
		Ogrenci ogr1=new Ogrenci();//boş nesne
		System.out.println(ogr1);
		//ogr1.ad="Ali";
		ogr1.setAd("Ali");
		ogr1.setSoyad("Sal");
		ogr1.setDogumTarihi(2002);
		System.out.println(ogr1);
		ogr1.bilgileriGoster();
		Ogrenci ogr2=new Ogrenci("Nur","Yıldız",2003,50,60);
		ogr2.bilgileriGoster();
		System.out.println(ogr2);
		System.out.println(ogr2.getAd());
	}
}
