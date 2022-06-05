package pengelompokan;

import java.util.Scanner;

public class array {
	public static void percobaan(String[]args) {
		
//		definisi string tanpa array
		String nama1 = "farhan";
		String nama2 = "hanra";
		String nama3 = "rajab";
		String nama4 = "siti";
		String nama5 = "ningrum";
//		definisi string menggunakan array
		String [] nama = {"farhan","hanra","rajab","siti","ningrum"};
				
	}
//	penggunaan array
	static int [] larik = new int [25];
	static int ukuranlarik;
	public static void main(String[]args) {
		System.out.print("---------------------------------"
				+"\n"+"--Materi Array--"
				+"\n"+"---------------------------------"
				+"\n"+"\n"+"Berapa ukuran larik? "
				+"\n"+ ">> ");
		ukuranlarik = inputdata();
		for (int j=0; j<ukuranlarik; j++) {
			System.out.print("---------------------------------"
				+"\n"+"\n"+ "Masukan larik ke-" + (j+1)
				+"\n"+">> ");
			larik[j] = inputdata();
		}
		MAX();
		MIN();
		AVERAGE();
	}
//	method average
	private static void AVERAGE() {
		double average = 0.0;
		for(int avg=0;avg<ukuranlarik;avg++) {
			average = average + larik[avg];
		}
		average = average / ukuranlarik;
		System.out.println("Rata-rata bilangan = " + average);
	}
//	method min
	private static void MIN() {
		int minimal = larik[0];
		for(int min=0;min<ukuranlarik;min++) {
			if(minimal > larik[min]) {
				minimal = larik[min];
			}
		}
		System.out.println("Bilangan Terkecil = " + minimal);
	}
//	method max
	private static void MAX() {
		int maximal = 0;
		for(int max=0;max<ukuranlarik;max++) {
			if(maximal <larik[max]) {
				maximal = larik[max];
			}
		}
		System.out.println("---------------------------------"
				+"\n"+ "Bilangan Terbesar = " + maximal);
	}
//	method input data
	private static int inputdata() {
		Scanner inputangka = new Scanner (System.in);
		int data = inputangka.nextInt();
		return data;
	}
}
