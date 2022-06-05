package perulangan;
import java.util.Scanner;

public class Nested_loop {
	public static void main(String[]args) {
		int ulang = inputdata();
		buatsegitiga(ulang);
		System.out.println("Angka yang anda masukan "+ulang);	
	}
	public static int inputdata() {
		System.out.println("Masukan Angka : ");
		Scanner input = new Scanner(System.in);
		int data = input.nextInt();
		return data;
	}
	private static void buatsegitiga(int ulang) {
		for(int i=1 ; i<=ulang ; i++) {
			for(int j=1 ; j<=(ulang-i) ; j++) {
				System.out.println(" ");
			}
			for(int k=1 ; k<=i ; k++) {
				System.out.println("#");
			}
			System.out.println("");
		}
	}
}