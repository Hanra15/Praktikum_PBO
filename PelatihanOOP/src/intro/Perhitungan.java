package intro;
import java.util.Scanner;
public class Perhitungan {
	public static int angka1, angka2, hasil;
	static Scanner input = new Scanner(System.in);
	public static void perkalian() {
		System.out.print("--- Perkalian ---\n");
		System.out.print("Masukan Angka 1 = ");
		angka1 = input.nextInt();
		System.out.print("Masukan Angka 2 = ");
		angka2 = input.nextInt();
		
		hasil = angka1 * angka2;
		System.out.println("Hasil Perkalian = "+hasil);
	}
	public static void pembagian() {		
		System.out.print("--- Pembagian ---\n");
		System.out.print("Masukan Angka 1 = ");
		angka1 = input.nextInt();
		System.out.print("Masukan Angka 2 = ");
		angka2 = input.nextInt();
		
		hasil = angka1 / angka2;
		System.out.println("Hasil Pembagian = "+hasil);
	}
	public static void penambahan() {		
		System.out.print("--- Penambahan ---\n");
		System.out.print("Masukan Angka 1 = ");
		angka1 = input.nextInt();
		System.out.print("Masukan Angka 2 = ");
		angka2 = input.nextInt();
		
		hasil = angka1 + angka2;
		System.out.println("Hasil Penambahan = "+hasil);
	}
	public static void pengurangan() {
		System.out.print("--- Pengurangan ---\n");
		System.out.print("Masukan Angka 1 = ");
		angka1 = input.nextInt();
		System.out.print("Masukan Angka 2 = ");
		angka2 = input.nextInt();
		
		hasil = angka1 - angka2;
		System.out.println("Hasil Pengurangan = "+hasil);
	}
		
}
