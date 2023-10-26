package praktikum1;

import java.util.Scanner;

public class Latihan {
	/**
	 * @param args
	 */
	public static void main(String args[]) {
		// System.out.println("Hello World");
		// inisialisasi variable
		int angka1, angka2, hasil;
		try (// inisialisasi input user
				Scanner input = new Scanner(System.in)) {
			// inputan user
			System.out.println("=======================");
			System.out.println("Program Tambah Angka");
			System.out.println("=======================");
			System.out.print("\nMasukkan Angka 1 : ");
			angka1 = input.nextInt();

			System.out.print("Masukkan Angka 2 : ");
			angka2 = input.nextInt();
			// hasil inputan
			hasil = angka1 + angka2;
			System.out.println("Hasilnya : " + hasil);

			String namaDepan, namaBelakang, fullName;
			System.out.println("\n=======================");
			System.out.println("Input Nama");
			System.out.println("=======================");
			System.out.print("Masukkan nama depan : ");
			namaDepan = input.next();
			System.out.print("Masukkan nama belakang : ");
			namaBelakang = input.next();
			fullName = namaDepan + " " + namaBelakang;
			System.out.println(fullName);
		}
	}
}
