package praktikum2;
import java.util.Scanner;

public class latihan_elseif {
	public static void main(String[]args) {
		//deklarasi
		Scanner input = new Scanner(System.in);
		String nama, matkul, keterangan = null;
		float nilai = 0;
		long npm;
		
		//inputan user
		System.out.println("Masukan nama : ");
		nama = input.next();
		
		System.out.println("Masukan npm : ");
		npm = input.nextLong();
		
		System.out.println("Masukan mata kuliah : ");
		matkul = input.next();
		
		System.out.println("Masukan nilai : ");
		nilai = input.nextFloat();
		
		//pengkondisian
		if(nilai >= 80) {
			keterangan = "Nilai sangat baik";
		}
		else if(nilai >=70 && nilai <=79) {
			keterangan = "Nilai baik";
		}
		else if(nilai >=60 && nilai <=69) {
			keterangan = "Nilai cukup";
		}
		else {
			keterangan = "Nilai kurang";
		}
		
		//output
		System.out.println("\nNama : " +nama + "\n"
							+ "NPM : " +npm + "\n"
							+ "Mata Kuliah : " +matkul + "\n"
							+ "Nilai : " +nilai + "\n"
							+ "Keterangan : "+keterangan );
		
	}
}
