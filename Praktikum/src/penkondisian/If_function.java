package penkondisian;
import java.util.Scanner;
public class If_function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int angka;
		System.out.print("Masukan Angka : ");
		angka = input.nextInt();
		if(angka > 5 ) {
			System.out.print("Angka yang anda masukan lebih dari 5");
		} else {
			System.out.print("Angka yang anda masukan kurang dari 5");
		}

	}

}
