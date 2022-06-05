package mobil1;

public class mobil1 {
	String warna;
	int jumlah_pintu;
	float isi_tangki;
	
	//getter
	public String getwarna() {
		return warna;
	}
	//setter
	public void setwarna(String colour) {
		warna = colour;
	}
	public static int maju(int maju) {
		int majukedepan = 10;
		majukedepan = majukedepan + maju;
		return (majukedepan);
	}
	public static int mundur (int mundur) {
		int mundurkebelakang = 10;
		mundurkebelakang = mundurkebelakang + mundur;
		return (mundurkebelakang);
	}
	public static int persegipanjang1(int panjang, int lebar) {
		int luas_persegipanjang = panjang * lebar;
		return (luas_persegipanjang);
	}
	public static float prisma(float panjang, float lebar, int tinggi) {
		float luas_prisma = (panjang*lebar*tinggi)/2;
		return (luas_prisma);
	}
	public static int persegi(int sisi) {
		int luas_persegi = sisi*2;
		return (luas_persegi);
	}
	
}
