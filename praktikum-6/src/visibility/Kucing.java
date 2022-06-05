package visibility;

public class Kucing {
	String nama;
	String warna;
	int berat;
	
	void isi_identitas(String namakucing, String warnakucing, int beratkucing) {
		nama = namakucing;
		warna = warnakucing;
		berat = beratkucing;
	}
	String ambilnama() {
		return nama;
	}
	String ambilwarna() {
		return warna;
	}
	int ambilberat() {
		return berat;
	}
}
