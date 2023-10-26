package pengkondisian;
import java.util.Scanner; 

public class If_function {
	public static void main(String[]args) {
		// inisialisasi
		int angka;
		Scanner input = new Scanner(System.in);
		
		// input user
		System.out.print("Masukan Angka = ");
		angka = input.nextInt();
		
		// pengkondisian
		if(angka > 5) {
			System.out.print("Angka yang anda masukan lebih dari 5");
		} else {
			System.out.print("Angka yang anda masukan kurang dari 5");
		}
		
	}

}
