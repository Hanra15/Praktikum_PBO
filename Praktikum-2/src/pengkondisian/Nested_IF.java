package pengkondisian;
import java.util.Scanner;
public class Nested_IF {
	public static void main (String[]args) {
		Scanner input = new Scanner(System.in);
		int angka;
		System.out.println("Masukan Angka : ");
		angka = input.nextInt();
		if(angka > 5) {
			if(angka%2==0) {
				System.out.println("Angka yang anda masukan lebih dari 5 dan genap");
			}
			else {
				System.out.println("Angka yang anda masukan lebih dari 5 dan ganjil");
			}
		}
		else {
			if(angka%2==0) {
				System.out.println("Angka yang anda masukan kurang dari 5 dan genap");
			}
			else {
				System.out.println("Angka yang anda masukan kurang dari 5 dan ganjil");
			}
		}
	}
}
