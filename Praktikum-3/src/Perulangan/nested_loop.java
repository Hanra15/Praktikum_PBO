package Perulangan;
import java.util.Scanner;
public class nested_loop {
	
	public static void main(String[]args) {
		int ulang = inputdata();
		buatsegitiga(ulang);
		System.out.print("Angka yang anda masukan "+ulang);
	}
//	input data dibuat methode untuk memudahkan pemakaian inputan berkali-kali
	public static int inputdata() {
		System.out.print("Masukan Angka : ");
		Scanner input = new Scanner(System.in);
		int data = input.nextInt();
		return data;
	}
	private static void buatsegitiga(int ulang) {
		for(int i=1; i<=ulang; i++) {
			for(int j=1; j<=(ulang-i); j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("#");
			}
		System.out.println("");
		}
	}
}
