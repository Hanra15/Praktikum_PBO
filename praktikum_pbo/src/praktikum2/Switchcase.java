package praktikum2;
import java.util.Scanner;

public class Switchcase {
	public static void main(String[]args) {
		//deklarasi
		Scanner input = new Scanner(System.in);
		String hurufpertama;
		
		//input user
		System.out.println("Masukan huruf pertama : ");
		hurufpertama = input.next();
		
		//pengkondisian
		switch (hurufpertama) {
			case "a":
				System.out.println("Nama anda pasti ardi");
				break;
			case "b":
				System.out.println("Nama anda pasti budi");
				break;
			case "c":
				System.out.println("Nama anda pasti charles");
				break;
			default:
				System.out.println("Masukan huruf a / b / c");
				break;
		}
	}
}
