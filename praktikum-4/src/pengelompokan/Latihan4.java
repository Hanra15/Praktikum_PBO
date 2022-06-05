package pengelompokan;

import java.util.Scanner;

public class Latihan4 {
	static int jumlahms,nama,npm,matkul,nilai;
	public static void main(String[]args) {
//		deklarasi scanner
		Scanner input = new Scanner(System.in);
//		deklarasi variable
		String[]nama = new String [20];
		String[]matkul = new String [20];
		String[]keterangan = new String[20];
		int[]npm = new int[20];
		float[]nilai = new float[20];
//		tampilan awal
		System.out.println("---------------------------------"
				+"\n"+ "Latihan ke-4"
				+"\n"+ "---------------------------------"
				+"\n"+"\n"+ "Masukan Jumlah Mahasiswa : "
				+"\n"+ ">> ");
		jumlahms = inputdata();
		
//		Looping function
		for(int i=0;i<=jumlahms;i++) {
			System.out.print("Masukan Nama : ");
			nama[i] = input.next();
			System.out.println("Masukan NPM : ");
			npm[i] = input.nextInt();
			System.out.println("Masukan Mata kuliah : ");
			matkul[i] = input.next();
			System.out.println("Masukan Nilai : ");
			nilai[i] = input.nextFloat();
			
			if(nilai[i]>=80) {
				keterangan[i] = "Lulus";
			}
			else if(nilai[i]>=60 && nilai[i]<=79) {
				keterangan[i] = "Remedial";
			}
			else if(nilai[i]<=59) {
				keterangan[i] = "Tidak Lulus";
			}
			System.out.println("\n\nNama :" +nama +"\n"
					+ "NPM : " +npm +"\n"
					+ "Mata Kuliah : " +matkul +"\n"
					+ "Nilai : " +nilai +"\n"
					+ "Keterangan : " +keterangan +"\n"
					+ "----------------------");
		}
		
	}
	private static int inputdata() {
		Scanner inputnew = new Scanner(System.in);
		int data = inputnew.nextInt();
		return data;
	}
	private static String inputdata1() {
		Scanner inputnew1 = new Scanner(System.in);
		String data1=inputnew1.next();
		return data1;
}

}
