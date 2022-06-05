package pengkondisian;
import java.util.Scanner;
public class latihan {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		String nama,matkul,keterangan = null;
		float nilai = 0;
		int npm;
		System.out.print("Masukan Nama : ");
		nama = input.next();
		System.out.println("Masukan NPM : ");
		npm = input.nextInt();
		System.out.println("Masukan Mata kuliah : ");
		matkul = input.next();
		System.out.println("Masukan Nilai : ");
		nilai = input.nextFloat();
		
		if(nilai>=80) {
			keterangan = "Lulus";
		}
		else if(nilai>=60 && nilai<=79) {
			keterangan = "Remedial";
		}
		else if(nilai<=59) {
			keterangan = "Tidak Lulus";
		}
		System.out.println("\n\nNama :" +nama +"\n"
				+ "NPM : " +npm +"\n"
				+ "Mata Kuliah : " +matkul +"\n"
				+ "Nilai : " +nilai +"\n"
				+ "Keterangan : " +keterangan);
	}
}
	