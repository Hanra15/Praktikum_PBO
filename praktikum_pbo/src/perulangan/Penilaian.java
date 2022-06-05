package perulangan;

public class Penilaian extends Fungsiutama{
	public static void main(String[]args) {
		int jumlahmhs;
		System.out.println("Masukan Jumlah Mahasiswa : ");
		jumlahmhs = inputint();
		for(int i=1;i<=jumlahmhs;i++) {
			penilaian();
		}
	}
}
