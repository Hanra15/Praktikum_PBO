package quiz;

public class Dosen extends Orang{
	private int nip;
	private String matkul;
	public Dosen(String nama) {
		super(nama);
	}
	public Dosen(String nama, int nip) {
		super(nama);
		this.nip=nip;
	}
	public Dosen(String nama, int nip, int umur) {
		super(nama,umur);
		this.nip=nip;
	}
	public Dosen(String nama, int nip, int umur, String matkul) {
		super(nama,umur);
		this.nip=nip;
		this.matkul=matkul;
	}
	public void info() {
		System.out.println("Nama Dosen : "+nama
						+"\nNIP : "+nip
						+"\nUmur : "+umur
						+"\nMata Kuliah : "+matkul);
	}
}
