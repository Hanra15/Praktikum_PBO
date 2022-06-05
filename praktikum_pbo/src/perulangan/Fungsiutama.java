package perulangan;
import java.util.Scanner;

public class Fungsiutama {
	public static String inputstr() {
		Scanner inputstr = new Scanner(System.in);
		String datatext = inputstr.next();
		return datatext;
	}
	public static int inputint() {
		Scanner inputint = new Scanner(System.in);
		int dataint = inputint.nextInt();
		return dataint;
	}
	public static long inputlong() {
		Scanner inputlong = new Scanner(System.in);
		long datalong = inputlong.nextLong();
		return datalong;
	}
	public static float inputfloat() {
		Scanner inputfloat = new Scanner(System.in);
		float datafloat = inputfloat.nextFloat();
		return datafloat;
	}
	public static void penilaian() {
		String nama, matkul, keterangan = null;
		float nilai = 0;
		long npm;
		//inputan user
				System.out.println("Masukan nama : ");
				nama = inputstr();
				
				System.out.println("Masukan npm : ");
				npm = inputlong();
				
				System.out.println("Masukan mata kuliah : ");
				matkul = inputstr();
				
				System.out.println("Masukan nilai : ");
				nilai = inputfloat();
				
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
