package praktikum2;
import java.util.Scanner;

public class ifelse {
	public static void main(String[]args) {
		//deklarasi
		Scanner input = new Scanner(System.in);
		int angka;
		
		//input user
		System.out.println("masukan bilangan : ");
		angka = input.nextInt();
		
		//pengkondisian
//		pengkondisian lebih dari 5
//		if(angka > 5) {
//			System.out.println("Angka yang anda masukan lebih dari 5");
//		}
//		else {
//			System.out.println("Angka yang anda masukan kurang dari 5");
//		}
		
		//pengkondisian ganjil genap
		if(angka%2==0) {
			System.out.println("Angka yang anda masukan genap");
		}
		else {
			System.out.println("Angka yang anda masukan ganjil");
		}
		
	}
}
