package pengkondisian;
import java.util.Scanner;
public class IF_2 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		int angka;
		System.out.println("masukan bilangan anda : ");
		angka = input.nextInt();
		if (angka > 5) {
			System.out.print("Angka yang anda masukan lebih dari 5");
		}
		else {
			System.out.print("Angka yang anda masukan kurang dari 5");
		}
	}
}
