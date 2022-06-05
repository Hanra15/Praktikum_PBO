package visibility;

public class Aksi {
	public static void main(String[]args) {
		Kucing kucingsaya = new Kucing();
		kucingsaya.isi_identitas("Alleycat","Golden",4);
		
		System.out.println("Nama : "+kucingsaya.ambilnama());
		System.out.println("Warna : "+kucingsaya.ambilwarna());
		System.out.println("Berat : "+kucingsaya.ambilberat());
	}
}
