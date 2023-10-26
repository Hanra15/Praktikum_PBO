package praktikum2;
import java.util.Scanner;
public class SwitchCase {
	public static void main(String args[]) {
//		inisialisasi
		Scanner input = new Scanner(System.in);
		int angka1, angka2, hasil;
		String perhitungan;
//		input user
		System.out.print("Masukkan angka 1 : ");
		angka1 = input.nextInt();
		System.out.print("Masukkan angka 2 : ");
		angka2 = input.nextInt();
//		input perhitungan
		System.out.print("List Perhitungan : "
				+ "\n + : Pertambahan"
				+ "\n - : Pengurangan"
				+ "\n * : Perkalian"
				+ "\n / : pembagian"
				+ "\n masukkan simbol perhitungan : ");
		perhitungan = input.next();
//		pengkondisian switch
		switch(perhitungan) {
			case "+":
				hasil = angka1 + angka2;
				System.out.println("hasilnya adalah : "+hasil);
				break;
			case "-":
				hasil = angka1 - angka2;
				System.out.println("hasilnya adalah : "+hasil);
				break;
			case "*":
				hasil = angka1 * angka2;
				System.out.println("hasilnya adalah : "+hasil);
				break;
			case "/":
				hasil = angka1 / angka2;
				System.out.println("hasilnya adalah : "+hasil);
				break;
			default :
				System.out.print("Simbol Tidak Sesuai!");
				break;
		}
		
	}
}
