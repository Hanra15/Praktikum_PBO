package praktikum2;
import java.util.Scanner;
public class Switch_case {
	public static void main(String[]args) {
		//deklarasi
		Scanner input = new Scanner(System.in);
		String hurufpertama;
		//input user
		System.out.println("Masukan huruf pertama : ");
		hurufpertama = input.next();
		//pengkondisian
		switch(hurufpertama) {
			case "a":
				System.out.println("Nama anda pasti andi");
				break;
			case "b":
				System.out.println("Nama anda pasti budi");
				break;
			case "c":
				System.out.println("Nama anda pasti charles");
				break;
			default:
				System.out.println("masukan huruf a/b/c");
				break;
		}
		
		
		
	}
	
}
