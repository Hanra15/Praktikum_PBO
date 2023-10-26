package praktikum2;
import java.util.Scanner;

public class IfElse {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int angka;
		System.out.print("Masukan angka : ");
		angka = input.nextInt();
		
		if(angka < 5) {
			System.out.print("Angka yang dimasukkan kurang dari 5");
		} else {
			System.out.print("Angka yang dimasukkan lebih dari 5");
		}
	}
}
