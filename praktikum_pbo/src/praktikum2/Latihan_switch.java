package praktikum2;
import java.util.Scanner;

public class Latihan_switch {
	public static void main(String[]args) {
		//deklarasi
			Scanner input = new Scanner(System.in);
			String nama, matkul, keterangan = null;
			int nilai = 0;
			long npm;
				
		//inputan user
			System.out.println("Masukan nama : ");
			nama = input.next();
				
			System.out.println("Masukan npm : ");
			npm = input.nextLong();
				
			System.out.println("Masukan mata kuliah : ");
			matkul = input.next();
				
			System.out.println("Masukan nilai : ");
			nilai = input.nextInt();
			
		//pengkondisian
			switch(nilai) {
				case 80:
					keterangan = "Nilai sangat baik";
					break;
				case 70:
					keterangan = "Nilai baik";
					break;
				case 60:
					keterangan = "Nilai cukup";
					break;
				default:
					keterangan = "masukan nilai antara 80 / 70 / 60";
					break;
			}
			
		//output
			System.out.println("\nNama : " +nama + "\n"
								+ "NPM : " +npm + "\n"
								+ "Mata Kuliah : " +matkul + "\n"
								+ "Nilai : " +nilai + "\n"
								+ "Keterangan : "+keterangan );
	}
}
