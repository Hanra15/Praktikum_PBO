package praktikum2;
import java.util.Scanner;

public class PengkondisianSwitch {
	public static void main(String args[]) {
//		inisialisasi
		int angka1, angka2, hasil;
		String perhitungan;
		Scanner input = new Scanner(System.in);
//		input user
		System.out.print("Masukkan Angka 1: ");
		angka1 = input.nextInt();
		System.out.print("Masukkan Angka 2: ");
		angka2 = input.nextInt();
		System.out.print("List Perhitungan: "
				+ "\n + : pertambahan"
				+ "\n - : pengurangan"
				+ "\n * : perkalian"
				+ "\n / : pembagian"
				+ "\n Masukkan angka perhitungan : ");
		perhitungan = input.next();
//		Kondisi SWITCH
		switch(perhitungan) {
		case "+":
			hasil = angka1 + angka2;
			System.out.println("Hasilnya adalah : "+hasil);
			break;
		case "-":
			hasil = angka1 - angka2;
			System.out.println("Hasilnya adalah : "+hasil);
			break;
		case "*":
			hasil = angka1 * angka2;
			System.out.println("Hasilnya adalah : "+hasil);
			break;
		case "/":
			hasil = angka1 / angka2;
			System.out.println("Hasilnya adalah : "+hasil);
			break;
		default:
			System.out.println("Simbol yang dimasukkan salah!");
			
		}
	}
}
